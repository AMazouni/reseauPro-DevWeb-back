package ma.zs.generated.bean;

import javax.persistence.*;
import java.util.List;

import ma.zs.generated.bean.Sexe;
import ma.zs.generated.bean.Formation;
import ma.zs.generated.bean.Fonction;
import ma.zs.generated.bean.Utilisateur;

@Entity
public class EtudiantInfo {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private Integer anneFinEtude;
     private String prenom ;
     private String nom ;
     private String linkedIn ;
     private String cne ;
     private String codeApogee ;

     @ManyToOne
	private Sexe sexe ;
     @ManyToOne
	private Formation formationActuelle ;
     @ManyToOne
	private Fonction fonctionActuelle ;
     @ManyToOne
	private Utilisateur compte ;
     @OneToMany(mappedBy = "occupePar")
     private List<Fonction> experiencesPro ;
     @ManyToMany(mappedBy = "laureats")
     private List<Formation> formations ;
     @OneToMany(mappedBy = "demandeA")
     private List<Demande> demandeRecu ;
     @OneToMany(mappedBy = "demandePar")
     private List<Demande> demandesEnvoye ;

     public EtudiantInfo(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getCne(){
          return this.cne;
     }
     public void setCne(String cne){
          this.cne = cne;
     }
     public String getCodeApogee(){
          return this.codeApogee;
     }
     public void setCodeApogee(String codeApogee){
          this.codeApogee = codeApogee;
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
     public List<Formation> getFormations(){
          return this.formations;
     }
     public void setFormations(List<Formation> formations){
          this.formations = formations;
     }
     public Formation getFormationActuelle(){
          return this.formationActuelle;
     }
     public void setFormationActuelle(Formation formationActuelle){
          this.formationActuelle = formationActuelle;
     }
     public String getLinkedIn(){
          return this.linkedIn;
     }
     public void setLinkedIn(String linkedIn){
          this.linkedIn = linkedIn;
     }
     public Sexe getSexe(){
          return this.sexe;
     }
     public void setSexe(Sexe sexe){
          this.sexe = sexe;
     }
     public int getAnneFinEtude(){
          return this.anneFinEtude;
     }
     public void setAnneFinEtude(int anneFinEtude){
          this.anneFinEtude = anneFinEtude;
     }
     public List<Fonction> getExperiencesPro(){
          return this.experiencesPro;
     }
     public void setExperiencesPro(List<Fonction> experiencesPro){
          this.experiencesPro = experiencesPro;
     }
     public Fonction getFonctionActuelle(){
          return this.fonctionActuelle;
     }
     public void setFonctionActuelle(Fonction fonctionActuelle){
          this.fonctionActuelle = fonctionActuelle;
     }
     public List<Demande> getDemandeRecu(){
          return this.demandeRecu;
     }
     public void setDemandeRecu(List<Demande> demandeRecu){
          this.demandeRecu = demandeRecu;
     }
     public List<Demande> getDemandesEnvoye(){
          return this.demandesEnvoye;
     }
     public void setDemandesEnvoye(List<Demande> demandesEnvoye){
          this.demandesEnvoye = demandesEnvoye;
     }
     public Utilisateur getCompte(){
          return this.compte;
     }
     public void setCompte(Utilisateur compte){
          this.compte = compte;
     }



}

