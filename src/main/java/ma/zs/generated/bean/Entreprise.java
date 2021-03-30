package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Entreprise {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String Localisation ;
     private String description ;
     private String ref ;
     private String nom ;

     @OneToMany(mappedBy = "entreprise")
     private List<Fonction> fonctionsLaureat ;

     public Entreprise(){
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
     public String getLocalisation(){
          return this.Localisation;
     }
     public void setLocalisation(String Localisation){
          this.Localisation = Localisation;
     }
     public List<Fonction> getFonctionsLaureat(){
          return this.fonctionsLaureat;
     }
     public void setFonctionsLaureat(List<Fonction> fonctionsLaureat){
          this.fonctionsLaureat = fonctionsLaureat;
     }
     public String getDescription(){
          return this.description;
     }
     public void setDescription(String description){
          this.description = description;
     }



}

