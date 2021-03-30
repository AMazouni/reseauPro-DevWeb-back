package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Demande;
import ma.zs.generated.bean.CatDemande;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.Message;
import ma.zs.generated.dao.DemandeDao;
import ma.zs.generated.service.facade.DemandeService;
import ma.zs.generated.service.facade.StatusService;   
import ma.zs.generated.service.facade.MessageService;   
import ma.zs.generated.service.facade.EtudiantInfoService;   
import ma.zs.generated.service.facade.CatDemandeService;   

import ma.zs.generated.ws.rest.provided.vo.DemandeVo;
import ma.zs.generated.service.util.*;
@Service
public class DemandeServiceImpl implements DemandeService {

   @Autowired
   private DemandeDao demandeDao;
   
    @Autowired
    private StatusService statusService ;
    @Autowired
    private MessageService messageService ;
    @Autowired
    private EtudiantInfoService etudiantInfoService ;
    @Autowired
    private CatDemandeService catDemandeService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Demande> findAll(){
		return demandeDao.findAll();
	}	
	@Override
	public List<Demande> findByCategorieDemandeRef(String ref){
		return demandeDao.findByCategorieDemandeRef(ref);
	}
	@Override
	@Transactional
    public int deleteByCategorieDemandeRef(String ref){
		return demandeDao.deleteByCategorieDemandeRef(ref);
	}
	
