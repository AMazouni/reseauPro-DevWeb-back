package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.ProfesseurInfo; 
import ma.zs.generated.ws.rest.provided.vo.ProfesseurInfoVo;

@Component 
public class ProfesseurInfoConverter extends AbstractConverter<ProfesseurInfo,ProfesseurInfoVo>{ 
	
	   @Autowired
         private FormationConverter formationConverter ;
	   @Autowired
         private UtilisateurConverter utilisateurConverter ;
	   @Autowired
         private EtablissementConverter etablissementConverter ;
    private Boolean etablissement;
    private Boolean compte;
    private Boolean responsableDe;

	public  ProfesseurInfoConverter(){
		init(true);
	}

	@Override 
 	public ProfesseurInfo toItem(ProfesseurInfoVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	ProfesseurInfo item = new ProfesseurInfo();
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(vo.getCode());
			 if(StringUtil.isNotEmpty(vo.getPrenom()))
                  item.setPrenom(vo.getPrenom());
			 if(StringUtil.isNotEmpty(vo.getNom()))
                  item.setNom(vo.getNom());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getEtablissementVo()!=null && this.etablissement)
			     item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
             if(vo.getCompteVo()!=null && this.compte)
			     item.setCompte(utilisateurConverter.toItem(vo.getCompteVo())) ;

	         if(ListUtil.isNotEmpty(vo.getResponsableDeVo()) && this.responsableDe)
                  item.setResponsableDe(formationConverter.toItem(vo.getResponsableDeVo()));



		return item;
 		}
 	}

 	 @Override 
 	public ProfesseurInfoVo toVo(ProfesseurInfo item) {
 		if (item == null) {
    		return null;
      	} else {
			ProfesseurInfoVo vo = new ProfesseurInfoVo();

			if(StringUtil.isNotEmpty(item.getCode()))
				vo.setCode(item.getCode());
			
			if(StringUtil.isNotEmpty(item.getPrenom()))
				vo.setPrenom(item.getPrenom());
			
			if(StringUtil.isNotEmpty(item.getNom()))
				vo.setNom(item.getNom());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getEtablissement()!=null && this.etablissement) {
				   vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
			   } 
            if(item.getCompte()!=null && this.compte) {
                utilisateurConverter.setProfesseurInfo(false);
				   vo.setCompteVo(utilisateurConverter.toVo(item.getCompte())) ;
                utilisateurConverter.setProfesseurInfo(true);
			   } 
	         if(ListUtil.isNotEmpty(item.getResponsableDe()) && this.responsableDe){
				
				 formationConverter.init(false);
                vo.setResponsableDeVo(formationConverter.toVo(item.getResponsableDe()));
              	 formationConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       etablissement = value;
       compte = value;
       responsableDe = value;
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
	   public EtablissementConverter getEtablissementConverter(){
		return this.etablissementConverter;
	}  
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
		 this.etablissementConverter = etablissementConverter;
	}  
	
	 public boolean  isEtablissement(){
		  return this.etablissement;
	 }
	 public void  setEtablissement(boolean etablissement){
		   this.etablissement = etablissement;
	 }
	 public boolean  isCompte(){
		  return this.compte;
	 }
	 public void  setCompte(boolean compte){
		   this.compte = compte;
	 }
       public Boolean  isResponsableDe(){
		 return this.responsableDe ;
	   }
		 public void  setResponsableDe(Boolean responsableDe ){
            this.responsableDe  = responsableDe ;
		 }
}