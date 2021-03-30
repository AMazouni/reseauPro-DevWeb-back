package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.OffreTags; 
import ma.zs.generated.ws.rest.provided.vo.OffreTagsVo;

@Component 
public class OffreTagsConverter extends AbstractConverter<OffreTags,OffreTagsVo>{ 
	

	public  OffreTagsConverter(){
		init(true);
	}

	@Override 
 	public OffreTags toItem(OffreTagsVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	OffreTags item = new OffreTags();
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
			 if(StringUtil.isNotEmpty(vo.getLibellee()))
                  item.setLibellee(vo.getLibellee());


		return item;
 		}
 	}

 	 @Override 
 	public OffreTagsVo toVo(OffreTags item) {
 		if (item == null) {
    		return null;
      	} else {
			OffreTagsVo vo = new OffreTagsVo();

			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
			if(StringUtil.isNotEmpty(item.getLibellee()))
				vo.setLibellee(item.getLibellee());
			

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
	}


	

	
	
}