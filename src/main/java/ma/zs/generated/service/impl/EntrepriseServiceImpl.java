package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Entreprise;
import ma.zs.generated.bean.Fonction;
import ma.zs.generated.dao.EntrepriseDao;
import ma.zs.generated.service.facade.EntrepriseService;
import ma.zs.generated.service.facade.FonctionService;   

import ma.zs.generated.ws.rest.provided.vo.EntrepriseVo;
import ma.zs.generated.service.util.*;
@Service
public class EntrepriseServiceImpl implements EntrepriseService {

   @Autowired
   private EntrepriseDao entrepriseDao;
   
    @Autowired
    private FonctionService fonctionService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Entreprise> findAll(){
		return entrepriseDao.findAll();
	}	
	@Override
	public Entreprise findByRef(String ref){
		if( ref==null)
		  return null;
		return entrepriseDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return entrepriseDao.deleteByRef(ref);	 
	}

	@Override
	public Entreprise findById(Long id){
		 if(id==null)
		  return null;
		return entrepriseDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           entrepriseDao.deleteById(id);
   }
	@Override	
	public Entreprise save (Entreprise entreprise){
			Entreprise foundedEntreprise = findByRef(entreprise.getRef());
	       if(foundedEntreprise!=null)
	          return null;  

	    Entreprise savedEntreprise = entrepriseDao.save(entreprise);
               if(ListUtil.isNotEmpty(entreprise.getFonctionsLaureat())){
		  savedEntreprise.setFonctionsLaureat(fonctionService.save(prepareFonctionsLaureat(savedEntreprise,entreprise.getFonctionsLaureat())));
		 }
	   return savedEntreprise;
	}

    @Override
    public List<Entreprise> save(List<Entreprise> entreprises){
		List<Entreprise> list = new ArrayList<Entreprise>();
		for(Entreprise entreprise: entreprises){
		        list.add(save(entreprise));	
		}
		return list;
	}

     private List<Fonction> prepareFonctionsLaureat(Entreprise entreprise,List<Fonction> fonctions){
		    for(Fonction fonction:fonctions ){
                  fonction.setEntreprise(entreprise); 
			}
			return fonctions;
	  }

   @Override
   public Entreprise update(Entreprise entreprise){
     
    
		  Entreprise foundedEntreprise = findById(entreprise.getId()); 
		       if(foundedEntreprise==null)
	          return null;	  
	  
	   return  entrepriseDao.save(entreprise);
     
     }
    
	@Override
	@Transactional
	public int delete(Entreprise entreprise){

	        if(entreprise.getRef()==null)
			  return -1;
		
			Entreprise foundedEntreprise = findByRef(entreprise.getRef());
	       if(foundedEntreprise==null)
	          return -1;  
	   entrepriseDao.delete(foundedEntreprise);
	   return 1;
	}


	public List<Entreprise> findByCriteria(EntrepriseVo entrepriseVo){
      String query = "SELECT o FROM Entreprise o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "localisation","LIKE",entrepriseVo.getLocalisation());

			 query += SearchUtil.addConstraint( "o", "description","LIKE",entrepriseVo.getDescription());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",entrepriseVo.getRef());

			 query += SearchUtil.addConstraint( "o", "nom","LIKE",entrepriseVo.getNom());

		 	 query += SearchUtil.addConstraint( "o", "id","=",entrepriseVo.getId());
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
