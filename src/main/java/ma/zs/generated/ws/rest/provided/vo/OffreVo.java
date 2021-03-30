package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;
import java.util.Date;

public class OffreVo {

     private String dateOffre ;
   
     private String titre ;
   
     private String infoSup ;
   
     private String type ;
   
     private String dernierDelai ;
   
     private String ref ;
   
     private String id ;
   

	private OffreTagsVo tagsVo ;
	private FonctionVo fonctionVo ;

     private List<CandidatureVo> candidaturesVo ;

     private String dateOffreMax ;
     private String dateOffreMin ;
     private String dernierDelaiMax ;
     private String dernierDelaiMin ;

 public OffreVo(){
       super();
     }


     public String getDateOffre(){
          return this.dateOffre;
     }
      public void setDateOffre(String dateOffre){
          this.dateOffre = dateOffre;
     }


     public String getTitre(){
          return this.titre;
     }
      public void setTitre(String titre){
          this.titre = titre;
     }


     public String getInfoSup(){
          return this.infoSup;
     }
      public void setInfoSup(String infoSup){
          this.infoSup = infoSup;
     }


     public String getType(){
          return this.type;
     }
      public void setType(String type){
          this.type = type;
     }


     public String getDernierDelai(){
          return this.dernierDelai;
     }
      public void setDernierDelai(String dernierDelai){
          this.dernierDelai = dernierDelai;
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



      public String getDateOffreMax(){
          return this.dateOffreMax;
     }
     
      public String getDateOffreMin(){
          return this.dateOffreMin;
     }

     public void setDateOffreMax(String dateOffreMax){
          this.dateOffreMax = dateOffreMax;
     }

     public void setDateOffreMin(String dateOffreMin){
          this.dateOffreMin = dateOffreMin;
     }
     
     

      public String getDernierDelaiMax(){
          return this.dernierDelaiMax;
     }
     
      public String getDernierDelaiMin(){
          return this.dernierDelaiMin;
     }

     public void setDernierDelaiMax(String dernierDelaiMax){
          this.dernierDelaiMax = dernierDelaiMax;
     }

     public void setDernierDelaiMin(String dernierDelaiMin){
          this.dernierDelaiMin = dernierDelaiMin;
     }
     
     
     

      public OffreTagsVo getTagsVo(){
          return this.tagsVo;
     }
       
     public void setTagsVo(OffreTagsVo tagsVo){
          this.tagsVo = tagsVo;
     }
   
      public FonctionVo getFonctionVo(){
          return this.fonctionVo;
     }
       
     public void setFonctionVo(FonctionVo fonctionVo){
          this.fonctionVo = fonctionVo;
     }
   

      public List<CandidatureVo> getCandidaturesVo(){
          return this.candidaturesVo;
     }
       
     public void setCandidaturesVo(List<CandidatureVo> candidaturesVo){
          this.candidaturesVo = candidaturesVo;
     }



}