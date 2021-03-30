package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Question; 
import ma.zs.generated.ws.rest.provided.vo.QuestionVo;

@Component 
public class QuestionConverter extends AbstractConverter<Question,QuestionVo>{ 
	

	public  QuestionConverter(){
		init(true);
	}

	@Override 
 	public Question toItem(QuestionVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Question item = new Question();
			 if(StringUtil.isNotEmpty(vo.getFormule()))
                  item.setFormule(vo.getFormule());
			 if(StringUtil.isNotEmpty(vo.getReponseCorrecte()))
                  item.setReponseCorrecte(vo.getReponseCorrecte());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));


		return item;
 		}
 	}

 	 @Override 
 	public QuestionVo toVo(Question item) {
 		if (item == null) {
    		return null;
      	} else {
			QuestionVo vo = new QuestionVo();

			if(StringUtil.isNotEmpty(item.getFormule()))
				vo.setFormule(item.getFormule());
			
			if(StringUtil.isNotEmpty(item.getReponseCorrecte()))
				vo.setReponseCorrecte(item.getReponseCorrecte());
			
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