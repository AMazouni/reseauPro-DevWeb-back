package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.bean.AdminInfo;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.ProfesseurInfo;
import ma.zs.generated.bean.Reponse;
import ma.zs.generated.bean.Message;
import ma.zs.generated.bean.Message;
import ma.zs.generated.bean.Commentaire;
import ma.zs.generated.bean.Publication;
import ma.zs.generated.dao.UtilisateurDao;
import ma.zs.generated.service.facade.UtilisateurService;
import ma.zs.generated.service.facade.ProfesseurInfoService;   
import ma.zs.generated.service.facade.MessageService;   
import ma.zs.generated.service.facade.AdminInfoService;   
import ma.zs.generated.service.facade.EtudiantInfoService;   
import ma.zs.generated.service.facade.CommentaireService;   
import ma.zs.generated.service.facade.ReponseService;   
import ma.zs.generated.service.facade.PublicationService;   

import ma.zs.generated.ws.rest.provided.vo.UtilisateurVo;
import ma.zs.generated.service.util.*;
@Service
public class UtilisateurServiceImpl implements UtilisateurService {

   @Autowired
   private UtilisateurDao utilisateurDao;
   
    @Autowired
    private ProfesseurInfoService professeurInfoService ;
    @Autowired
    private MessageService messageService ;
    @Autowired
    private AdminInfoService adminInfoService ;
    @Autowired
    private EtudiantInfoService etudiantInfoService ;
    @Autowired
    private CommentaireService commentaireService ;
    @Autowired
    private ReponseService reponseService ;
    @Autowired
    private PublicationService publicationService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Utilisateur> findAll(){
		return utilisateurDao.findAll();
	}	
	@Override
	public List<Utilisateur> findByAdminInfoNom(String nom){
		return utilisateurDao.findByAdminInfoNom(nom);
	}
	@Override
	@Transactional
    public int deleteByAdminInfoNom(String nom){
		return utilisateurDao.deleteByAdminInfoNom(nom);
	}
	
     @Override
    public List<Utilisateur> findByAdminInfoId(Long id){
		return utilisateurDao.findByAdminInfoId(id);

	}
	   @Override
	   @Transactional
    public int deleteByAdminInfoId(Long id){
		return utilisateurDao.deleteByAdminInfoId(id);

	}
     		
	@Override
	public List<Utilisateur> findByLaureatInfoCne(String cne){
		return utilisateurDao.findByLaureatInfoCne(cne);
	}
	@Override
	@Transactional
    public int deleteByLaureatInfoCne(String cne){
		return utilisateurDao.deleteByLaureatInfoCne(cne);
	}
	
     @Override
    public List<Utilisateur> findByLaureatInfoId(Long id){
		return utilisateurDao.findByLaureatInfoId(id);

	}
	   @Override
	   @Transactional
    public int deleteByLaureatInfoId(Long id){
		return utilisateurDao.deleteByLaureatInfoId(id);

	}
     		
	@Override
	public List<Utilisateur> findByEtudiantInfoCne(String cne){
		return utilisateurDao.findByEtudiantInfoCne(cne);
	}
	@Override
	@Transactional
    public int deleteByEtudiantInfoCne(String cne){
		return utilisateurDao.deleteByEtudiantInfoCne(cne);
	}
	
     @Override
    public List<Utilisateur> findByEtudiantInfoId(Long id){
		return utilisateurDao.findByEtudiantInfoId(id);

	}
	   @Override
	   @Transactional
    public int deleteByEtudiantInfoId(Long id){
		return utilisateurDao.deleteByEtudiantInfoId(id);

	}
     		
	@Override
	public List<Utilisateur> findByProfesseurInfoCode(String code){
		return utilisateurDao.findByProfesseurInfoCode(code);
	}
	@Override
	@Transactional
    public int deleteByProfesseurInfoCode(String code){
		return utilisateurDao.deleteByProfesseurInfoCode(code);
	}
	
     @Override
    public List<Utilisateur> findByProfesseurInfoId(Long id){
		return utilisateurDao.findByProfesseurInfoId(id);

	}
	   @Override
	   @Transactional
    public int deleteByProfesseurInfoId(Long id){
		return utilisateurDao.deleteByProfesseurInfoId(id);

	}
     		
	@Override
	public List<Utilisateur> findByReponsesReponse(String reponse){
		return utilisateurDao.findByReponsesReponse(reponse);
	}
	@Override
	@Transactional
    public int deleteByReponsesReponse(String reponse){
		return utilisateurDao.deleteByReponsesReponse(reponse);
	}
	
