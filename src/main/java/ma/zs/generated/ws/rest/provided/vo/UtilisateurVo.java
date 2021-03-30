package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;
import java.util.Date;

public class UtilisateurVo {

     private String verified ;
   
     private String about ;
   
     private String dateNaissance ;
   
     private String profilVisible ;
   
     private String tel ;
   
     private String password ;
   
     private String role ;
   
     private String email ;
   
     private String id ;
   

	private AdminInfoVo adminInfoVo ;
	private EtudiantInfoVo laureatInfoVo ;
	private EtudiantInfoVo etudiantInfoVo ;
	private ProfesseurInfoVo professeurInfoVo ;
	private ReponseVo reponsesVo ;

     private List<MessageVo> messagesRecusVo ;
     private List<MessageVo> messagesEnvoyeVo ;
     private List<CommentaireVo> comRedigesVo ;
     private List<PublicationVo> publicationsRedigesVo ;

     private String dateNaissanceMax ;
     private String dateNaissanceMin ;

 public UtilisateurVo(){
       super();
     }


     public String getVerified(){
          return this.verified;
     }
      public void setVerified(String verified){
          this.verified = verified;
     }


     public String getAbout(){
          return this.about;
     }
      public void setAbout(String about){
          this.about = about;
     }


     public String getDateNaissance(){
          return this.dateNaissance;
     }
      public void setDateNaissance(String dateNaissance){
          this.dateNaissance = dateNaissance;
     }


     public String getProfilVisible(){
          return this.profilVisible;
     }
      public void setProfilVisible(String profilVisible){
          this.profilVisible = profilVisible;
     }


     public String getTel(){
          return this.tel;
     }
      public void setTel(String tel){
          this.tel = tel;
     }


     public String getPassword(){
          return this.password;
     }
      public void setPassword(String password){
          this.password = password;
     }


     public String getRole(){
          return this.role;
     }
      public void setRole(String role){
          this.role = role;
     }


     public String getEmail(){
          return this.email;
     }
      public void setEmail(String email){
          this.email = email;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }



      public String getDateNaissanceMax(){
          return this.dateNaissanceMax;
     }
     
      public String getDateNaissanceMin(){
          return this.dateNaissanceMin;
     }

     public void setDateNaissanceMax(String dateNaissanceMax){
          this.dateNaissanceMax = dateNaissanceMax;
     }

     public void setDateNaissanceMin(String dateNaissanceMin){
          this.dateNaissanceMin = dateNaissanceMin;
     }
     
     
     

      public AdminInfoVo getAdminInfoVo(){
          return this.adminInfoVo;
     }
       
     public void setAdminInfoVo(AdminInfoVo adminInfoVo){
          this.adminInfoVo = adminInfoVo;
     }
   
      public EtudiantInfoVo getLaureatInfoVo(){
          return this.laureatInfoVo;
     }
       
     public void setLaureatInfoVo(EtudiantInfoVo laureatInfoVo){
          this.laureatInfoVo = laureatInfoVo;
     }
   
      public EtudiantInfoVo getEtudiantInfoVo(){
          return this.etudiantInfoVo;
     }
       
     public void setEtudiantInfoVo(EtudiantInfoVo etudiantInfoVo){
          this.etudiantInfoVo = etudiantInfoVo;
     }
   
      public ProfesseurInfoVo getProfesseurInfoVo(){
          return this.professeurInfoVo;
     }
       
     public void setProfesseurInfoVo(ProfesseurInfoVo professeurInfoVo){
          this.professeurInfoVo = professeurInfoVo;
     }
   
      public ReponseVo getReponsesVo(){
          return this.reponsesVo;
     }
       
     public void setReponsesVo(ReponseVo reponsesVo){
          this.reponsesVo = reponsesVo;
     }
   

      public List<MessageVo> getMessagesRecusVo(){
          return this.messagesRecusVo;
     }
       
     public void setMessagesRecusVo(List<MessageVo> messagesRecusVo){
          this.messagesRecusVo = messagesRecusVo;
     }
      public List<MessageVo> getMessagesEnvoyeVo(){
          return this.messagesEnvoyeVo;
     }
       
     public void setMessagesEnvoyeVo(List<MessageVo> messagesEnvoyeVo){
          this.messagesEnvoyeVo = messagesEnvoyeVo;
     }
      public List<CommentaireVo> getComRedigesVo(){
          return this.comRedigesVo;
     }
       
     public void setComRedigesVo(List<CommentaireVo> comRedigesVo){
          this.comRedigesVo = comRedigesVo;
     }
      public List<PublicationVo> getPublicationsRedigesVo(){
          return this.publicationsRedigesVo;
     }
       
     public void setPublicationsRedigesVo(List<PublicationVo> publicationsRedigesVo){
          this.publicationsRedigesVo = publicationsRedigesVo;
     }



}