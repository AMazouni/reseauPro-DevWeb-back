package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.Utilisateur;

@Entity
public class AdminInfo {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String nom ;
     private String prenom ;
     private String code ;

     @ManyToOne
	private Utilisateur compte ;

     public AdminInfo(){
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
     public Utilisateur getCompte(){
          return this.compte;
     }
     public void setCompte(Utilisateur compte){
          this.compte = compte;
     }



}

