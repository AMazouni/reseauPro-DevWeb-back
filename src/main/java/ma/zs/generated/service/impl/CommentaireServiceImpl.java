package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Commentaire;
import ma.zs.generated.bean.Publication;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.dao.CommentaireDao;
import ma.zs.generated.service.facade.CommentaireService;
import ma.zs.generated.service.facade.UtilisateurService;   
import ma.zs.generated.service.facade.PublicationService;   

import ma.zs.generated.ws.rest.provided.vo.CommentaireVo;
import ma.zs.generated.service.util.*;
@Service
public class CommentaireServiceImpl implements CommentaireService {

   @Autowired
   private CommentaireDao commentaireDao;
   
    @Autowired
    private UtilisateurService utilisateurService ;
    @Autowired
    private PublicationService publicationService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Commentaire> findAll(){
		return commentaireDao.findAll();
	}	
	@Override
	public List<Commentaire> findByPublicationRef(String ref){
		return commentaireDao.findByPublicationRef(ref);
	}
	@Override
	@Transactional
    public int deleteByPublicationRef(String ref){
		return commentaireDao.deleteByPublicationRef(ref);
	}
	
     @Override
    public List<Commentaire> findByPublicationId(Long id){
		return commentaireDao.findByPublicationId(id);

	}
	   @Override
	   @Transactional
    public int deleteByPublicationId(Long id){
		return commentaireDao.deleteByPublicationId(id);

	}
     		
	@Override
	public List<Commentaire> findByPosteParEmail(String email){
		return commentaireDao.findByPosteParEmail(email);
	}
	@Override
	@Transactional
    public int deleteByPosteParEmail(String email){
		return commentaireDao.deleteByPosteParEmail(email);
	}
	
     @Override
    public List<Commentaire> findByPosteParId(Long id){
		return commentaireDao.findByPosteParId(id);

	}
	   @Override
	   @Transactional
    public int deleteByPosteParId(Long id){
		return commentaireDao.deleteByPosteParId(id);

	}
     		
	@Override
	public Commentaire findByComref(String comref){
		if( comref==null)
		  return null;
		return commentaireDao.findByComref(comref);
	}

   

	@Override
	@Transactional
	public int deleteByComref(String  comref) {
		return commentaireDao.deleteByComref(comref);	 
	}

	@Override
	public Commentaire findById(Long id){
		 if(id==null)
		  return null;
		return commentaireDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           commentaireDao.deleteById(id);
   }
	@Override	
	public Commentaire save (Commentaire commentaire){
			Commentaire foundedCommentaire = findByComref(commentaire.getComref());
	       if(foundedCommentaire!=null)
	          return null;  
	    
	          if(commentaire.getPublication()!=null){
				    Publication publication = publicationService.findByRef(commentaire.getPublication().getRef());
				  if(publication == null)
				  commentaire.setPublication(publicationService.save(commentaire.getPublication()));
				  else
				  commentaire.setPublication(publication);
			  }
	    
	          if(commentaire.getPostePar()!=null){
				    Utilisateur postePar = utilisateurService.findByEmail(commentaire.getPostePar().getEmail());
				  if(postePar == null)
				  commentaire.setPostePar(utilisateurService.save(commentaire.getPostePar()));
				  else
				  commentaire.setPostePar(postePar);
			  }

	    Commentaire savedCommentaire = commentaireDao.save(commentaire);
	   return savedCommentaire;
	}

    @Override
    public List<Commentaire> save(List<Commentaire> commentaires){
		List<Commentaire> list = new ArrayList<Commentaire>();
		for(Commentaire commentaire: commentaires){
		        list.add(save(commentaire));	
		}
		return list;
	}


   @Override
   public Commentaire update(Commentaire commentaire){
     
    
		  Commentaire foundedCommentaire = findById(commentaire.getId()); 
		       if(foundedCommentaire==null)
	          return null;	  
	  
	   return  commentaireDao.save(commentaire);
     
     }
    
	@Override
	@Transactional
	public int delete(Commentaire commentaire){

	        if(commentaire.getComref()==null)
			  return -1;
		
			Commentaire foundedCommentaire = findByComref(commentaire.getComref());
	       if(foundedCommentaire==null)
	          return -1;  
	   commentaireDao.delete(foundedCommentaire);
	   return 1;
	}


	public List<Commentaire> findByCriteria(CommentaireVo commentaireVo){
      String query = "SELECT o FROM Commentaire o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "comref","LIKE",commentaireVo.getComref());

			 query += SearchUtil.addConstraint( "o", "contenu","LIKE",commentaireVo.getContenu());

		 	 query += SearchUtil.addConstraint( "o", "id","=",commentaireVo.getId());
   if(commentaireVo.getPublicationVo()!=null){
     query += SearchUtil.addConstraint( "o", "publication.id","=",commentaireVo.getPublicationVo().getId());
     query += SearchUtil.addConstraint( "o", "publication.ref","LIKE",commentaireVo.getPublicationVo().getRef());
   }
   
   if(commentaireVo.getPosteParVo()!=null){
     query += SearchUtil.addConstraint( "o", "postePar.id","=",commentaireVo.getPosteParVo().getId());
     query += SearchUtil.addConstraint( "o", "postePar.email","LIKE",commentaireVo.getPosteParVo().getEmail());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
