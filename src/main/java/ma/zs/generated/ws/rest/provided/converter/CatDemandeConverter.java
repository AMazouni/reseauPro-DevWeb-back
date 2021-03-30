package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.CatDemande; 
import ma.zs.generated.ws.rest.provided.vo.CatDemandeVo;

@Component 
public class CatDemandeConverter extends AbstractConverter<CatDemande,CatDemandeVo>{ 
	

	public  CatDemandeConverter(){
		init(true);
	}

	@Override 
 	public CatDemande toItem(CatDemandeVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	CatDemande item = new CatDemande();
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getLibellee()))
                  item.setLibellee(vo.getLibellee());


		return item;
 		}
 	}

 	 @Override 
 	public CatDemandeVo toVo(CatDemande item) {
 		if (item == null) {
    		return null;
      	} else {
			CatDemandeVo vo = new CatDemandeVo();

			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			if(StringUtil.isNotEmpty(item.getLibellee()))
				vo.setLibellee(item.getLibellee());
			

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
	}


	

	
	
}