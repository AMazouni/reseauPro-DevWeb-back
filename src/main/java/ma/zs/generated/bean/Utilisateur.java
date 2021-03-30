package ma.zs.generated.bean;

import javax.persistence.*;
import java.util.List;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import ma.zs.generated.bean.AdminInfo;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.bean.ProfesseurInfo;
import ma.zs.generated.bean.Reponse;

@Entity
public class Utilisateur {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private Boolean verified;
     private String about ;
     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date dateNaissance ;
     private Boolean profilVisible;
     private String tel ;
     private String password ;
     private String role ;
     private String email ;

     @ManyToOne
	private AdminInfo adminInfo ;
     @ManyToOne
	private EtudiantInfo laureatInfo ;
     @ManyToOne
	private EtudiantInfo etudiantInfo ;
     @ManyToOne
	private ProfesseurInfo professeurInfo ;
     @ManyToOne
	private Reponse reponses ;
     @ManyToMany(mappedBy = "destinataire")
     private List<Message> messagesRecus ;
     @OneToMany(mappedBy = "emetteur")
     private List<Message> messagesEnvoye ;
     @OneToMany(mappedBy = "postePar")
     private List<Commentaire> comRediges ;
     @OneToMany(mappedBy = "postePar")
     private List<Publication> publicationsRediges ;

     public Utilisateur(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getEmail(){
          return this.email;
     }
     public void setEmail(String email){
          this.email = email;
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
     public Date getDateNaissance(){
          return this.dateNaissance;
     }
     public void setDateNaissance(Date dateNaissance){
          this.dateNaissance = dateNaissance;
     }
    public Boolean isVerified(){
          return this.verified;
     }
       public void setVerified(Boolean verified){
          this.verified = verified;
     }
     public Reponse getReponses(){
          return this.reponses;
     }
     public void setReponses(Reponse reponses){
          this.reponses = reponses;
     }
     public EtudiantInfo getEtudiantInfo(){
          return this.etudiantInfo;
     }
     public void setEtudiantInfo(EtudiantInfo etudiantInfo){
          this.etudiantInfo = etudiantInfo;
     }
     public ProfesseurInfo getProfesseurInfo(){
          return this.professeurInfo;
     }
     public void setProfesseurInfo(ProfesseurInfo professeurInfo){
          this.professeurInfo = professeurInfo;
     }
     public EtudiantInfo getLaureatInfo(){
          return this.laureatInfo;
     }
     public void setLaureatInfo(EtudiantInfo laureatInfo){
          this.laureatInfo = laureatInfo;
     }
     public AdminInfo getAdminInfo(){
          return this.adminInfo;
     }
     public void setAdminInfo(AdminInfo adminInfo){
          this.adminInfo = adminInfo;
     }
     public List<Message> getMessagesRecus(){
          return this.messagesRecus;
     }
     public void setMessagesRecus(List<Message> messagesRecus){
          this.messagesRecus = messagesRecus;
     }
     public List<Message> getMessagesEnvoye(){
          return this.messagesEnvoye;
     }
     public void setMessagesEnvoye(List<Message> messagesEnvoye){
          this.messagesEnvoye = messagesEnvoye;
     }
     public List<Publication> getPublicationsRediges(){
          return this.publicationsRediges;
     }
     public void setPublicationsRediges(List<Publication> publicationsRediges){
          this.publicationsRediges = publicationsRediges;
     }
    public Boolean isProfilVisible(){
          return this.profilVisible;
     }
       public void setProfilVisible(Boolean profilVisible){
          this.profilVisible = profilVisible;
     }
     public String getAbout(){
          return this.about;
     }
     public void setAbout(String about){
          this.about = about;
     }
     public String getTel(){
          return this.tel;
     }
     public void setTel(String tel){
          this.tel = tel;
     }
     public List<Commentaire> getComRediges(){
          return this.comRediges;
     }
     public void setComRediges(List<Commentaire> comRediges){
          this.comRediges = comRediges;
     }



}

