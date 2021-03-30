package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.Sexe;
import ma.zs.generated.bean.Formation;
import ma.zs.generated.bean.Fonction;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.bean.Fonction;
import ma.zs.generated.bean.Formation;
import ma.zs.generated.bean.Demande;
import ma.zs.generated.bean.Demande;
import ma.zs.generated.dao.EtudiantInfoDao;
import ma.zs.generated.service.facade.EtudiantInfoService;
import ma.zs.generated.service.facade.FonctionService;   
import ma.zs.generated.service.facade.DemandeService;   
import ma.zs.generated.service.facade.SexeService;   
import ma.zs.generated.service.facade.FormationService;   
import ma.zs.generated.service.facade.UtilisateurService;   

import ma.zs.generated.ws.rest.provided.vo.EtudiantInfoVo;
import ma.zs.generated.service.util.*;
@Service
public class EtudiantInfoServiceImpl implements EtudiantInfoService {

   @Autowired
   private EtudiantInfoDao etudiantInfoDao;
   
    @Autowired
    private FonctionService fonctionService ;
    @Autowired
    private DemandeService demandeService ;
    @Autowired
    private SexeService sexeService ;
    @Autowired
    private FormationService formationService ;
    @Autowired
    private UtilisateurService utilisateurService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<EtudiantInfo> findAll(){
		return etudiantInfoDao.findAll();
	}	
	@Override
	public List<EtudiantInfo> findBySexeRef(String ref){
		return etudiantInfoDao.findBySexeRef(ref);
	}
	@Override
	@Transactional
    public int deleteBySexeRef(String ref){
		return etudiantInfoDao.deleteBySexeRef(ref);
	}
	
     @Override
    public List<EtudiantInfo> findBySexeId(Long id){
		return etudiantInfoDao.findBySexeId(id);

	}
	   @Override
	   @Transactional
    public int deleteBySexeId(Long id){
		return etudiantInfoDao.deleteBySexeId(id);

	}
     		
	@Override
	public List<EtudiantInfo> findByFormationActuelleRef(String ref){
		return etudiantInfoDao.findByFormationActuelleRef(ref);
	}
	@Override
	@Transactional
    public int deleteByFormationActuelleRef(String ref){
		return etudiantInfoDao.deleteByFormationActuelleRef(ref);
	}
	
     @Override
    public List<EtudiantInfo> findByFormationActuelleId(Long id){
		return etudiantInfoDao.findByFormationActuelleId(id);

	}
	   @Override
	   @Transactional
    public int deleteByFormationActuelleId(Long id){
		return etudiantInfoDao.deleteByFormationActuelleId(id);

	}
     		
	@Override
	public List<EtudiantInfo> findByFonctionActuelleRef(String ref){
		return etudiantInfoDao.findByFonctionActuelleRef(ref);
	}
	@Override
	@Transactional
    public int deleteByFonctionActuelleRef(String ref){
		return etudiantInfoDao.deleteByFonctionActuelleRef(ref);
	}
	
     @Override
    public List<EtudiantInfo> findByFonctionActuelleId(Long id){
		return etudiantInfoDao.findByFonctionActuelleId(id);

	}
	   @Override
	   @Transactional
    public int deleteByFonctionActuelleId(Long id){
		return etudiantInfoDao.deleteByFonctionActuelleId(id);

	}
     		
	@Override
	public List<EtudiantInfo> findByCompteEmail(String email){
		return etudiantInfoDao.findByCompteEmail(email);
	}
	@Override
	@Transactional
    public int deleteByCompteEmail(String email){
		return etudiantInfoDao.deleteByCompteEmail(email);
	}
	
