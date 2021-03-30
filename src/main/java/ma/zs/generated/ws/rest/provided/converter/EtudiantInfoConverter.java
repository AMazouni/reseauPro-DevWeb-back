package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.EtudiantInfo; 
import ma.zs.generated.ws.rest.provided.vo.EtudiantInfoVo;

@Component 
public class EtudiantInfoConverter extends AbstractConverter<EtudiantInfo,EtudiantInfoVo>{ 
	
	   @Autowired
         private FonctionConverter fonctionConverter ;
	   @Autowired
         private DemandeConverter demandeConverter ;
	   @Autowired
         private SexeConverter sexeConverter ;
	   @Autowired
         private FormationConverter formationConverter ;
	   @Autowired
         private UtilisateurConverter utilisateurConverter ;
    private Boolean sexe;
    private Boolean formationActuelle;
    private Boolean fonctionActuelle;
    private Boolean compte;
    private Boolean experiencesPro;
    private Boolean formations;
    private Boolean demandeRecu;
    private Boolean demandesEnvoye;

	public  EtudiantInfoConverter(){
		init(true);
	}

	@Override 
 	public EtudiantInfo toItem(EtudiantInfoVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	EtudiantInfo item = new EtudiantInfo();
			 if(vo.getAnneFinEtude()!=null)
			      item.setAnneFinEtude(Integer.parseInt(vo.getAnneFinEtude()));
			 if(StringUtil.isNotEmpty(vo.getPrenom()))
                  item.setPrenom(vo.getPrenom());
			 if(StringUtil.isNotEmpty(vo.getNom()))
                  item.setNom(vo.getNom());
			 if(StringUtil.isNotEmpty(vo.getLinkedIn()))
                  item.setLinkedIn(vo.getLinkedIn());
			 if(StringUtil.isNotEmpty(vo.getCne()))
                  item.setCne(vo.getCne());
			 if(StringUtil.isNotEmpty(vo.getCodeApogee()))
                  item.setCodeApogee(vo.getCodeApogee());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getSexeVo()!=null && this.sexe)
			     item.setSexe(sexeConverter.toItem(vo.getSexeVo())) ;
             if(vo.getFormationActuelleVo()!=null && this.formationActuelle)
			     item.setFormationActuelle(formationConverter.toItem(vo.getFormationActuelleVo())) ;
             if(vo.getFonctionActuelleVo()!=null && this.fonctionActuelle)
			     item.setFonctionActuelle(fonctionConverter.toItem(vo.getFonctionActuelleVo())) ;
             if(vo.getCompteVo()!=null && this.compte)
			     item.setCompte(utilisateurConverter.toItem(vo.getCompteVo())) ;

	         if(ListUtil.isNotEmpty(vo.getExperiencesProVo()) && this.experiencesPro)
                  item.setExperiencesPro(fonctionConverter.toItem(vo.getExperiencesProVo()));


	         if(ListUtil.isNotEmpty(vo.getFormationsVo()) && this.formations)
                  item.setFormations(formationConverter.toItem(vo.getFormationsVo()));


	         if(ListUtil.isNotEmpty(vo.getDemandeRecuVo()) && this.demandeRecu)
                  item.setDemandeRecu(demandeConverter.toItem(vo.getDemandeRecuVo()));


	         if(ListUtil.isNotEmpty(vo.getDemandesEnvoyeVo()) && this.demandesEnvoye)
                  item.setDemandesEnvoye(demandeConverter.toItem(vo.getDemandesEnvoyeVo()));



