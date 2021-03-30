package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Fonction;
import ma.zs.generated.bean.Entreprise;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.dao.FonctionDao;
import ma.zs.generated.service.facade.FonctionService;
import ma.zs.generated.service.facade.EntrepriseService;   
import ma.zs.generated.service.facade.EtudiantInfoService;   

import ma.zs.generated.ws.rest.provided.vo.FonctionVo;
import ma.zs.generated.service.util.*;
@Service
public class FonctionServiceImpl implements FonctionService {

   @Autowired
   private FonctionDao fonctionDao;
   
    @Autowired
    private EntrepriseService entrepriseService ;
    @Autowired
    private EtudiantInfoService etudiantInfoService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Fonction> findAll(){
		return fonctionDao.findAll();
	}	
	@Override
	public List<Fonction> findByEntrepriseRef(String ref){
		return fonctionDao.findByEntrepriseRef(ref);
	}
	@Override
	@Transactional
    public int deleteByEntrepriseRef(String ref){
		return fonctionDao.deleteByEntrepriseRef(ref);
	}
	
     @Override
    public List<Fonction> findByEntrepriseId(Long id){
		return fonctionDao.findByEntrepriseId(id);

	}
	   @Override
	   @Transactional
    public int deleteByEntrepriseId(Long id){
		return fonctionDao.deleteByEntrepriseId(id);

	}
     		
	@Override
	public List<Fonction> findByOccupeParCne(String cne){
		return fonctionDao.findByOccupeParCne(cne);
	}
	@Override
	@Transactional
    public int deleteByOccupeParCne(String cne){
		return fonctionDao.deleteByOccupeParCne(cne);
	}
	
     @Override
    public List<Fonction> findByOccupeParId(Long id){
		return fonctionDao.findByOccupeParId(id);

	}
	   @Override
	   @Transactional
    public int deleteByOccupeParId(Long id){
		return fonctionDao.deleteByOccupeParId(id);

	}
     		
	@Override
	public Fonction findByRef(String ref){
		if( ref==null)
		  return null;
		return fonctionDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return fonctionDao.deleteByRef(ref);	 
	}

	@Override
	public Fonction findById(Long id){
		 if(id==null)
		  return null;
		return fonctionDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           fonctionDao.deleteById(id);
   }
	@Override	
	public Fonction save (Fonction fonction){
			Fonction foundedFonction = findByRef(fonction.getRef());
	       if(foundedFonction!=null)
	          return null;  
	    
	          if(fonction.getEntreprise()!=null){
				    Entreprise entreprise = entrepriseService.findByRef(fonction.getEntreprise().getRef());
				  if(entreprise == null)
				  fonction.setEntreprise(entrepriseService.save(fonction.getEntreprise()));
				  else
				  fonction.setEntreprise(entreprise);
			  }
	    
	          if(fonction.getOccupePar()!=null){
				    EtudiantInfo occupePar = etudiantInfoService.findByCne(fonction.getOccupePar().getCne());
				  if(occupePar == null)
				  fonction.setOccupePar(etudiantInfoService.save(fonction.getOccupePar()));
				  else
				  fonction.setOccupePar(occupePar);
			  }

	    Fonction savedFonction = fonctionDao.save(fonction);
	   return savedFonction;
	}

    @Override
    public List<Fonction> save(List<Fonction> fonctions){
		List<Fonction> list = new ArrayList<Fonction>();
		for(Fonction fonction: fonctions){
		        list.add(save(fonction));	
		}
		return list;
	}


   @Override
   public Fonction update(Fonction fonction){
     
    
		  Fonction foundedFonction = findById(fonction.getId()); 
		       if(foundedFonction==null)
	          return null;	  
	  
	   return  fonctionDao.save(fonction);
     
     }
    
	@Override
	@Transactional
	public int delete(Fonction fonction){

	        if(fonction.getRef()==null)
			  return -1;
		
			Fonction foundedFonction = findByRef(fonction.getRef());
	       if(foundedFonction==null)
	          return -1;  
	   fonctionDao.delete(foundedFonction);
	   return 1;
	}


	public List<Fonction> findByCriteria(FonctionVo fonctionVo){
      String query = "SELECT o FROM Fonction o where 1=1 ";
	  query += SearchUtil.addConstraintDate( "o", "deteFin","=",fonctionVo.getDeteFin());
			 query += SearchUtil.addConstraint( "o", "titre","LIKE",fonctionVo.getTitre());

	  query += SearchUtil.addConstraintDate( "o", "dateDebut","=",fonctionVo.getDateDebut());
			 query += SearchUtil.addConstraint( "o", "description","LIKE",fonctionVo.getDescription());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",fonctionVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",fonctionVo.getId());
	  query += SearchUtil.addConstraintMinMaxDate("o","deteFin",fonctionVo.getDeteFinMin(),fonctionVo.getDeteFinMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","dateDebut",fonctionVo.getDateDebutMin(),fonctionVo.getDateDebutMax());
   if(fonctionVo.getEntrepriseVo()!=null){
     query += SearchUtil.addConstraint( "o", "entreprise.id","=",fonctionVo.getEntrepriseVo().getId());
     query += SearchUtil.addConstraint( "o", "entreprise.ref","LIKE",fonctionVo.getEntrepriseVo().getRef());
   }
   
   if(fonctionVo.getOccupeParVo()!=null){
     query += SearchUtil.addConstraint( "o", "occupePar.id","=",fonctionVo.getOccupeParVo().getId());
     query += SearchUtil.addConstraint( "o", "occupePar.cne","LIKE",fonctionVo.getOccupeParVo().getCne());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
