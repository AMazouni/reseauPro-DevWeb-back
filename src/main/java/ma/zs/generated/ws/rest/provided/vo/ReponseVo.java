package  ma.zs.generated.ws.rest.provided.vo;


public class ReponseVo {

     private String reponse ;
   
     private String ref ;
   
     private String id ;
   

	private QuestionVo questionVo ;



 public ReponseVo(){
       super();
     }


     public String getReponse(){
          return this.reponse;
     }
      public void setReponse(String reponse){
          this.reponse = reponse;
     }


     public String getRef(){
          return this.ref;
     }
      public void setRef(String ref){
          this.ref = ref;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     

      public QuestionVo getQuestionVo(){
          return this.questionVo;
     }
       
     public void setQuestionVo(QuestionVo questionVo){
          this.questionVo = questionVo;
     }
   




}