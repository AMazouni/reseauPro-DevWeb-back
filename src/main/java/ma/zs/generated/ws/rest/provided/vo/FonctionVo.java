package  ma.zs.generated.ws.rest.provided.vo;

import java.util.Date;

public class FonctionVo {

     private String deteFin ;
   
     private String titre ;
   
     private String dateDebut ;
   
     private String description ;
   
     private String ref ;
   
     private String id ;
   

	private EntrepriseVo entrepriseVo ;
	private EtudiantInfoVo occupeParVo ;


     private String deteFinMax ;
     private String deteFinMin ;
     private String dateDebutMax ;
     private String dateDebutMin ;

 public FonctionVo(){
       super();
     }


     public String getDeteFin(){
          return this.deteFin;
     }
      public void setDeteFin(String deteFin){
          this.deteFin = deteFin;
     }


     public String getTitre(){
          return this.titre;
     }
      public void setTitre(String titre){
          this.titre = titre;
     }


     public String getDateDebut(){
          return this.dateDebut;
     }
      public void setDateDebut(String dateDebut){
          this.dateDebut = dateDebut;
     }


     public String getDescription(){
          return this.description;
     }
      public void setDescription(String description){
          this.description = description;
     }


     public String getRef(){
          return this.ref;
     }
      public void setRef(String ref){
          this.ref = ref;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }



      public String getDeteFinMax(){
          return this.deteFinMax;
     }
     
      public String getDeteFinMin(){
          return this.deteFinMin;
     }

     public void setDeteFinMax(String deteFinMax){
          this.deteFinMax = deteFinMax;
     }

     public void setDeteFinMin(String deteFinMin){
          this.deteFinMin = deteFinMin;
     }
     
     

      public String getDateDebutMax(){
          return this.dateDebutMax;
     }
     
      public String getDateDebutMin(){
          return this.dateDebutMin;
     }

     public void setDateDebutMax(String dateDebutMax){
          this.dateDebutMax = dateDebutMax;
     }

     public void setDateDebutMin(String dateDebutMin){
          this.dateDebutMin = dateDebutMin;
     }
     
     
     

      public EntrepriseVo getEntrepriseVo(){
          return this.entrepriseVo;
     }
       
     public void setEntrepriseVo(EntrepriseVo entrepriseVo){
          this.entrepriseVo = entrepriseVo;
     }
   
      public EtudiantInfoVo getOccupeParVo(){
          return this.occupeParVo;
     }
       
     public void setOccupeParVo(EtudiantInfoVo occupeParVo){
          this.occupeParVo = occupeParVo;
     }
   




}