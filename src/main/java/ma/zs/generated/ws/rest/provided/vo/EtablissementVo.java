package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;

public class EtablissementVo {

     private String nom ;
   
     private String description ;
   
     private String id ;
   
     private String ref ;
   


     private List<FormationVo> formationsVo ;


 public EtablissementVo(){
       super();
     }


     public String getNom(){
          return this.nom;
     }
      public void setNom(String nom){
          this.nom = nom;
     }


     public String getDescription(){
          return this.description;
     }
      public void setDescription(String description){
          this.description = description;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     public String getRef(){
          return this.ref;
     }
      public void setRef(String ref){
          this.ref = ref;
     }


     


      public List<FormationVo> getFormationsVo(){
          return this.formationsVo;
     }
       
     public void setFormationsVo(List<FormationVo> formationsVo){
          this.formationsVo = formationsVo;
     }



}