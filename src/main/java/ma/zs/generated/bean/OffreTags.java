package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class OffreTags {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String ref ;
     private String libellee ;


     public OffreTags(){
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
     public String getLibellee(){
          return this.libellee;
     }
     public void setLibellee(String libellee){
          this.libellee = libellee;
     }



}

