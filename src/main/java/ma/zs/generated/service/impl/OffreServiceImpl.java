package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Offre;
import ma.zs.generated.bean.OffreTags;
import ma.zs.generated.bean.Fonction;
import ma.zs.generated.bean.Candidature;
import ma.zs.generated.dao.OffreDao;
import ma.zs.generated.service.facade.OffreService;
import ma.zs.generated.service.facade.FonctionService;   
import ma.zs.generated.service.facade.CandidatureService;   
import ma.zs.generated.service.facade.OffreTagsService;   

import ma.zs.generated.ws.rest.provided.vo.OffreVo;
import ma.zs.generated.service.util.*;
@Service
public class OffreServiceImpl implements OffreService {

   @Autowired
   private OffreDao offreDao;
   
    @Autowired
    private FonctionService fonctionService ;
    @Autowired
    private CandidatureService candidatureService ;
    @Autowired
    private OffreTagsService offreTagsService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Offre> findAll(){
		return offreDao.findAll();
	}	
	@Override
	public List<Offre> findByTagsRef(String ref){
		return offreDao.findByTagsRef(ref);
	}
	@Override
	@Transactional
    public int deleteByTagsRef(String ref){
		return offreDao.deleteByTagsRef(ref);
	}
	
     @Override
    public List<Offre> findByTagsId(Long id){
		return offreDao.findByTagsId(id);

	}
	   @Override
	   @Transactional
    public int deleteByTagsId(Long id){
		return offreDao.deleteByTagsId(id);

	}
     		
	@Override
	public List<Offre> findByFonctionRef(String ref){
		return offreDao.findByFonctionRef(ref);
	}
	@Override
	@Transactional
    public int deleteByFonctionRef(String ref){
		return offreDao.deleteByFonctionRef(ref);
	}
	
     @Override
    public List<Offre> findByFonctionId(Long id){
		return offreDao.findByFonctionId(id);

	}
	   @Override
	   @Transactional
    public int deleteByFonctionId(Long id){
		return offreDao.deleteByFonctionId(id);

	}
     		
	@Override
	public Offre findByRef(String ref){
		if( ref==null)
		  return null;
		return offreDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return offreDao.deleteByRef(ref);	 
	}

	@Override
	public Offre findById(Long id){
		 if(id==null)
		  return null;
		return offreDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           offreDao.deleteById(id);
   }
	@Override	
	public Offre save (Offre offre){
			Offre foundedOffre = findByRef(offre.getRef());
	       if(foundedOffre!=null)
	          return null;  
	    
	          if(offre.getTags()!=null){
				    OffreTags tags = offreTagsService.findByRef(offre.getTags().getRef());
				  if(tags == null)
				  offre.setTags(offreTagsService.save(offre.getTags()));
				  else
				  offre.setTags(tags);
			  }
	    
	          if(offre.getFonction()!=null){
				    Fonction fonction = fonctionService.findByRef(offre.getFonction().getRef());
				  if(fonction == null)
				  offre.setFonction(fonctionService.save(offre.getFonction()));
				  else
				  offre.setFonction(fonction);
			  }

	    Offre savedOffre = offreDao.save(offre);
               if(ListUtil.isNotEmpty(offre.getCandidatures())){
		  savedOffre.setCandidatures(candidatureService.save(prepareCandidatures(savedOffre,offre.getCandidatures())));
		 }
	   return savedOffre;
	}

    @Override
    public List<Offre> save(List<Offre> offres){
		List<Offre> list = new ArrayList<Offre>();
		for(Offre offre: offres){
		        list.add(save(offre));	
		}
		return list;
	}

     private List<Candidature> prepareCandidatures(Offre offre,List<Candidature> candidatures){
		    for(Candidature candidature:candidatures ){
                  candidature.setOffreConcerne(offre); 
			}
			return candidatures;
	  }

   @Override
   public Offre update(Offre offre){
     
    
		  Offre foundedOffre = findById(offre.getId()); 
		       if(foundedOffre==null)
	          return null;	  
	  
	   return  offreDao.save(offre);
     
     }
    
	@Override
	@Transactional
	public int delete(Offre offre){

	        if(offre.getRef()==null)
			  return -1;
		
			Offre foundedOffre = findByRef(offre.getRef());
	       if(foundedOffre==null)
	          return -1;  
	   offreDao.delete(foundedOffre);
	   return 1;
	}


	public List<Offre> findByCriteria(OffreVo offreVo){
      String query = "SELECT o FROM Offre o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "dateOffre","=",offreVo.getDateOffre());
			 query += SearchUtil.addConstraint( "o", "titre","LIKE",offreVo.getTitre());

			 query += SearchUtil.addConstraint( "o", "infoSup","LIKE",offreVo.getInfoSup());

			 query += SearchUtil.addConstraint( "o", "type","LIKE",offreVo.getType());

	  query += SearchUtil.addConstraintDate( "o", "dernierDelai","=",offreVo.getDernierDelai());
			 query += SearchUtil.addConstraint( "o", "ref","LIKE",offreVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",offreVo.getId());
	  query += SearchUtil.addConstraintMinMaxDate("o","dateOffre",offreVo.getDateOffreMin(),offreVo.getDateOffreMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","dernierDelai",offreVo.getDernierDelaiMin(),offreVo.getDernierDelaiMax());
   if(offreVo.getTagsVo()!=null){
     query += SearchUtil.addConstraint( "o", "tags.id","=",offreVo.getTagsVo().getId());
     query += SearchUtil.addConstraint( "o", "tags.ref","LIKE",offreVo.getTagsVo().getRef());
   }
   
   if(offreVo.getFonctionVo()!=null){
     query += SearchUtil.addConstraint( "o", "fonction.id","=",offreVo.getFonctionVo().getId());
     query += SearchUtil.addConstraint( "o", "fonction.ref","LIKE",offreVo.getFonctionVo().getRef());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
