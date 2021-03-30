package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.Question;

@Entity
public class Reponse {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String reponse ;
     private String ref ;

     @ManyToOne
	private Question question ;

     public Reponse(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getRef(){
          return this.ref;
     }
     public void setRef(String ref){
          this.ref = ref;
     }
     public Question getQuestion(){
          return this.question;
     }
     public void setQuestion(Question question){
          this.question = question;
     }
     public String getReponse(){
          return this.reponse;
     }
     public void setReponse(String reponse){
          this.reponse = reponse;
     }



}

