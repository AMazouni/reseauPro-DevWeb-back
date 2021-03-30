package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;

public class EtudiantInfoVo {

     private String anneFinEtude ;
   
     private String prenom ;
   
     private String nom ;
   
     private String linkedIn ;
   
     private String cne ;
   
     private String codeApogee ;
   
     private String id ;
   

	private SexeVo sexeVo ;
	private FormationVo formationActuelleVo ;
	private FonctionVo fonctionActuelleVo ;
	private UtilisateurVo compteVo ;

     private List<FonctionVo> experiencesProVo ;
     private List<FormationVo> formationsVo ;
     private List<DemandeVo> demandeRecuVo ;
     private List<DemandeVo> demandesEnvoyeVo ;

     private String anneFinEtudeMax ;
     private String anneFinEtudeMin ;

 public EtudiantInfoVo(){
       super();
     }


     public String getAnneFinEtude(){
          return this.anneFinEtude;
     }
      public void setAnneFinEtude(String anneFinEtude){
          this.anneFinEtude = anneFinEtude;
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


     public String getLinkedIn(){
          return this.linkedIn;
     }
      public void setLinkedIn(String linkedIn){
          this.linkedIn = linkedIn;
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


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }



      public String getAnneFinEtudeMax(){
          return this.anneFinEtudeMax;
     }
     
      public String getAnneFinEtudeMin(){
          return this.anneFinEtudeMin;
     }

     public void setAnneFinEtudeMax(String anneFinEtudeMax){
          this.anneFinEtudeMax = anneFinEtudeMax;
     }

     public void setAnneFinEtudeMin(String anneFinEtudeMin){
          this.anneFinEtudeMin = anneFinEtudeMin;
     }
     
     
     

      public SexeVo getSexeVo(){
          return this.sexeVo;
     }
       
     public void setSexeVo(SexeVo sexeVo){
          this.sexeVo = sexeVo;
     }
   
      public FormationVo getFormationActuelleVo(){
          return this.formationActuelleVo;
     }
       
     public void setFormationActuelleVo(FormationVo formationActuelleVo){
          this.formationActuelleVo = formationActuelleVo;
     }
   
      public FonctionVo getFonctionActuelleVo(){
          return this.fonctionActuelleVo;
     }
       
     public void setFonctionActuelleVo(FonctionVo fonctionActuelleVo){
          this.fonctionActuelleVo = fonctionActuelleVo;
     }
   
      public UtilisateurVo getCompteVo(){
          return this.compteVo;
     }
       
     public void setCompteVo(UtilisateurVo compteVo){
          this.compteVo = compteVo;
     }
   

      public List<FonctionVo> getExperiencesProVo(){
          return this.experiencesProVo;
     }
       
     public void setExperiencesProVo(List<FonctionVo> experiencesProVo){
          this.experiencesProVo = experiencesProVo;
     }
      public List<FormationVo> getFormationsVo(){
          return this.formationsVo;
     }
       
     public void setFormationsVo(List<FormationVo> formationsVo){
          this.formationsVo = formationsVo;
     }
      public List<DemandeVo> getDemandeRecuVo(){
          return this.demandeRecuVo;
     }
       
     public void setDemandeRecuVo(List<DemandeVo> demandeRecuVo){
          this.demandeRecuVo = demandeRecuVo;
     }
      public List<DemandeVo> getDemandesEnvoyeVo(){
          return this.demandesEnvoyeVo;
     }
       
     public void setDemandesEnvoyeVo(List<DemandeVo> demandesEnvoyeVo){
          this.demandesEnvoyeVo = demandesEnvoyeVo;
     }



}