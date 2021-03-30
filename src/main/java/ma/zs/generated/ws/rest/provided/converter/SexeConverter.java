package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Sexe; 
import ma.zs.generated.ws.rest.provided.vo.SexeVo;

@Component 
public class SexeConverter extends AbstractConverter<Sexe,SexeVo>{ 
	

	public  SexeConverter(){
		init(true);
	}

	@Override 
 	public Sexe toItem(SexeVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Sexe item = new Sexe();
			 if(StringUtil.isNotEmpty(vo.getLibelle()))
                  item.setLibelle(vo.getLibelle());
			 if(StringUtil.isNotEmpty(vo.getIcon()))
                  item.setIcon(vo.getIcon());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));


		return item;
 		}
 	}

 	 @Override 
 	public SexeVo toVo(Sexe item) {
 		if (item == null) {
    		return null;
      	} else {
			SexeVo vo = new SexeVo();

			if(StringUtil.isNotEmpty(item.getLibelle()))
				vo.setLibelle(item.getLibelle());
			
			if(StringUtil.isNotEmpty(item.getIcon()))
				vo.setIcon(item.getIcon());
			
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
	}


	

	
	
}