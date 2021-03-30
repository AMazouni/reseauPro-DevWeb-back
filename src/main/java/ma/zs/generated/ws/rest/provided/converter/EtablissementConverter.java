package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Etablissement; 
import ma.zs.generated.ws.rest.provided.vo.EtablissementVo;

@Component 
public class EtablissementConverter extends AbstractConverter<Etablissement,EtablissementVo>{ 
	
	   @Autowired
         private FormationConverter formationConverter ;
    private Boolean formations;

	public  EtablissementConverter(){
		init(true);
	}

	@Override 
 	public Etablissement toItem(EtablissementVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Etablissement item = new Etablissement();
			 if(StringUtil.isNotEmpty(vo.getNom()))
                  item.setNom(vo.getNom());
			 if(StringUtil.isNotEmpty(vo.getDescription()))
                  item.setDescription(vo.getDescription());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());

	         if(ListUtil.isNotEmpty(vo.getFormationsVo()) && this.formations)
                  item.setFormations(formationConverter.toItem(vo.getFormationsVo()));



		return item;
 		}
 	}

 	 @Override 
 	public EtablissementVo toVo(Etablissement item) {
 		if (item == null) {
    		return null;
      	} else {
			EtablissementVo vo = new EtablissementVo();

			if(StringUtil.isNotEmpty(item.getNom()))
				vo.setNom(item.getNom());
			
			if(StringUtil.isNotEmpty(item.getDescription()))
				vo.setDescription(item.getDescription());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
	         if(ListUtil.isNotEmpty(item.getFormations()) && this.formations){
				
				 formationConverter.init(false);
                vo.setFormationsVo(formationConverter.toVo(item.getFormations()));
              	 formationConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       formations = value;
	}


	

	
	   public FormationConverter getFormationConverter(){
		return this.formationConverter;
	}  
        public void setFormationConverter(FormationConverter formationConverter ){
		 this.formationConverter = formationConverter;
	}  
	
       public Boolean  isFormations(){
		 return this.formations ;
	   }
		 public void  setFormations(Boolean formations ){
            this.formations  = formations ;
		 }
}