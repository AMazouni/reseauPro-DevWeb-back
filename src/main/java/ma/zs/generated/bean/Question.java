package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Question {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String formule ;
     private String reponseCorrecte ;
     private String ref ;


     public Question(){
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
     public String getFormule(){
          return this.formule;
     }
     public void setFormule(String formule){
          this.formule = formule;
     }
     public String getReponseCorrecte(){
          return this.reponseCorrecte;
     }
     public void setReponseCorrecte(String reponseCorrecte){
          this.reponseCorrecte = reponseCorrecte;
     }



}

