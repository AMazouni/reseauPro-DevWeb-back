package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.Offre;

@Entity
public class Candidature {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String lettreMotivation ;
     private String ref ;

     @ManyToOne
	private EtudiantInfo candidat ;
     @ManyToOne
	private Status status ;
     @ManyToOne
	private Offre offreConcerne ;

     public Candidature(){
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
     public Offre getOffreConcerne(){
          return this.offreConcerne;
     }
     public void setOffreConcerne(Offre offreConcerne){
          this.offreConcerne = offreConcerne;
     }
     public EtudiantInfo getCandidat(){
          return this.candidat;
     }
     public void setCandidat(EtudiantInfo candidat){
          this.candidat = candidat;
     }
     public String getLettreMotivation(){
          return this.lettreMotivation;
     }
     public void setLettreMotivation(String lettreMotivation){
          this.lettreMotivation = lettreMotivation;
     }
     public Status getStatus(){
          return this.status;
     }
     public void setStatus(Status status){
          this.status = status;
     }



}

