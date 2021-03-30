package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;

public class DemandeVo {

     private String objetDemande ;
   
     private String infoSupp ;
   
     private String ref ;
   
     private String id ;
   

	private CatDemandeVo categorieDemandeVo ;
	private EtudiantInfoVo demandeParVo ;
	private StatusVo statusVo ;
	private EtudiantInfoVo demandeAVo ;

     private List<MessageVo> messagesVo ;


 public DemandeVo(){
       super();
     }


     public String getObjetDemande(){
          return this.objetDemande;
     }
      public void setObjetDemande(String objetDemande){
          this.objetDemande = objetDemande;
     }


     public String getInfoSupp(){
          return this.infoSupp;
     }
      public void setInfoSupp(String infoSupp){
          this.infoSupp = infoSupp;
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


     

      public CatDemandeVo getCategorieDemandeVo(){
          return this.categorieDemandeVo;
     }
       
     public void setCategorieDemandeVo(CatDemandeVo categorieDemandeVo){
          this.categorieDemandeVo = categorieDemandeVo;
     }
   
      public EtudiantInfoVo getDemandeParVo(){
          return this.demandeParVo;
     }
       
     public void setDemandeParVo(EtudiantInfoVo demandeParVo){
          this.demandeParVo = demandeParVo;
     }
   
      public StatusVo getStatusVo(){
          return this.statusVo;
     }
       
     public void setStatusVo(StatusVo statusVo){
          this.statusVo = statusVo;
     }
   
      public EtudiantInfoVo getDemandeAVo(){
          return this.demandeAVo;
     }
       
     public void setDemandeAVo(EtudiantInfoVo demandeAVo){
          this.demandeAVo = demandeAVo;
     }
   

      public List<MessageVo> getMessagesVo(){
          return this.messagesVo;
     }
       
     public void setMessagesVo(List<MessageVo> messagesVo){
          this.messagesVo = messagesVo;
     }



}