     @Override
    public List<Demande> findByCategorieDemandeId(Long id){
		return demandeDao.findByCategorieDemandeId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCategorieDemandeId(Long id){
		return demandeDao.deleteByCategorieDemandeId(id);

	}
     		
	@Override
	public List<Demande> findByDemandeParCne(String cne){
		return demandeDao.findByDemandeParCne(cne);
	}
	@Override
	@Transactional
    public int deleteByDemandeParCne(String cne){
		return demandeDao.deleteByDemandeParCne(cne);
	}
	
     @Override
    public List<Demande> findByDemandeParId(Long id){
		return demandeDao.findByDemandeParId(id);

	}
	   @Override
	   @Transactional
    public int deleteByDemandeParId(Long id){
		return demandeDao.deleteByDemandeParId(id);

	}
     		
	@Override
	public List<Demande> findByStatusCode(String code){
		return demandeDao.findByStatusCode(code);
	}
	@Override
	@Transactional
    public int deleteByStatusCode(String code){
		return demandeDao.deleteByStatusCode(code);
	}
	
     @Override
    public List<Demande> findByStatusId(Long id){
		return demandeDao.findByStatusId(id);

	}
	   @Override
	   @Transactional
    public int deleteByStatusId(Long id){
		return demandeDao.deleteByStatusId(id);

	}
     		
	@Override
	public List<Demande> findByDemandeACne(String cne){
		return demandeDao.findByDemandeACne(cne);
	}
	@Override
	@Transactional
    public int deleteByDemandeACne(String cne){
		return demandeDao.deleteByDemandeACne(cne);
	}
	
     @Override
    public List<Demande> findByDemandeAId(Long id){
		return demandeDao.findByDemandeAId(id);

	}
	   @Override
	   @Transactional
    public int deleteByDemandeAId(Long id){
		return demandeDao.deleteByDemandeAId(id);

	}
     		
	@Override
	public Demande findByRef(String ref){
		if( ref==null)
		  return null;
		return demandeDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return demandeDao.deleteByRef(ref);	 
	}

	@Override
	public Demande findById(Long id){
		 if(id==null)
		  return null;
		return demandeDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           demandeDao.deleteById(id);
   }
	@Override	
	public Demande save (Demande demande){
			Demande foundedDemande = findByRef(demande.getRef());
	       if(foundedDemande!=null)
	          return null;  
	    
	          if(demande.getCategorieDemande()!=null){
				    CatDemande categorieDemande = catDemandeService.findByRef(demande.getCategorieDemande().getRef());
				  if(categorieDemande == null)
				  demande.setCategorieDemande(catDemandeService.save(demande.getCategorieDemande()));
				  else
				  demande.setCategorieDemande(categorieDemande);
			  }
	    
	          if(demande.getDemandePar()!=null){
				    EtudiantInfo demandePar = etudiantInfoService.findByCne(demande.getDemandePar().getCne());
				  if(demandePar == null)
				  demande.setDemandePar(etudiantInfoService.save(demande.getDemandePar()));
				  else
				  demande.setDemandePar(demandePar);
			  }
	    
	          if(demande.getStatus()!=null){
				    Status status = statusService.findByCode(demande.getStatus().getCode());
				  if(status == null)
				  demande.setStatus(statusService.save(demande.getStatus()));
				  else
				  demande.setStatus(status);
			  }
	    
	          if(demande.getDemandeA()!=null){
				    EtudiantInfo demandeA = etudiantInfoService.findByCne(demande.getDemandeA().getCne());
				  if(demandeA == null)
				  demande.setDemandeA(etudiantInfoService.save(demande.getDemandeA()));
				  else
				  demande.setDemandeA(demandeA);
			  }

	    Demande savedDemande = demandeDao.save(demande);
               if(ListUtil.isNotEmpty(demande.getMessages())){
		  savedDemande.setMessages(messageService.save(prepareMessages(savedDemande,demande.getMessages())));
		 }
	   return savedDemande;
	}

    @Override
    public List<Demande> save(List<Demande> demandes){
		List<Demande> list = new ArrayList<Demande>();
		for(Demande demande: demandes){
		        list.add(save(demande));	
		}
		return list;
	}

     private List<Message> prepareMessages(Demande demande,List<Message> messages){
		    for(Message message:messages ){
                  message.setDemandeConcerne(demande); 
			}
			return messages;
	  }

   @Override
   public Demande update(Demande demande){
     
    
		  Demande foundedDemande = findById(demande.getId()); 
		       if(foundedDemande==null)
	          return null;	  
	  
	   return  demandeDao.save(demande);
     
     }
    
	@Override
	@Transactional
	public int delete(Demande demande){

	        if(demande.getRef()==null)
			  return -1;
		
			Demande foundedDemande = findByRef(demande.getRef());
	       if(foundedDemande==null)
	          return -1;  
	   demandeDao.delete(foundedDemande);
	   return 1;
	}


	public List<Demande> findByCriteria(DemandeVo demandeVo){
      String query = "SELECT o FROM Demande o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "objetDemande","LIKE",demandeVo.getObjetDemande());

			 query += SearchUtil.addConstraint( "o", "infoSupp","LIKE",demandeVo.getInfoSupp());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",demandeVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",demandeVo.getId());
   if(demandeVo.getCategorieDemandeVo()!=null){
     query += SearchUtil.addConstraint( "o", "categorieDemande.id","=",demandeVo.getCategorieDemandeVo().getId());
     query += SearchUtil.addConstraint( "o", "categorieDemande.ref","LIKE",demandeVo.getCategorieDemandeVo().getRef());
   }
   
   if(demandeVo.getDemandeParVo()!=null){
     query += SearchUtil.addConstraint( "o", "demandePar.id","=",demandeVo.getDemandeParVo().getId());
     query += SearchUtil.addConstraint( "o", "demandePar.cne","LIKE",demandeVo.getDemandeParVo().getCne());
   }
   
   if(demandeVo.getStatusVo()!=null){
     query += SearchUtil.addConstraint( "o", "status.id","=",demandeVo.getStatusVo().getId());
     query += SearchUtil.addConstraint( "o", "status.code","LIKE",demandeVo.getStatusVo().getCode());
   }
   
   if(demandeVo.getDemandeAVo()!=null){
     query += SearchUtil.addConstraint( "o", "demandeA.id","=",demandeVo.getDemandeAVo().getId());
     query += SearchUtil.addConstraint( "o", "demandeA.cne","LIKE",demandeVo.getDemandeAVo().getCne());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
