package ma.zs.generated.bean;

import javax.persistence.*;
import java.util.List;

import ma.zs.generated.bean.Etablissement;
import ma.zs.generated.bean.ProfesseurInfo;

@Entity
public class Formation {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String intitule ;
     private String ref ;
     private String description ;

     @ManyToOne
	private Etablissement etablissement ;
     @ManyToOne
	private ProfesseurInfo responsable ;
     @ManyToMany
     private List<EtudiantInfo> laureats ;
     @OneToMany(mappedBy = "formationActuelle")
     private List<EtudiantInfo> etudiantsAct ;

     public Formation(){
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
     public String getIntitule(){
          return this.intitule;
     }
     public void setIntitule(String intitule){
          this.intitule = intitule;
     }
     public Etablissement getEtablissement(){
          return this.etablissement;
     }
     public void setEtablissement(Etablissement etablissement){
          this.etablissement = etablissement;
     }
     public List<EtudiantInfo> getEtudiantsAct(){
          return this.etudiantsAct;
     }
     public void setEtudiantsAct(List<EtudiantInfo> etudiantsAct){
          this.etudiantsAct = etudiantsAct;
     }
     public List<EtudiantInfo> getLaureats(){
          return this.laureats;
     }
     public void setLaureats(List<EtudiantInfo> laureats){
          this.laureats = laureats;
     }
     public String getDescription(){
          return this.description;
     }
     public void setDescription(String description){
          this.description = description;
     }
     public ProfesseurInfo getResponsable(){
          return this.responsable;
     }
     public void setResponsable(ProfesseurInfo responsable){
          this.responsable = responsable;
     }



}

