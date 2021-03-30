package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Message;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.bean.Demande;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.dao.MessageDao;
import ma.zs.generated.service.facade.MessageService;
import ma.zs.generated.service.facade.DemandeService;   
import ma.zs.generated.service.facade.UtilisateurService;   

import ma.zs.generated.ws.rest.provided.vo.MessageVo;
import ma.zs.generated.service.util.*;
@Service
public class MessageServiceImpl implements MessageService {

   @Autowired
   private MessageDao messageDao;
   
    @Autowired
    private DemandeService demandeService ;
    @Autowired
    private UtilisateurService utilisateurService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Message> findAll(){
		return messageDao.findAll();
	}	
	@Override
	public List<Message> findByEmetteurEmail(String email){
		return messageDao.findByEmetteurEmail(email);
	}
	@Override
	@Transactional
    public int deleteByEmetteurEmail(String email){
		return messageDao.deleteByEmetteurEmail(email);
	}
	
     @Override
    public List<Message> findByEmetteurId(Long id){
		return messageDao.findByEmetteurId(id);

	}
	   @Override
	   @Transactional
    public int deleteByEmetteurId(Long id){
		return messageDao.deleteByEmetteurId(id);

	}
     		
	@Override
	public List<Message> findByDemandeConcerneRef(String ref){
		return messageDao.findByDemandeConcerneRef(ref);
	}
	@Override
	@Transactional
    public int deleteByDemandeConcerneRef(String ref){
		return messageDao.deleteByDemandeConcerneRef(ref);
	}
	
     @Override
    public List<Message> findByDemandeConcerneId(Long id){
		return messageDao.findByDemandeConcerneId(id);

	}
	   @Override
	   @Transactional
    public int deleteByDemandeConcerneId(Long id){
		return messageDao.deleteByDemandeConcerneId(id);

	}
     		
	@Override
	public Message findByRef(String ref){
		if( ref==null)
		  return null;
		return messageDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return messageDao.deleteByRef(ref);	 
	}

	@Override
	public Message findById(Long id){
		 if(id==null)
		  return null;
		return messageDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           messageDao.deleteById(id);
   }
	@Override	
	public Message save (Message message){
			Message foundedMessage = findByRef(message.getRef());
	       if(foundedMessage!=null)
	          return null;  
	    
	          if(message.getEmetteur()!=null){
				    Utilisateur emetteur = utilisateurService.findByEmail(message.getEmetteur().getEmail());
				  if(emetteur == null)
				  message.setEmetteur(utilisateurService.save(message.getEmetteur()));
				  else
				  message.setEmetteur(emetteur);
			  }
	    
	          if(message.getDemandeConcerne()!=null){
				    Demande demandeConcerne = demandeService.findByRef(message.getDemandeConcerne().getRef());
				  if(demandeConcerne == null)
				  message.setDemandeConcerne(demandeService.save(message.getDemandeConcerne()));
				  else
				  message.setDemandeConcerne(demandeConcerne);
			  }

	    Message savedMessage = messageDao.save(message);
               if(ListUtil.isNotEmpty(message.getDestinataire())){
		  savedMessage.setDestinataire(utilisateurService.save(prepareDestinataire(savedMessage,message.getDestinataire())));
		 }
	   return savedMessage;
	}

    @Override
    public List<Message> save(List<Message> messages){
		List<Message> list = new ArrayList<Message>();
		for(Message message: messages){
		        list.add(save(message));	
		}
		return list;
	}

     private List<Utilisateur> prepareDestinataire(Message message,List<Utilisateur> utilisateurs){
		    for(Utilisateur utilisateur:utilisateurs ){
                  utilisateur.getMessagesRecus().add(message);
			}
			return utilisateurs;
	  }

   @Override
   public Message update(Message message){
     
    
		  Message foundedMessage = findById(message.getId()); 
		       if(foundedMessage==null)
	          return null;	  
	  
	   return  messageDao.save(message);
     
     }
    
	@Override
	@Transactional
	public int delete(Message message){

	        if(message.getRef()==null)
			  return -1;
		
			Message foundedMessage = findByRef(message.getRef());
	       if(foundedMessage==null)
	          return -1;  
	   messageDao.delete(foundedMessage);
	   return 1;
	}


	public List<Message> findByCriteria(MessageVo messageVo){
      String query = "SELECT o FROM Message o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "contenu","LIKE",messageVo.getContenu());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",messageVo.getRef());

			 query += SearchUtil.addConstraint( "o", "objet","LIKE",messageVo.getObjet());

		 	 query += SearchUtil.addConstraint( "o", "id","=",messageVo.getId());
   if(messageVo.getEmetteurVo()!=null){
     query += SearchUtil.addConstraint( "o", "emetteur.id","=",messageVo.getEmetteurVo().getId());
     query += SearchUtil.addConstraint( "o", "emetteur.email","LIKE",messageVo.getEmetteurVo().getEmail());
   }
   
   if(messageVo.getDemandeConcerneVo()!=null){
     query += SearchUtil.addConstraint( "o", "demandeConcerne.id","=",messageVo.getDemandeConcerneVo().getId());
     query += SearchUtil.addConstraint( "o", "demandeConcerne.ref","LIKE",messageVo.getDemandeConcerneVo().getRef());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
