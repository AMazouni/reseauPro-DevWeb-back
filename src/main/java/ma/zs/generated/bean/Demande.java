package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.CatDemande;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.EtudiantInfo;

@Entity
public class Demande {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String objetDemande ;
     private String infoSupp ;
     private String ref ;

     @ManyToOne
	private CatDemande categorieDemande ;
     @ManyToOne
	private EtudiantInfo demandePar ;
     @ManyToOne
	private Status status ;
     @ManyToOne
	private EtudiantInfo demandeA ;
     @OneToMany(mappedBy = "demandeConcerne")
     private List<Message> messages ;

     public Demande(){
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
     public EtudiantInfo getDemandePar(){
          return this.demandePar;
     }
     public void setDemandePar(EtudiantInfo demandePar){
          this.demandePar = demandePar;
     }
     public EtudiantInfo getDemandeA(){
          return this.demandeA;
     }
     public void setDemandeA(EtudiantInfo demandeA){
          this.demandeA = demandeA;
     }
     public String getObjetDemande(){
          return this.objetDemande;
     }
     public void setObjetDemande(String objetDemande){
          this.objetDemande = objetDemande;
     }
     public CatDemande getCategorieDemande(){
          return this.categorieDemande;
     }
     public void setCategorieDemande(CatDemande categorieDemande){
          this.categorieDemande = categorieDemande;
     }
     public String getInfoSupp(){
          return this.infoSupp;
     }
     public void setInfoSupp(String infoSupp){
          this.infoSupp = infoSupp;
     }
     public Status getStatus(){
          return this.status;
     }
     public void setStatus(Status status){
          this.status = status;
     }
     public List<Message> getMessages(){
          return this.messages;
     }
     public void setMessages(List<Message> messages){
          this.messages = messages;
     }



}

