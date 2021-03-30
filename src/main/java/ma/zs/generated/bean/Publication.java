package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.Utilisateur;

@Entity
public class Publication {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String contenu ;
     private Boolean verified;
     private String ref ;

     @ManyToOne
	private Utilisateur postePar ;
     @OneToMany(mappedBy = "publication")
     private List<Commentaire> commentaire ;

     public Publication(){
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
    public Boolean isVerified(){
          return this.verified;
     }
       public void setVerified(Boolean verified){
          this.verified = verified;
     }
     public List<Commentaire> getCommentaire(){
          return this.commentaire;
     }
     public void setCommentaire(List<Commentaire> commentaire){
          this.commentaire = commentaire;
     }



}