		return item;
 		}
 	}

 	 @Override 
 	public EtudiantInfoVo toVo(EtudiantInfo item) {
 		if (item == null) {
    		return null;
      	} else {
			EtudiantInfoVo vo = new EtudiantInfoVo();

			 if(item.getAnneFinEtude()!=0 )
				vo.setAnneFinEtude(NumberUtil.toString(item.getAnneFinEtude()));
			if(StringUtil.isNotEmpty(item.getPrenom()))
				vo.setPrenom(item.getPrenom());
			
			if(StringUtil.isNotEmpty(item.getNom()))
				vo.setNom(item.getNom());
			
			if(StringUtil.isNotEmpty(item.getLinkedIn()))
				vo.setLinkedIn(item.getLinkedIn());
			
			if(StringUtil.isNotEmpty(item.getCne()))
				vo.setCne(item.getCne());
			
			if(StringUtil.isNotEmpty(item.getCodeApogee()))
				vo.setCodeApogee(item.getCodeApogee());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getSexe()!=null && this.sexe) {
				   vo.setSexeVo(sexeConverter.toVo(item.getSexe())) ;
			   } 
            if(item.getFormationActuelle()!=null && this.formationActuelle) {
				   vo.setFormationActuelleVo(formationConverter.toVo(item.getFormationActuelle())) ;
			   } 
            if(item.getFonctionActuelle()!=null && this.fonctionActuelle) {
                fonctionConverter.setOccupePar(false);
				   vo.setFonctionActuelleVo(fonctionConverter.toVo(item.getFonctionActuelle())) ;
                fonctionConverter.setOccupePar(true);
			   } 
            if(item.getCompte()!=null && this.compte) {
                utilisateurConverter.setEtudiantInfo(false);
                utilisateurConverter.setLaureatInfo(false);
				   vo.setCompteVo(utilisateurConverter.toVo(item.getCompte())) ;
                utilisateurConverter.setEtudiantInfo(true);
                utilisateurConverter.setLaureatInfo(true);
			   } 
	         if(ListUtil.isNotEmpty(item.getExperiencesPro()) && this.experiencesPro){
				
				 fonctionConverter.init(false);
                vo.setExperiencesProVo(fonctionConverter.toVo(item.getExperiencesPro()));
              	 fonctionConverter.init(true);
			 }
	         if(ListUtil.isNotEmpty(item.getFormations()) && this.formations){
				
				 formationConverter.init(false);
                vo.setFormationsVo(formationConverter.toVo(item.getFormations()));
              	 formationConverter.init(true);
			 }
	         if(ListUtil.isNotEmpty(item.getDemandeRecu()) && this.demandeRecu){
				
				 demandeConverter.init(false);
                vo.setDemandeRecuVo(demandeConverter.toVo(item.getDemandeRecu()));
              	 demandeConverter.init(true);
			 }
	         if(ListUtil.isNotEmpty(item.getDemandesEnvoye()) && this.demandesEnvoye){
				
				 demandeConverter.init(false);
                vo.setDemandesEnvoyeVo(demandeConverter.toVo(item.getDemandesEnvoye()));
              	 demandeConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       sexe = value;
       formationActuelle = value;
       fonctionActuelle = value;
       compte = value;
       experiencesPro = value;
       formations = value;
       demandeRecu = value;
       demandesEnvoye = value;
	}


	

	
	   public FonctionConverter getFonctionConverter(){
		return this.fonctionConverter;
	}  
        public void setFonctionConverter(FonctionConverter fonctionConverter ){
		 this.fonctionConverter = fonctionConverter;
	}  
	   public DemandeConverter getDemandeConverter(){
		return this.demandeConverter;
	}  
        public void setDemandeConverter(DemandeConverter demandeConverter ){
		 this.demandeConverter = demandeConverter;
	}  
	   public SexeConverter getSexeConverter(){
		return this.sexeConverter;
	}  
        public void setSexeConverter(SexeConverter sexeConverter ){
		 this.sexeConverter = sexeConverter;
	}  
	   public FormationConverter getFormationConverter(){
		return this.formationConverter;
	}  
        public void setFormationConverter(FormationConverter formationConverter ){
		 this.formationConverter = formationConverter;
	}  
	   public UtilisateurConverter getUtilisateurConverter(){
		return this.utilisateurConverter;
	}  
        public void setUtilisateurConverter(UtilisateurConverter utilisateurConverter ){
		 this.utilisateurConverter = utilisateurConverter;
	}  
	
	 public boolean  isSexe(){
		  return this.sexe;
	 }
	 public void  setSexe(boolean sexe){
		   this.sexe = sexe;
	 }
	 public boolean  isFormationActuelle(){
		  return this.formationActuelle;
	 }
	 public void  setFormationActuelle(boolean formationActuelle){
		   this.formationActuelle = formationActuelle;
	 }
	 public boolean  isFonctionActuelle(){
		  return this.fonctionActuelle;
	 }
	 public void  setFonctionActuelle(boolean fonctionActuelle){
		   this.fonctionActuelle = fonctionActuelle;
	 }
	 public boolean  isCompte(){
		  return this.compte;
	 }
	 public void  setCompte(boolean compte){
		   this.compte = compte;
	 }
       public Boolean  isExperiencesPro(){
		 return this.experiencesPro ;
	   }
		 public void  setExperiencesPro(Boolean experiencesPro ){
            this.experiencesPro  = experiencesPro ;
		 }
       public Boolean  isFormations(){
		 return this.formations ;
	   }
		 public void  setFormations(Boolean formations ){
            this.formations  = formations ;
		 }
       public Boolean  isDemandeRecu(){
		 return this.demandeRecu ;
	   }
		 public void  setDemandeRecu(Boolean demandeRecu ){
            this.demandeRecu  = demandeRecu ;
		 }
       public Boolean  isDemandesEnvoye(){
		 return this.demandesEnvoye ;
	   }
		 public void  setDemandesEnvoye(Boolean demandesEnvoye ){
            this.demandesEnvoye  = demandesEnvoye ;
		 }
}