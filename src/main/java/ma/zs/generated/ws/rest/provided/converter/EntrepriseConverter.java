package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Entreprise; 
import ma.zs.generated.ws.rest.provided.vo.EntrepriseVo;

@Component 
public class EntrepriseConverter extends AbstractConverter<Entreprise,EntrepriseVo>{ 
	
	   @Autowired
         private FonctionConverter fonctionConverter ;
    private Boolean fonctionsLaureat;

	public  EntrepriseConverter(){
		init(true);
	}

	@Override 
 	public Entreprise toItem(EntrepriseVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Entreprise item = new Entreprise();
			 if(StringUtil.isNotEmpty(vo.getLocalisation()))
                  item.setLocalisation(vo.getLocalisation());
			 if(StringUtil.isNotEmpty(vo.getDescription()))
                  item.setDescription(vo.getDescription());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getNom()))
                  item.setNom(vo.getNom());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));

	         if(ListUtil.isNotEmpty(vo.getFonctionsLaureatVo()) && this.fonctionsLaureat)
                  item.setFonctionsLaureat(fonctionConverter.toItem(vo.getFonctionsLaureatVo()));



		return item;
 		}
 	}

 	 @Override 
 	public EntrepriseVo toVo(Entreprise item) {
 		if (item == null) {
    		return null;
      	} else {
			EntrepriseVo vo = new EntrepriseVo();

			if(StringUtil.isNotEmpty(item.getLocalisation()))
				vo.setLocalisation(item.getLocalisation());
			
			if(StringUtil.isNotEmpty(item.getDescription()))
				vo.setDescription(item.getDescription());
			
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			if(StringUtil.isNotEmpty(item.getNom()))
				vo.setNom(item.getNom());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
	         if(ListUtil.isNotEmpty(item.getFonctionsLaureat()) && this.fonctionsLaureat){
				
				 fonctionConverter.init(false);
                vo.setFonctionsLaureatVo(fonctionConverter.toVo(item.getFonctionsLaureat()));
              	 fonctionConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       fonctionsLaureat = value;
	}


	

	
	   public FonctionConverter getFonctionConverter(){
		return this.fonctionConverter;
	}  
        public void setFonctionConverter(FonctionConverter fonctionConverter ){
		 this.fonctionConverter = fonctionConverter;
	}  
	
       public Boolean  isFonctionsLaureat(){
		 return this.fonctionsLaureat ;
	   }
		 public void  setFonctionsLaureat(Boolean fonctionsLaureat ){
            this.fonctionsLaureat  = fonctionsLaureat ;
		 }
}