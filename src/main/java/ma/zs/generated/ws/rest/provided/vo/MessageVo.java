package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;

public class MessageVo {

     private String contenu ;
   
     private String ref ;
   
     private String objet ;
   
     private String id ;
   

	private UtilisateurVo emetteurVo ;
	private DemandeVo demandeConcerneVo ;

     private List<UtilisateurVo> destinataireVo ;


 public MessageVo(){
       super();
     }


     public String getContenu(){
          return this.contenu;
     }
      public void setContenu(String contenu){
          this.contenu = contenu;
     }


     public String getRef(){
          return this.ref;
     }
      public void setRef(String ref){
          this.ref = ref;
     }


     public String getObjet(){
          return this.objet;
     }
      public void setObjet(String objet){
          this.objet = objet;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     

      public UtilisateurVo getEmetteurVo(){
          return this.emetteurVo;
     }
       
     public void setEmetteurVo(UtilisateurVo emetteurVo){
          this.emetteurVo = emetteurVo;
     }
   
      public DemandeVo getDemandeConcerneVo(){
          return this.demandeConcerneVo;
     }
       
     public void setDemandeConcerneVo(DemandeVo demandeConcerneVo){
          this.demandeConcerneVo = demandeConcerneVo;
     }
   

      public List<UtilisateurVo> getDestinataireVo(){
          return this.destinataireVo;
     }
       
     public void setDestinataireVo(List<UtilisateurVo> destinataireVo){
          this.destinataireVo = destinataireVo;
     }



}