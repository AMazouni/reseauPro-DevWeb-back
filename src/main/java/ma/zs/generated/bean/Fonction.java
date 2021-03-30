package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.Entreprise;
import ma.zs.generated.bean.EtudiantInfo;

@Entity
public class Fonction {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date deteFin ;
     private String titre ;
     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date dateDebut ;
     private String description ;
     private String ref ;

     @ManyToOne
	private Entreprise entreprise ;
     @ManyToOne
	private EtudiantInfo occupePar ;

     public Fonction(){
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
     public String getTitre(){
          return this.titre;
     }
     public void setTitre(String titre){
          this.titre = titre;
     }
     public Date getDateDebut(){
          return this.dateDebut;
     }
     public void setDateDebut(Date dateDebut){
          this.dateDebut = dateDebut;
     }
     public Date getDeteFin(){
          return this.deteFin;
     }
     public void setDeteFin(Date deteFin){
          this.deteFin = deteFin;
     }
     public Entreprise getEntreprise(){
          return this.entreprise;
     }
     public void setEntreprise(Entreprise entreprise){
          this.entreprise = entreprise;
     }
     public EtudiantInfo getOccupePar(){
          return this.occupePar;
     }
     public void setOccupePar(EtudiantInfo occupePar){
          this.occupePar = occupePar;
     }
     public String getDescription(){
          return this.description;
     }
     public void setDescription(String description){
          this.description = description;
     }



}

