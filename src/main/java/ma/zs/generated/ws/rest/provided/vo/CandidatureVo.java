package  ma.zs.generated.ws.rest.provided.vo;


public class CandidatureVo {

     private String lettreMotivation ;
   
     private String ref ;
   
     private String id ;
   

	private EtudiantInfoVo candidatVo ;
	private StatusVo statusVo ;
	private OffreVo offreConcerneVo ;



 public CandidatureVo(){
       super();
     }


     public String getLettreMotivation(){
          return this.lettreMotivation;
     }
      public void setLettreMotivation(String lettreMotivation){
          this.lettreMotivation = lettreMotivation;
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


     

      public EtudiantInfoVo getCandidatVo(){
          return this.candidatVo;
     }
       
     public void setCandidatVo(EtudiantInfoVo candidatVo){
          this.candidatVo = candidatVo;
     }
   
      public StatusVo getStatusVo(){
          return this.statusVo;
     }
       
     public void setStatusVo(StatusVo statusVo){
          this.statusVo = statusVo;
     }
   
      public OffreVo getOffreConcerneVo(){
          return this.offreConcerneVo;
     }
       
     public void setOffreConcerneVo(OffreVo offreConcerneVo){
          this.offreConcerneVo = offreConcerneVo;
     }
   




}