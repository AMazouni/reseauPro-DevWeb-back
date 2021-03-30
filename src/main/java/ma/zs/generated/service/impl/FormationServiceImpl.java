package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Formation;
import ma.zs.generated.bean.Etablissement;
import ma.zs.generated.bean.ProfesseurInfo;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.dao.FormationDao;
import ma.zs.generated.service.facade.FormationService;
import ma.zs.generated.service.facade.ProfesseurInfoService;   
import ma.zs.generated.service.facade.EtudiantInfoService;   
import ma.zs.generated.service.facade.EtablissementService;   

import ma.zs.generated.ws.rest.provided.vo.FormationVo;
import ma.zs.generated.service.util.*;
@Service
public class FormationServiceImpl implements FormationService {

   @Autowired
   private FormationDao formationDao;
   
    @Autowired
    private ProfesseurInfoService professeurInfoService ;
    @Autowired
    private EtudiantInfoService etudiantInfoService ;
    @Autowired
    private EtablissementService etablissementService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Formation> findAll(){
		return formationDao.findAll();
	}	
	@Override
	public List<Formation> findByEtablissementRef(String ref){
		return formationDao.findByEtablissementRef(ref);
	}
	@Override
	@Transactional
    public int deleteByEtablissementRef(String ref){
		return formationDao.deleteByEtablissementRef(ref);
	}
	
     @Override
    public List<Formation> findByEtablissementId(Long id){
		return formationDao.findByEtablissementId(id);

	}
	   @Override
	   @Transactional
    public int deleteByEtablissementId(Long id){
		return formationDao.deleteByEtablissementId(id);

	}
     		
	@Override
	public List<Formation> findByResponsableCode(String code){
		return formationDao.findByResponsableCode(code);
	}
	@Override
	@Transactional
    public int deleteByResponsableCode(String code){
		return formationDao.deleteByResponsableCode(code);
	}
	
     @Override
    public List<Formation> findByResponsableId(Long id){
		return formationDao.findByResponsableId(id);

	}
	   @Override
	   @Transactional
    public int deleteByResponsableId(Long id){
		return formationDao.deleteByResponsableId(id);

	}
     		
	@Override
	public Formation findByRef(String ref){
		if( ref==null)
		  return null;
		return formationDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return formationDao.deleteByRef(ref);	 
	}

	@Override
	public Formation findById(Long id){
		 if(id==null)
		  return null;
		return formationDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           formationDao.deleteById(id);
   }
	@Override	
	public Formation save (Formation formation){
			Formation foundedFormation = findByRef(formation.getRef());
	       if(foundedFormation!=null)
	          return null;  
	    
	          if(formation.getEtablissement()!=null){
				    Etablissement etablissement = etablissementService.findByRef(formation.getEtablissement().getRef());
				  if(etablissement == null)
				  formation.setEtablissement(etablissementService.save(formation.getEtablissement()));
				  else
				  formation.setEtablissement(etablissement);
			  }
	    
	          if(formation.getResponsable()!=null){
				    ProfesseurInfo responsable = professeurInfoService.findByCode(formation.getResponsable().getCode());
				  if(responsable == null)
				  formation.setResponsable(professeurInfoService.save(formation.getResponsable()));
				  else
				  formation.setResponsable(responsable);
			  }

	    Formation savedFormation = formationDao.save(formation);
               if(ListUtil.isNotEmpty(formation.getLaureats())){
		  savedFormation.setLaureats(etudiantInfoService.save(prepareLaureats(savedFormation,formation.getLaureats())));
		 }
               if(ListUtil.isNotEmpty(formation.getEtudiantsAct())){
		  savedFormation.setEtudiantsAct(etudiantInfoService.save(prepareEtudiantsAct(savedFormation,formation.getEtudiantsAct())));
		 }
	   return savedFormation;
	}

    @Override
    public List<Formation> save(List<Formation> formations){
		List<Formation> list = new ArrayList<Formation>();
		for(Formation formation: formations){
		        list.add(save(formation));	
		}
		return list;
	}

     private List<EtudiantInfo> prepareLaureats(Formation formation,List<EtudiantInfo> etudiantInfos){
		    for(EtudiantInfo etudiantInfo:etudiantInfos ){
                  etudiantInfo.getFormations().add(formation);
			}
			return etudiantInfos;
	  }
     private List<EtudiantInfo> prepareEtudiantsAct(Formation formation,List<EtudiantInfo> etudiantInfos){
		    for(EtudiantInfo etudiantInfo:etudiantInfos ){
                  etudiantInfo.setFormationActuelle(formation); 
			}
			return etudiantInfos;
	  }

   @Override
   public Formation update(Formation formation){
     
    
		  Formation foundedFormation = findById(formation.getId()); 
		       if(foundedFormation==null)
	          return null;	  
	  
	   return  formationDao.save(formation);
     
     }
    
	@Override
	@Transactional
	public int delete(Formation formation){

	        if(formation.getRef()==null)
			  return -1;
		
			Formation foundedFormation = findByRef(formation.getRef());
	       if(foundedFormation==null)
	          return -1;  
	   formationDao.delete(foundedFormation);
	   return 1;
	}


	public List<Formation> findByCriteria(FormationVo formationVo){
      String query = "SELECT o FROM Formation o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "intitule","LIKE",formationVo.getIntitule());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",formationVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",formationVo.getId());
			 query += SearchUtil.addConstraint( "o", "description","LIKE",formationVo.getDescription());

   if(formationVo.getEtablissementVo()!=null){
     query += SearchUtil.addConstraint( "o", "etablissement.id","=",formationVo.getEtablissementVo().getId());
     query += SearchUtil.addConstraint( "o", "etablissement.ref","LIKE",formationVo.getEtablissementVo().getRef());
   }
   
   if(formationVo.getResponsableVo()!=null){
     query += SearchUtil.addConstraint( "o", "responsable.id","=",formationVo.getResponsableVo().getId());
     query += SearchUtil.addConstraint( "o", "responsable.code","LIKE",formationVo.getResponsableVo().getCode());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
