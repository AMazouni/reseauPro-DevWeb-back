package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Status; 
import ma.zs.generated.ws.rest.provided.vo.StatusVo;

@Component 
public class StatusConverter extends AbstractConverter<Status,StatusVo>{ 
	

	public  StatusConverter(){
		init(true);
	}

	@Override 
 	public Status toItem(StatusVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Status item = new Status();
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(vo.getCode());
			 if(StringUtil.isNotEmpty(vo.getLibelle()))
                  item.setLibelle(vo.getLibelle());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));


		return item;
 		}
 	}

 	 @Override 
 	public StatusVo toVo(Status item) {
 		if (item == null) {
    		return null;
      	} else {
			StatusVo vo = new StatusVo();

			if(StringUtil.isNotEmpty(item.getCode()))
				vo.setCode(item.getCode());
			
			if(StringUtil.isNotEmpty(item.getLibelle()))
				vo.setLibelle(item.getLibelle());
			
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