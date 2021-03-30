package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.Etablissement;
import ma.zs.generated.bean.Utilisateur;

@Entity
public class ProfesseurInfo {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String code ;
     private String prenom ;
     private String nom ;

     @ManyToOne
	private Etablissement etablissement ;
     @ManyToOne
	private Utilisateur compte ;
     @OneToMany(mappedBy = "responsable")
     private List<Formation> responsableDe ;

     public ProfesseurInfo(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getCode(){
          return this.code;
     }
     public void setCode(String code){
          this.code = code;
     }
     public String getNom(){
          return this.nom;
     }
     public void setNom(String nom){
          this.nom = nom;
     }
     public String getPrenom(){
          return this.prenom;
     }
     public void setPrenom(String prenom){
          this.prenom = prenom;
     }
     public Etablissement getEtablissement(){
          return this.etablissement;
     }
     public void setEtablissement(Etablissement etablissement){
          this.etablissement = etablissement;
     }
     public List<Formation> getResponsableDe(){
          return this.responsableDe;
     }
     public void setResponsableDe(List<Formation> responsableDe){
          this.responsableDe = responsableDe;
     }
     public Utilisateur getCompte(){
          return this.compte;
     }
     public void setCompte(Utilisateur compte){
          this.compte = compte;
     }



}

