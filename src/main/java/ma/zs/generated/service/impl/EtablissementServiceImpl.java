package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Etablissement;
import ma.zs.generated.bean.Formation;
import ma.zs.generated.dao.EtablissementDao;
import ma.zs.generated.service.facade.EtablissementService;
import ma.zs.generated.service.facade.FormationService;   

import ma.zs.generated.ws.rest.provided.vo.EtablissementVo;
import ma.zs.generated.service.util.*;
@Service
public class EtablissementServiceImpl implements EtablissementService {

   @Autowired
   private EtablissementDao etablissementDao;
   
    @Autowired
    private FormationService formationService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Etablissement> findAll(){
		return etablissementDao.findAll();
	}	
	@Override
	public Etablissement findByRef(String ref){
		if( ref==null)
		  return null;
		return etablissementDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return etablissementDao.deleteByRef(ref);	 
	}

	@Override
	public Etablissement findById(Long id){
		 if(id==null)
		  return null;
		return etablissementDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           etablissementDao.deleteById(id);
   }
	@Override	
	public Etablissement save (Etablissement etablissement){
			Etablissement foundedEtablissement = findByRef(etablissement.getRef());
	       if(foundedEtablissement!=null)
	          return null;  

	    Etablissement savedEtablissement = etablissementDao.save(etablissement);
               if(ListUtil.isNotEmpty(etablissement.getFormations())){
		  savedEtablissement.setFormations(formationService.save(prepareFormations(savedEtablissement,etablissement.getFormations())));
		 }
	   return savedEtablissement;
	}

    @Override
    public List<Etablissement> save(List<Etablissement> etablissements){
		List<Etablissement> list = new ArrayList<Etablissement>();
		for(Etablissement etablissement: etablissements){
		        list.add(save(etablissement));	
		}
		return list;
	}

     private List<Formation> prepareFormations(Etablissement etablissement,List<Formation> formations){
		    for(Formation formation:formations ){
                  formation.setEtablissement(etablissement); 
			}
			return formations;
	  }

   @Override
   public Etablissement update(Etablissement etablissement){
     
    
		  Etablissement foundedEtablissement = findById(etablissement.getId()); 
		       if(foundedEtablissement==null)
	          return null;	  
	  
	   return  etablissementDao.save(etablissement);
     
     }
    
	@Override
	@Transactional
	public int delete(Etablissement etablissement){

	        if(etablissement.getRef()==null)
			  return -1;
		
			Etablissement foundedEtablissement = findByRef(etablissement.getRef());
	       if(foundedEtablissement==null)
	          return -1;  
	   etablissementDao.delete(foundedEtablissement);
	   return 1;
	}


	public List<Etablissement> findByCriteria(EtablissementVo etablissementVo){
      String query = "SELECT o FROM Etablissement o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "nom","LIKE",etablissementVo.getNom());

			 query += SearchUtil.addConstraint( "o", "description","LIKE",etablissementVo.getDescription());

		 	 query += SearchUtil.addConstraint( "o", "id","=",etablissementVo.getId());
			 query += SearchUtil.addConstraint( "o", "ref","LIKE",etablissementVo.getRef());

	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
