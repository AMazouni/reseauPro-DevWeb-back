package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Candidature; 
import ma.zs.generated.ws.rest.provided.vo.CandidatureVo;

@Component 
public class CandidatureConverter extends AbstractConverter<Candidature,CandidatureVo>{ 
	
	   @Autowired
         private StatusConverter statusConverter ;
	   @Autowired
         private EtudiantInfoConverter etudiantInfoConverter ;
	   @Autowired
         private OffreConverter offreConverter ;
    private Boolean candidat;
    private Boolean status;
    private Boolean offreConcerne;

	public  CandidatureConverter(){
		init(true);
	}

	@Override 
 	public Candidature toItem(CandidatureVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Candidature item = new Candidature();
			 if(StringUtil.isNotEmpty(vo.getLettreMotivation()))
                  item.setLettreMotivation(vo.getLettreMotivation());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getCandidatVo()!=null && this.candidat)
			     item.setCandidat(etudiantInfoConverter.toItem(vo.getCandidatVo())) ;
             if(vo.getStatusVo()!=null && this.status)
			     item.setStatus(statusConverter.toItem(vo.getStatusVo())) ;
             if(vo.getOffreConcerneVo()!=null && this.offreConcerne)
			     item.setOffreConcerne(offreConverter.toItem(vo.getOffreConcerneVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public CandidatureVo toVo(Candidature item) {
 		if (item == null) {
    		return null;
      	} else {
			CandidatureVo vo = new CandidatureVo();

			if(StringUtil.isNotEmpty(item.getLettreMotivation()))
				vo.setLettreMotivation(item.getLettreMotivation());
			
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getCandidat()!=null && this.candidat) {
				   vo.setCandidatVo(etudiantInfoConverter.toVo(item.getCandidat())) ;
			   } 
            if(item.getStatus()!=null && this.status) {
				   vo.setStatusVo(statusConverter.toVo(item.getStatus())) ;
			   } 
            if(item.getOffreConcerne()!=null && this.offreConcerne) {
				   vo.setOffreConcerneVo(offreConverter.toVo(item.getOffreConcerne())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       candidat = value;
       status = value;
       offreConcerne = value;
	}


	

	
	   public StatusConverter getStatusConverter(){
		return this.statusConverter;
	}  
        public void setStatusConverter(StatusConverter statusConverter ){
		 this.statusConverter = statusConverter;
	}  
	   public EtudiantInfoConverter getEtudiantInfoConverter(){
		return this.etudiantInfoConverter;
	}  
        public void setEtudiantInfoConverter(EtudiantInfoConverter etudiantInfoConverter ){
		 this.etudiantInfoConverter = etudiantInfoConverter;
	}  
	   public OffreConverter getOffreConverter(){
		return this.offreConverter;
	}  
        public void setOffreConverter(OffreConverter offreConverter ){
		 this.offreConverter = offreConverter;
	}  
	
	 public boolean  isCandidat(){
		  return this.candidat;
	 }
	 public void  setCandidat(boolean candidat){
		   this.candidat = candidat;
	 }
	 public boolean  isStatus(){
		  return this.status;
	 }
	 public void  setStatus(boolean status){
		   this.status = status;
	 }
	 public boolean  isOffreConcerne(){
		  return this.offreConcerne;
	 }
	 public void  setOffreConcerne(boolean offreConcerne){
		   this.offreConcerne = offreConcerne;
	 }
}