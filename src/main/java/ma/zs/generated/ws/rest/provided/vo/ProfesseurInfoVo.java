package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;

public class ProfesseurInfoVo {

     private String code ;
   
     private String prenom ;
   
     private String nom ;
   
     private String id ;
   

	private EtablissementVo etablissementVo ;
	private UtilisateurVo compteVo ;

     private List<FormationVo> responsableDeVo ;


 public ProfesseurInfoVo(){
       super();
     }


     public String getCode(){
          return this.code;
     }
      public void setCode(String code){
          this.code = code;
     }


     public String getPrenom(){
          return this.prenom;
     }
      public void setPrenom(String prenom){
          this.prenom = prenom;
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


     

      public EtablissementVo getEtablissementVo(){
          return this.etablissementVo;
     }
       
     public void setEtablissementVo(EtablissementVo etablissementVo){
          this.etablissementVo = etablissementVo;
     }
   
      public UtilisateurVo getCompteVo(){
          return this.compteVo;
     }
       
     public void setCompteVo(UtilisateurVo compteVo){
          this.compteVo = compteVo;
     }
   

      public List<FormationVo> getResponsableDeVo(){
          return this.responsableDeVo;
     }
       
     public void setResponsableDeVo(List<FormationVo> responsableDeVo){
          this.responsableDeVo = responsableDeVo;
     }



}