     @Override
    public List<Utilisateur> findByReponsesId(Long id){
		return utilisateurDao.findByReponsesId(id);

	}
	   @Override
	   @Transactional
    public int deleteByReponsesId(Long id){
		return utilisateurDao.deleteByReponsesId(id);

	}
     		
	@Override
	public Utilisateur findByEmail(String email){
		if( email==null)
		  return null;
		return utilisateurDao.findByEmail(email);
	}

   

	@Override
	@Transactional
	public int deleteByEmail(String  email) {
		return utilisateurDao.deleteByEmail(email);	 
	}

	@Override
	public Utilisateur findById(Long id){
		 if(id==null)
		  return null;
		return utilisateurDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           utilisateurDao.deleteById(id);
   }
	@Override	
	public Utilisateur save (Utilisateur utilisateur){
			Utilisateur foundedUtilisateur = findByEmail(utilisateur.getEmail());
	       if(foundedUtilisateur!=null)
	          return null;  
	    
	          if(utilisateur.getAdminInfo()!=null){
				    AdminInfo adminInfo = adminInfoService.findByNom(utilisateur.getAdminInfo().getNom());
				  if(adminInfo == null)
				  utilisateur.setAdminInfo(adminInfoService.save(utilisateur.getAdminInfo()));
				  else
				  utilisateur.setAdminInfo(adminInfo);
			  }
	    
	          if(utilisateur.getLaureatInfo()!=null){
				    EtudiantInfo laureatInfo = etudiantInfoService.findByCne(utilisateur.getLaureatInfo().getCne());
				  if(laureatInfo == null)
				  utilisateur.setLaureatInfo(etudiantInfoService.save(utilisateur.getLaureatInfo()));
				  else
				  utilisateur.setLaureatInfo(laureatInfo);
			  }
	    
	          if(utilisateur.getEtudiantInfo()!=null){
				    EtudiantInfo etudiantInfo = etudiantInfoService.findByCne(utilisateur.getEtudiantInfo().getCne());
				  if(etudiantInfo == null)
				  utilisateur.setEtudiantInfo(etudiantInfoService.save(utilisateur.getEtudiantInfo()));
				  else
				  utilisateur.setEtudiantInfo(etudiantInfo);
			  }
	    
	          if(utilisateur.getProfesseurInfo()!=null){
				    ProfesseurInfo professeurInfo = professeurInfoService.findByCode(utilisateur.getProfesseurInfo().getCode());
				  if(professeurInfo == null)
				  utilisateur.setProfesseurInfo(professeurInfoService.save(utilisateur.getProfesseurInfo()));
				  else
				  utilisateur.setProfesseurInfo(professeurInfo);
			  }
	    
	          if(utilisateur.getReponses()!=null){
				    Reponse reponses = reponseService.findByReponse(utilisateur.getReponses().getReponse());
				  if(reponses == null)
				  utilisateur.setReponses(reponseService.save(utilisateur.getReponses()));
				  else
				  utilisateur.setReponses(reponses);
			  }

	    Utilisateur savedUtilisateur = utilisateurDao.save(utilisateur);
               if(ListUtil.isNotEmpty(utilisateur.getMessagesRecus())){
		  savedUtilisateur.setMessagesRecus(messageService.save(prepareMessagesRecus(savedUtilisateur,utilisateur.getMessagesRecus())));
		 }
               if(ListUtil.isNotEmpty(utilisateur.getMessagesEnvoye())){
		  savedUtilisateur.setMessagesEnvoye(messageService.save(prepareMessagesEnvoye(savedUtilisateur,utilisateur.getMessagesEnvoye())));
		 }
               if(ListUtil.isNotEmpty(utilisateur.getComRediges())){
		  savedUtilisateur.setComRediges(commentaireService.save(prepareComRediges(savedUtilisateur,utilisateur.getComRediges())));
		 }
               if(ListUtil.isNotEmpty(utilisateur.getPublicationsRediges())){
		  savedUtilisateur.setPublicationsRediges(publicationService.save(preparePublicationsRediges(savedUtilisateur,utilisateur.getPublicationsRediges())));
		 }
	   return savedUtilisateur;
	}

    @Override
    public List<Utilisateur> save(List<Utilisateur> utilisateurs){
		List<Utilisateur> list = new ArrayList<Utilisateur>();
		for(Utilisateur utilisateur: utilisateurs){
		        list.add(save(utilisateur));	
		}
		return list;
	}

