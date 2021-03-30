package ma.zs.generated.bean;

import javax.persistence.*;
import java.util.List;

import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.bean.Demande;

@Entity
public class Message {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String contenu ;
     private String ref ;
     private String objet ;

     @ManyToOne
	private Utilisateur emetteur ;
     @ManyToOne
	private Demande demandeConcerne ;
     @ManyToMany
     private List<Utilisateur> destinataire ;

     public Message(){
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
     public String getObjet(){
          return this.objet;
     }
     public void setObjet(String objet){
          this.objet = objet;
     }
     public Utilisateur getEmetteur(){
          return this.emetteur;
     }
     public void setEmetteur(Utilisateur emetteur){
          this.emetteur = emetteur;
     }
     public List<Utilisateur> getDestinataire(){
          return this.destinataire;
     }
     public void setDestinataire(List<Utilisateur> destinataire){
          this.destinataire = destinataire;
     }
     public String getContenu(){
          return this.contenu;
     }
     public void setContenu(String contenu){
          this.contenu = contenu;
     }
     public Demande getDemandeConcerne(){
          return this.demandeConcerne;
     }
     public void setDemandeConcerne(Demande demandeConcerne){
          this.demandeConcerne = demandeConcerne;
     }



}

