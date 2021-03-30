package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;

public class EntrepriseVo {

     private String Localisation ;
   
     private String description ;
   
     private String ref ;
   
     private String nom ;
   
     private String id ;
   


     private List<FonctionVo> fonctionsLaureatVo ;


 public EntrepriseVo(){
       super();
     }


     public String getLocalisation(){
          return this.Localisation;
     }
      public void setLocalisation(String Localisation){
          this.Localisation = Localisation;
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


     public String getNom(){
          return this.nom;
     }
      public void setNom(String nom){
          this.nom = nom;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     


      public List<FonctionVo> getFonctionsLaureatVo(){
          return this.fonctionsLaureatVo;
     }
       
     public void setFonctionsLaureatVo(List<FonctionVo> fonctionsLaureatVo){
          this.fonctionsLaureatVo = fonctionsLaureatVo;
     }



}