     private List<Message> prepareMessagesRecus(Utilisateur utilisateur,List<Message> messages){
		    for(Message message:messages ){
                  message.getDestinataire().add(utilisateur);
			}
			return messages;
	  }
     private List<Message> prepareMessagesEnvoye(Utilisateur utilisateur,List<Message> messages){
		    for(Message message:messages ){
                  message.setEmetteur(utilisateur); 
			}
			return messages;
	  }
     private List<Commentaire> prepareComRediges(Utilisateur utilisateur,List<Commentaire> commentaires){
		    for(Commentaire commentaire:commentaires ){
                  commentaire.setPostePar(utilisateur); 
			}
			return commentaires;
	  }
     private List<Publication> preparePublicationsRediges(Utilisateur utilisateur,List<Publication> publications){
		    for(Publication publication:publications ){
                  publication.setPostePar(utilisateur); 
			}
			return publications;
	  }

   @Override
   public Utilisateur update(Utilisateur utilisateur){
     
    
		  Utilisateur foundedUtilisateur = findById(utilisateur.getId()); 
		       if(foundedUtilisateur==null)
	          return null;	  
	  
	   return  utilisateurDao.save(utilisateur);
     
     }
    
	@Override
	@Transactional
	public int delete(Utilisateur utilisateur){

	        if(utilisateur.getEmail()==null)
			  return -1;
		
			Utilisateur foundedUtilisateur = findByEmail(utilisateur.getEmail());
	       if(foundedUtilisateur==null)
	          return -1;  
	   utilisateurDao.delete(foundedUtilisateur);
	   return 1;
	}


	public List<Utilisateur> findByCriteria(UtilisateurVo utilisateurVo){
      String query = "SELECT o FROM Utilisateur o where 1=1 ";
		 	 query += SearchUtil.addConstraint( "o", "verified","=",utilisateurVo.getVerified());
			 query += SearchUtil.addConstraint( "o", "about","LIKE",utilisateurVo.getAbout());

	  query += SearchUtil.addConstraintDate( "o", "dateNaissance","=",utilisateurVo.getDateNaissance());
		 	 query += SearchUtil.addConstraint( "o", "profilVisible","=",utilisateurVo.getProfilVisible());
			 query += SearchUtil.addConstraint( "o", "tel","LIKE",utilisateurVo.getTel());

			 query += SearchUtil.addConstraint( "o", "password","LIKE",utilisateurVo.getPassword());

			 query += SearchUtil.addConstraint( "o", "role","LIKE",utilisateurVo.getRole());

			 query += SearchUtil.addConstraint( "o", "email","LIKE",utilisateurVo.getEmail());

		 	 query += SearchUtil.addConstraint( "o", "id","=",utilisateurVo.getId());
	  query += SearchUtil.addConstraintMinMaxDate("o","dateNaissance",utilisateurVo.getDateNaissanceMin(),utilisateurVo.getDateNaissanceMax());
   if(utilisateurVo.getAdminInfoVo()!=null){
     query += SearchUtil.addConstraint( "o", "adminInfo.id","=",utilisateurVo.getAdminInfoVo().getId());
     query += SearchUtil.addConstraint( "o", "adminInfo.nom","LIKE",utilisateurVo.getAdminInfoVo().getNom());
   }
   
   if(utilisateurVo.getLaureatInfoVo()!=null){
     query += SearchUtil.addConstraint( "o", "laureatInfo.id","=",utilisateurVo.getLaureatInfoVo().getId());
     query += SearchUtil.addConstraint( "o", "laureatInfo.cne","LIKE",utilisateurVo.getLaureatInfoVo().getCne());
   }
   
   if(utilisateurVo.getEtudiantInfoVo()!=null){
     query += SearchUtil.addConstraint( "o", "etudiantInfo.id","=",utilisateurVo.getEtudiantInfoVo().getId());
     query += SearchUtil.addConstraint( "o", "etudiantInfo.cne","LIKE",utilisateurVo.getEtudiantInfoVo().getCne());
   }
   
   if(utilisateurVo.getProfesseurInfoVo()!=null){
     query += SearchUtil.addConstraint( "o", "professeurInfo.id","=",utilisateurVo.getProfesseurInfoVo().getId());
     query += SearchUtil.addConstraint( "o", "professeurInfo.code","LIKE",utilisateurVo.getProfesseurInfoVo().getCode());
   }
   
   if(utilisateurVo.getReponsesVo()!=null){
     query += SearchUtil.addConstraint( "o", "reponses.id","=",utilisateurVo.getReponsesVo().getId());
     query += SearchUtil.addConstraint( "o", "reponses.reponse","LIKE",utilisateurVo.getReponsesVo().getReponse());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
