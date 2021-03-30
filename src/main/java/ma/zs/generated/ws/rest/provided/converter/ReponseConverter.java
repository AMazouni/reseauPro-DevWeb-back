package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Reponse; 
import ma.zs.generated.ws.rest.provided.vo.ReponseVo;

@Component 
public class ReponseConverter extends AbstractConverter<Reponse,ReponseVo>{ 
	
	   @Autowired
         private QuestionConverter questionConverter ;
    private Boolean question;

	public  ReponseConverter(){
		init(true);
	}

	@Override 
 	public Reponse toItem(ReponseVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Reponse item = new Reponse();
			 if(StringUtil.isNotEmpty(vo.getReponse()))
                  item.setReponse(vo.getReponse());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getQuestionVo()!=null && this.question)
			     item.setQuestion(questionConverter.toItem(vo.getQuestionVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public ReponseVo toVo(Reponse item) {
 		if (item == null) {
    		return null;
      	} else {
			ReponseVo vo = new ReponseVo();

			if(StringUtil.isNotEmpty(item.getReponse()))
				vo.setReponse(item.getReponse());
			
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getQuestion()!=null && this.question) {
				   vo.setQuestionVo(questionConverter.toVo(item.getQuestion())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       question = value;
	}


	

	
	   public QuestionConverter getQuestionConverter(){
		return this.questionConverter;
	}  
        public void setQuestionConverter(QuestionConverter questionConverter ){
		 this.questionConverter = questionConverter;
	}  
	
	 public boolean  isQuestion(){
		  return this.question;
	 }
	 public void  setQuestion(boolean question){
		   this.question = question;
	 }
}