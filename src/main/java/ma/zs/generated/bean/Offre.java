package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.OneToMany;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.OffreTags;
import ma.zs.generated.bean.Fonction;

@Entity
public class Offre {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date dateOffre ;
     private String titre ;
     private String infoSup ;
     private String type ;
     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date dernierDelai ;
     private String ref ;

     @ManyToOne
	private OffreTags tags ;
     @ManyToOne
	private Fonction fonction ;
     @OneToMany(mappedBy = "offreConcerne")
     private List<Candidature> candidatures ;

     public Offre(){
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
     public Fonction getFonction(){
          return this.fonction;
     }
     public void setFonction(Fonction fonction){
          this.fonction = fonction;
     }
     public String getInfoSup(){
          return this.infoSup;
     }
     public void setInfoSup(String infoSup){
          this.infoSup = infoSup;
     }
     public OffreTags getTags(){
          return this.tags;
     }
     public void setTags(OffreTags tags){
          this.tags = tags;
     }
     public Date getDateOffre(){
          return this.dateOffre;
     }
     public void setDateOffre(Date dateOffre){
          this.dateOffre = dateOffre;
     }
     public Date getDernierDelai(){
          return this.dernierDelai;
     }
     public void setDernierDelai(Date dernierDelai){
          this.dernierDelai = dernierDelai;
     }
     public List<Candidature> getCandidatures(){
          return this.candidatures;
     }
     public void setCandidatures(List<Candidature> candidatures){
          this.candidatures = candidatures;
     }
     public String getType(){
          return this.type;
     }
     public void setType(String type){
          this.type = type;
     }



}

