package  ma.zs.generated.ws.rest.provided.vo;


public class AdminInfoVo {

     private String nom ;
   
     private String prenom ;
   
     private String code ;
   
     private String id ;
   

	private UtilisateurVo compteVo ;



 public AdminInfoVo(){
       super();
     }


     public String getNom(){
          return this.nom;
     }
      public void setNom(String nom){
          this.nom = nom;
     }


     public String getPrenom(){
          return this.prenom;
     }
      public void setPrenom(String prenom){
          this.prenom = prenom;
     }


     public String getCode(){
          return this.code;
     }
      public void setCode(String code){
          this.code = code;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     

      public UtilisateurVo getCompteVo(){
          return this.compteVo;
     }
       
     public void setCompteVo(UtilisateurVo compteVo){
          this.compteVo = compteVo;
     }
   




}