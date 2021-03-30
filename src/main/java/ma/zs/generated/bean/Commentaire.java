package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.Publication;
import ma.zs.generated.bean.Utilisateur;

@Entity
public class Commentaire {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String comref ;
     private String contenu ;

     @ManyToOne
	private Publication publication ;
     @ManyToOne
	private Utilisateur postePar ;

     public Commentaire(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getComref(){
          return this.comref;
     }
     public void setComref(String comref){
          this.comref = comref;
     }
     public Publication getPublication(){
          return this.publication;
     }
     public void setPublication(Publication publication){
          this.publication = publication;
     }
     public Utilisateur getPostePar(){
          return this.postePar;
     }
     public void setPostePar(Utilisateur postePar){
          this.postePar = postePar;
     }
     public String getContenu(){
          return this.contenu;
     }
     public void setContenu(String contenu){
          this.contenu = contenu;
     }



}

