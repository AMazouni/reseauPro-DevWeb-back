package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;

public class FormationVo {

     private String intitule ;
   
     private String ref ;
   
     private String id ;
   
     private String description ;
   

	private EtablissementVo etablissementVo ;
	private ProfesseurInfoVo responsableVo ;

     private List<EtudiantInfoVo> laureatsVo ;
     private List<EtudiantInfoVo> etudiantsActVo ;


 public FormationVo(){
       super();
     }


     public String getIntitule(){
          return this.intitule;
     }
      public void setIntitule(String intitule){
          this.intitule = intitule;
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


     public String getDescription(){
          return this.description;
     }
      public void setDescription(String description){
          this.description = description;
     }


     

      public EtablissementVo getEtablissementVo(){
          return this.etablissementVo;
     }
       
     public void setEtablissementVo(EtablissementVo etablissementVo){
          this.etablissementVo = etablissementVo;
     }
   
      public ProfesseurInfoVo getResponsableVo(){
          return this.responsableVo;
     }
       
     public void setResponsableVo(ProfesseurInfoVo responsableVo){
          this.responsableVo = responsableVo;
     }
   

      public List<EtudiantInfoVo> getLaureatsVo(){
          return this.laureatsVo;
     }
       
     public void setLaureatsVo(List<EtudiantInfoVo> laureatsVo){
          this.laureatsVo = laureatsVo;
     }
      public List<EtudiantInfoVo> getEtudiantsActVo(){
          return this.etudiantsActVo;
     }
       
     public void setEtudiantsActVo(List<EtudiantInfoVo> etudiantsActVo){
          this.etudiantsActVo = etudiantsActVo;
     }



}