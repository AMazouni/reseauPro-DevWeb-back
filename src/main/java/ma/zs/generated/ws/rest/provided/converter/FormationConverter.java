package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Formation; 
import ma.zs.generated.ws.rest.provided.vo.FormationVo;

@Component 
public class FormationConverter extends AbstractConverter<Formation,FormationVo>{ 
	
	   @Autowired
         private ProfesseurInfoConverter professeurInfoConverter ;
	   @Autowired
         private EtudiantInfoConverter etudiantInfoConverter ;
	   @Autowired
         private EtablissementConverter etablissementConverter ;
    private Boolean etablissement;
    private Boolean responsable;
    private Boolean laureats;
    private Boolean etudiantsAct;

	public  FormationConverter(){
		init(true);
	}

	@Override 
 	public Formation toItem(FormationVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Formation item = new Formation();
			 if(StringUtil.isNotEmpty(vo.getIntitule()))
                  item.setIntitule(vo.getIntitule());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getDescription()))
                  item.setDescription(vo.getDescription());
             if(vo.getEtablissementVo()!=null && this.etablissement)
			     item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
             if(vo.getResponsableVo()!=null && this.responsable)
			     item.setResponsable(professeurInfoConverter.toItem(vo.getResponsableVo())) ;

	         if(ListUtil.isNotEmpty(vo.getLaureatsVo()) && this.laureats)
                  item.setLaureats(etudiantInfoConverter.toItem(vo.getLaureatsVo()));


	         if(ListUtil.isNotEmpty(vo.getEtudiantsActVo()) && this.etudiantsAct)
                  item.setEtudiantsAct(etudiantInfoConverter.toItem(vo.getEtudiantsActVo()));



		return item;
 		}
 	}

 	 @Override 
 	public FormationVo toVo(Formation item) {
 		if (item == null) {
    		return null;
      	} else {
			FormationVo vo = new FormationVo();

			if(StringUtil.isNotEmpty(item.getIntitule()))
				vo.setIntitule(item.getIntitule());
			
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getDescription()))
				vo.setDescription(item.getDescription());
			
            if(item.getEtablissement()!=null && this.etablissement) {
				   vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
			   } 
            if(item.getResponsable()!=null && this.responsable) {
				   vo.setResponsableVo(professeurInfoConverter.toVo(item.getResponsable())) ;
			   } 
	         if(ListUtil.isNotEmpty(item.getLaureats()) && this.laureats){
				
				 etudiantInfoConverter.init(false);
                vo.setLaureatsVo(etudiantInfoConverter.toVo(item.getLaureats()));
              	 etudiantInfoConverter.init(true);
			 }
	         if(ListUtil.isNotEmpty(item.getEtudiantsAct()) && this.etudiantsAct){
				
				 etudiantInfoConverter.init(false);
                vo.setEtudiantsActVo(etudiantInfoConverter.toVo(item.getEtudiantsAct()));
              	 etudiantInfoConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       etablissement = value;
       responsable = value;
       laureats = value;
       etudiantsAct = value;
	}


	

	
	   public ProfesseurInfoConverter getProfesseurInfoConverter(){
		return this.professeurInfoConverter;
	}  
        public void setProfesseurInfoConverter(ProfesseurInfoConverter professeurInfoConverter ){
		 this.professeurInfoConverter = professeurInfoConverter;
	}  
	   public EtudiantInfoConverter getEtudiantInfoConverter(){
		return this.etudiantInfoConverter;
	}  
        public void setEtudiantInfoConverter(EtudiantInfoConverter etudiantInfoConverter ){
		 this.etudiantInfoConverter = etudiantInfoConverter;
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
	 public boolean  isResponsable(){
		  return this.responsable;
	 }
	 public void  setResponsable(boolean responsable){
		   this.responsable = responsable;
	 }
       public Boolean  isLaureats(){
		 return this.laureats ;
	   }
		 public void  setLaureats(Boolean laureats ){
            this.laureats  = laureats ;
		 }
       public Boolean  isEtudiantsAct(){
		 return this.etudiantsAct ;
	   }
		 public void  setEtudiantsAct(Boolean etudiantsAct ){
            this.etudiantsAct  = etudiantsAct ;
		 }
}