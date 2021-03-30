package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Candidature;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.Offre;
import ma.zs.generated.dao.CandidatureDao;
import ma.zs.generated.service.facade.CandidatureService;
import ma.zs.generated.service.facade.StatusService;   
import ma.zs.generated.service.facade.EtudiantInfoService;   
import ma.zs.generated.service.facade.OffreService;   

import ma.zs.generated.ws.rest.provided.vo.CandidatureVo;
import ma.zs.generated.service.util.*;
@Service
public class CandidatureServiceImpl implements CandidatureService {

   @Autowired
   private CandidatureDao candidatureDao;
   
    @Autowired
    private StatusService statusService ;
    @Autowired
    private EtudiantInfoService etudiantInfoService ;
    @Autowired
    private OffreService offreService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Candidature> findAll(){
		return candidatureDao.findAll();
	}	
	@Override
	public List<Candidature> findByCandidatCne(String cne){
		return candidatureDao.findByCandidatCne(cne);
	}
	@Override
	@Transactional
    public int deleteByCandidatCne(String cne){
		return candidatureDao.deleteByCandidatCne(cne);
	}
	
     @Override
    public List<Candidature> findByCandidatId(Long id){
		return candidatureDao.findByCandidatId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCandidatId(Long id){
		return candidatureDao.deleteByCandidatId(id);

	}
     		
	@Override
	public List<Candidature> findByStatusCode(String code){
		return candidatureDao.findByStatusCode(code);
	}
	@Override
	@Transactional
    public int deleteByStatusCode(String code){
		return candidatureDao.deleteByStatusCode(code);
	}
	
     @Override
    public List<Candidature> findByStatusId(Long id){
		return candidatureDao.findByStatusId(id);

	}
	   @Override
	   @Transactional
    public int deleteByStatusId(Long id){
		return candidatureDao.deleteByStatusId(id);

	}
     		
	@Override
	public List<Candidature> findByOffreConcerneRef(String ref){
		return candidatureDao.findByOffreConcerneRef(ref);
	}
	@Override
	@Transactional
    public int deleteByOffreConcerneRef(String ref){
		return candidatureDao.deleteByOffreConcerneRef(ref);
	}
	
     @Override
    public List<Candidature> findByOffreConcerneId(Long id){
		return candidatureDao.findByOffreConcerneId(id);

	}
	   @Override
	   @Transactional
    public int deleteByOffreConcerneId(Long id){
		return candidatureDao.deleteByOffreConcerneId(id);

	}
     		
	@Override
	public Candidature findByRef(String ref){
		if( ref==null)
		  return null;
		return candidatureDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return candidatureDao.deleteByRef(ref);	 
	}

	@Override
	public Candidature findById(Long id){
		 if(id==null)
		  return null;
		return candidatureDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           candidatureDao.deleteById(id);
   }
	@Override	
	public Candidature save (Candidature candidature){
			Candidature foundedCandidature = findByRef(candidature.getRef());
	       if(foundedCandidature!=null)
	          return null;  
	    
	          if(candidature.getCandidat()!=null){
				    EtudiantInfo candidat = etudiantInfoService.findByCne(candidature.getCandidat().getCne());
				  if(candidat == null)
				  candidature.setCandidat(etudiantInfoService.save(candidature.getCandidat()));
				  else
				  candidature.setCandidat(candidat);
			  }
	    
	          if(candidature.getStatus()!=null){
				    Status status = statusService.findByCode(candidature.getStatus().getCode());
				  if(status == null)
				  candidature.setStatus(statusService.save(candidature.getStatus()));
				  else
				  candidature.setStatus(status);
			  }
	    
	          if(candidature.getOffreConcerne()!=null){
				    Offre offreConcerne = offreService.findByRef(candidature.getOffreConcerne().getRef());
				  if(offreConcerne == null)
				  candidature.setOffreConcerne(offreService.save(candidature.getOffreConcerne()));
				  else
				  candidature.setOffreConcerne(offreConcerne);
			  }

	    Candidature savedCandidature = candidatureDao.save(candidature);
	   return savedCandidature;
	}

    @Override
    public List<Candidature> save(List<Candidature> candidatures){
		List<Candidature> list = new ArrayList<Candidature>();
		for(Candidature candidature: candidatures){
		        list.add(save(candidature));	
		}
		return list;
	}


   @Override
   public Candidature update(Candidature candidature){
     
    
		  Candidature foundedCandidature = findById(candidature.getId()); 
		       if(foundedCandidature==null)
	          return null;	  
	  
	   return  candidatureDao.save(candidature);
     
     }
    
	@Override
	@Transactional
	public int delete(Candidature candidature){

	        if(candidature.getRef()==null)
			  return -1;
		
			Candidature foundedCandidature = findByRef(candidature.getRef());
	       if(foundedCandidature==null)
	          return -1;  
	   candidatureDao.delete(foundedCandidature);
	   return 1;
	}


	public List<Candidature> findByCriteria(CandidatureVo candidatureVo){
      String query = "SELECT o FROM Candidature o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "lettreMotivation","LIKE",candidatureVo.getLettreMotivation());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",candidatureVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",candidatureVo.getId());
   if(candidatureVo.getCandidatVo()!=null){
     query += SearchUtil.addConstraint( "o", "candidat.id","=",candidatureVo.getCandidatVo().getId());
     query += SearchUtil.addConstraint( "o", "candidat.cne","LIKE",candidatureVo.getCandidatVo().getCne());
   }
   
   if(candidatureVo.getStatusVo()!=null){
     query += SearchUtil.addConstraint( "o", "status.id","=",candidatureVo.getStatusVo().getId());
     query += SearchUtil.addConstraint( "o", "status.code","LIKE",candidatureVo.getStatusVo().getCode());
   }
   
   if(candidatureVo.getOffreConcerneVo()!=null){
     query += SearchUtil.addConstraint( "o", "offreConcerne.id","=",candidatureVo.getOffreConcerneVo().getId());
     query += SearchUtil.addConstraint( "o", "offreConcerne.ref","LIKE",candidatureVo.getOffreConcerneVo().getRef());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
