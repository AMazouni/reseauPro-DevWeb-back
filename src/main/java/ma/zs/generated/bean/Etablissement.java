package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Etablissement {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String nom ;
     private String description ;
     private String ref ;

     @OneToMany(mappedBy = "etablissement")
     private List<Formation> formations ;

     public Etablissement(){
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
     public String getNom(){
          return this.nom;
     }
     public void setNom(String nom){
          this.nom = nom;
     }
     public List<Formation> getFormations(){
          return this.formations;
     }
     public void setFormations(List<Formation> formations){
          this.formations = formations;
     }
     public String getDescription(){
          return this.description;
     }
     public void setDescription(String description){
          this.description = description;
     }



}

