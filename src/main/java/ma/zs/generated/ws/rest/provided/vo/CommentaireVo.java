package  ma.zs.generated.ws.rest.provided.vo;


public class CommentaireVo {

     private String comref ;
   
     private String contenu ;
   
     private String id ;
   

	private PublicationVo publicationVo ;
	private UtilisateurVo posteParVo ;



 public CommentaireVo(){
       super();
     }


     public String getComref(){
          return this.comref;
     }
      public void setComref(String comref){
          this.comref = comref;
     }


     public String getContenu(){
          return this.contenu;
     }
      public void setContenu(String contenu){
          this.contenu = contenu;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     

      public PublicationVo getPublicationVo(){
          return this.publicationVo;
     }
       
     public void setPublicationVo(PublicationVo publicationVo){
          this.publicationVo = publicationVo;
     }
   
      public UtilisateurVo getPosteParVo(){
          return this.posteParVo;
     }
       
     public void setPosteParVo(UtilisateurVo posteParVo){
          this.posteParVo = posteParVo;
     }
   




}