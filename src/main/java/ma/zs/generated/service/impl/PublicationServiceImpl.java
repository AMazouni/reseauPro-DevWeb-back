package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Publication;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.bean.Commentaire;
import ma.zs.generated.dao.PublicationDao;
import ma.zs.generated.service.facade.PublicationService;
import ma.zs.generated.service.facade.CommentaireService;   
import ma.zs.generated.service.facade.UtilisateurService;   

import ma.zs.generated.ws.rest.provided.vo.PublicationVo;
import ma.zs.generated.service.util.*;
@Service
public class PublicationServiceImpl implements PublicationService {

   @Autowired
   private PublicationDao publicationDao;
   
    @Autowired
    private CommentaireService commentaireService ;
    @Autowired
    private UtilisateurService utilisateurService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Publication> findAll(){
		return publicationDao.findAll();
	}	
	@Override
	public List<Publication> findByPosteParEmail(String email){
		return publicationDao.findByPosteParEmail(email);
	}
	@Override
	@Transactional
    public int deleteByPosteParEmail(String email){
		return publicationDao.deleteByPosteParEmail(email);
	}
	
     @Override
    public List<Publication> findByPosteParId(Long id){
		return publicationDao.findByPosteParId(id);

	}
	   @Override
	   @Transactional
    public int deleteByPosteParId(Long id){
		return publicationDao.deleteByPosteParId(id);

	}
     		
	@Override
	public Publication findByRef(String ref){
		if( ref==null)
		  return null;
		return publicationDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return publicationDao.deleteByRef(ref);	 
	}

	@Override
	public Publication findById(Long id){
		 if(id==null)
		  return null;
		return publicationDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           publicationDao.deleteById(id);
   }
	@Override	
	public Publication save (Publication publication){
			Publication foundedPublication = findByRef(publication.getRef());
	       if(foundedPublication!=null)
	          return null;  
	    
	          if(publication.getPostePar()!=null){
				    Utilisateur postePar = utilisateurService.findByEmail(publication.getPostePar().getEmail());
				  if(postePar == null)
				  publication.setPostePar(utilisateurService.save(publication.getPostePar()));
				  else
				  publication.setPostePar(postePar);
			  }

	    Publication savedPublication = publicationDao.save(publication);
               if(ListUtil.isNotEmpty(publication.getCommentaire())){
		  savedPublication.setCommentaire(commentaireService.save(prepareCommentaire(savedPublication,publication.getCommentaire())));
		 }
	   return savedPublication;
	}

    @Override
    public List<Publication> save(List<Publication> publications){
		List<Publication> list = new ArrayList<Publication>();
		for(Publication publication: publications){
		        list.add(save(publication));	
		}
		return list;
	}

     private List<Commentaire> prepareCommentaire(Publication publication,List<Commentaire> commentaires){
		    for(Commentaire commentaire:commentaires ){
                  commentaire.setPublication(publication); 
			}
			return commentaires;
	  }

   @Override
   public Publication update(Publication publication){
     
    
		  Publication foundedPublication = findById(publication.getId()); 
		       if(foundedPublication==null)
	          return null;	  
	  
	   return  publicationDao.save(publication);
     
     }
    
	@Override
	@Transactional
	public int delete(Publication publication){

	        if(publication.getRef()==null)
			  return -1;
		
			Publication foundedPublication = findByRef(publication.getRef());
	       if(foundedPublication==null)
	          return -1;  
	   publicationDao.delete(foundedPublication);
	   return 1;
	}


	public List<Publication> findByCriteria(PublicationVo publicationVo){
      String query = "SELECT o FROM Publication o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "contenu","LIKE",publicationVo.getContenu());

		 	 query += SearchUtil.addConstraint( "o", "verified","=",publicationVo.getVerified());
			 query += SearchUtil.addConstraint( "o", "ref","LIKE",publicationVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",publicationVo.getId());
   if(publicationVo.getPosteParVo()!=null){
     query += SearchUtil.addConstraint( "o", "postePar.id","=",publicationVo.getPosteParVo().getId());
     query += SearchUtil.addConstraint( "o", "postePar.email","LIKE",publicationVo.getPosteParVo().getEmail());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