     @Override
    public List<EtudiantInfo> findByCompteId(Long id){
		return etudiantInfoDao.findByCompteId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCompteId(Long id){
		return etudiantInfoDao.deleteByCompteId(id);

	}
     		
	@Override
	public EtudiantInfo findByCne(String cne){
		if( cne==null)
		  return null;
		return etudiantInfoDao.findByCne(cne);
	}

   

	@Override
	@Transactional
	public int deleteByCne(String  cne) {
		return etudiantInfoDao.deleteByCne(cne);	 
	}

	@Override
	public EtudiantInfo findById(Long id){
		 if(id==null)
		  return null;
		return etudiantInfoDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           etudiantInfoDao.deleteById(id);
   }
	@Override	
	public EtudiantInfo save (EtudiantInfo etudiantInfo){
			EtudiantInfo foundedEtudiantInfo = findByCne(etudiantInfo.getCne());
	       if(foundedEtudiantInfo!=null)
	          return null;  
	    
	          if(etudiantInfo.getSexe()!=null){
				    Sexe sexe = sexeService.findByRef(etudiantInfo.getSexe().getRef());
				  if(sexe == null)
				  etudiantInfo.setSexe(sexeService.save(etudiantInfo.getSexe()));
				  else
				  etudiantInfo.setSexe(sexe);
			  }
	    
	          if(etudiantInfo.getFormationActuelle()!=null){
				    Formation formationActuelle = formationService.findByRef(etudiantInfo.getFormationActuelle().getRef());
				  if(formationActuelle == null)
				  etudiantInfo.setFormationActuelle(formationService.save(etudiantInfo.getFormationActuelle()));
				  else
				  etudiantInfo.setFormationActuelle(formationActuelle);
			  }
	    
	          if(etudiantInfo.getFonctionActuelle()!=null){
				    Fonction fonctionActuelle = fonctionService.findByRef(etudiantInfo.getFonctionActuelle().getRef());
				  if(fonctionActuelle == null)
				  etudiantInfo.setFonctionActuelle(fonctionService.save(etudiantInfo.getFonctionActuelle()));
				  else
				  etudiantInfo.setFonctionActuelle(fonctionActuelle);
			  }
	    
	          if(etudiantInfo.getCompte()!=null){
				    Utilisateur compte = utilisateurService.findByEmail(etudiantInfo.getCompte().getEmail());
				  if(compte == null)
				  etudiantInfo.setCompte(utilisateurService.save(etudiantInfo.getCompte()));
				  else
				  etudiantInfo.setCompte(compte);
			  }

	    EtudiantInfo savedEtudiantInfo = etudiantInfoDao.save(etudiantInfo);
               if(ListUtil.isNotEmpty(etudiantInfo.getExperiencesPro())){
		  savedEtudiantInfo.setExperiencesPro(fonctionService.save(prepareExperiencesPro(savedEtudiantInfo,etudiantInfo.getExperiencesPro())));
		 }
               if(ListUtil.isNotEmpty(etudiantInfo.getFormations())){
		  savedEtudiantInfo.setFormations(formationService.save(prepareFormations(savedEtudiantInfo,etudiantInfo.getFormations())));
		 }
               if(ListUtil.isNotEmpty(etudiantInfo.getDemandeRecu())){
		  savedEtudiantInfo.setDemandeRecu(demandeService.save(prepareDemandeRecu(savedEtudiantInfo,etudiantInfo.getDemandeRecu())));
		 }
               if(ListUtil.isNotEmpty(etudiantInfo.getDemandesEnvoye())){
		  savedEtudiantInfo.setDemandesEnvoye(demandeService.save(prepareDemandesEnvoye(savedEtudiantInfo,etudiantInfo.getDemandesEnvoye())));
		 }
	   return savedEtudiantInfo;
	}

    @Override
    public List<EtudiantInfo> save(List<EtudiantInfo> etudiantInfos){
		List<EtudiantInfo> list = new ArrayList<EtudiantInfo>();
		for(EtudiantInfo etudiantInfo: etudiantInfos){
		        list.add(save(etudiantInfo));	
		}
		return list;
	}

     private List<Fonction> prepareExperiencesPro(EtudiantInfo etudiantInfo,List<Fonction> fonctions){
		    for(Fonction fonction:fonctions ){
                  fonction.setOccupePar(etudiantInfo); 
			}
			return fonctions;
	  }
     private List<Formation> prepareFormations(EtudiantInfo etudiantInfo,List<Formation> formations){
		    for(Formation formation:formations ){
                  formation.getLaureats().add(etudiantInfo);
			}
			return formations;
	  }
     private List<Demande> prepareDemandeRecu(EtudiantInfo etudiantInfo,List<Demande> demandes){
		    for(Demande demande:demandes ){
                  demande.setDemandeA(etudiantInfo); 
			}
			return demandes;
	  }
     private List<Demande> prepareDemandesEnvoye(EtudiantInfo etudiantInfo,List<Demande> demandes){
		    for(Demande demande:demandes ){
                  demande.setDemandePar(etudiantInfo); 
			}
			return demandes;
	  }

   @Override
   public EtudiantInfo update(EtudiantInfo etudiantInfo){
     
    
		  EtudiantInfo foundedEtudiantInfo = findById(etudiantInfo.getId()); 
		       if(foundedEtudiantInfo==null)
	          return null;	  
	  
	   return  etudiantInfoDao.save(etudiantInfo);
     
     }
    
	@Override
	@Transactional
	public int delete(EtudiantInfo etudiantInfo){

	        if(etudiantInfo.getCne()==null)
			  return -1;
		
			EtudiantInfo foundedEtudiantInfo = findByCne(etudiantInfo.getCne());
	       if(foundedEtudiantInfo==null)
	          return -1;  
	   etudiantInfoDao.delete(foundedEtudiantInfo);
	   return 1;
	}


	public List<EtudiantInfo> findByCriteria(EtudiantInfoVo etudiantInfoVo){
      String query = "SELECT o FROM EtudiantInfo o where 1=1 ";
		 	 query += SearchUtil.addConstraint( "o", "anneFinEtude","=",etudiantInfoVo.getAnneFinEtude());
			 query += SearchUtil.addConstraint( "o", "prenom","LIKE",etudiantInfoVo.getPrenom());

			 query += SearchUtil.addConstraint( "o", "nom","LIKE",etudiantInfoVo.getNom());

			 query += SearchUtil.addConstraint( "o", "linkedIn","LIKE",etudiantInfoVo.getLinkedIn());

			 query += SearchUtil.addConstraint( "o", "cne","LIKE",etudiantInfoVo.getCne());

			 query += SearchUtil.addConstraint( "o", "codeApogee","LIKE",etudiantInfoVo.getCodeApogee());

		 	 query += SearchUtil.addConstraint( "o", "id","=",etudiantInfoVo.getId());
	  query += SearchUtil.addConstraintMinMax("o","anneFinEtude",etudiantInfoVo.getAnneFinEtudeMin(),etudiantInfoVo.getAnneFinEtudeMax());
   if(etudiantInfoVo.getSexeVo()!=null){
     query += SearchUtil.addConstraint( "o", "sexe.id","=",etudiantInfoVo.getSexeVo().getId());
     query += SearchUtil.addConstraint( "o", "sexe.ref","LIKE",etudiantInfoVo.getSexeVo().getRef());
   }
   
   if(etudiantInfoVo.getFormationActuelleVo()!=null){
     query += SearchUtil.addConstraint( "o", "formationActuelle.id","=",etudiantInfoVo.getFormationActuelleVo().getId());
     query += SearchUtil.addConstraint( "o", "formationActuelle.ref","LIKE",etudiantInfoVo.getFormationActuelleVo().getRef());
   }
   
   if(etudiantInfoVo.getFonctionActuelleVo()!=null){
     query += SearchUtil.addConstraint( "o", "fonctionActuelle.id","=",etudiantInfoVo.getFonctionActuelleVo().getId());
     query += SearchUtil.addConstraint( "o", "fonctionActuelle.ref","LIKE",etudiantInfoVo.getFonctionActuelleVo().getRef());
   }
   
   if(etudiantInfoVo.getCompteVo()!=null){
     query += SearchUtil.addConstraint( "o", "compte.id","=",etudiantInfoVo.getCompteVo().getId());
     query += SearchUtil.addConstraint( "o", "compte.email","LIKE",etudiantInfoVo.getCompteVo().getEmail());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
