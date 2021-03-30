package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;

public class PublicationVo {

     private String contenu ;
   
     private String verified ;
   
     private String ref ;
   
     private String id ;
   

	private UtilisateurVo posteParVo ;

     private List<CommentaireVo> commentaireVo ;


 public PublicationVo(){
       super();
     }


     public String getContenu(){
          return this.contenu;
     }
      public void setContenu(String contenu){
          this.contenu = contenu;
     }


     public String getVerified(){
          return this.verified;
     }
      public void setVerified(String verified){
          this.verified = verified;
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


     

      public UtilisateurVo getPosteParVo(){
          return this.posteParVo;
     }
       
     public void setPosteParVo(UtilisateurVo posteParVo){
          this.posteParVo = posteParVo;
     }
   

      public List<CommentaireVo> getCommentaireVo(){
          return this.commentaireVo;
     }
       
     public void setCommentaireVo(List<CommentaireVo> commentaireVo){
          this.commentaireVo = commentaireVo;
     }



}