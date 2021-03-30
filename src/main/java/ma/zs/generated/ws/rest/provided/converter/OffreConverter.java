package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Offre; 
import ma.zs.generated.ws.rest.provided.vo.OffreVo;

@Component 
public class OffreConverter extends AbstractConverter<Offre,OffreVo>{ 
	
	   @Autowired
         private FonctionConverter fonctionConverter ;
	   @Autowired
         private CandidatureConverter candidatureConverter ;
	   @Autowired
         private OffreTagsConverter offreTagsConverter ;
    private Boolean tags;
    private Boolean fonction;
    private Boolean candidatures;

	public  OffreConverter(){
		init(true);
	}

	@Override 
 	public Offre toItem(OffreVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Offre item = new Offre();
             if(StringUtil.isNotEmpty(vo.getDateOffre()))
			      item.setDateOffre(DateUtil.parse(vo.getDateOffre()));
			 if(StringUtil.isNotEmpty(vo.getTitre()))
                  item.setTitre(vo.getTitre());
			 if(StringUtil.isNotEmpty(vo.getInfoSup()))
                  item.setInfoSup(vo.getInfoSup());
			 if(StringUtil.isNotEmpty(vo.getType()))
                  item.setType(vo.getType());
             if(StringUtil.isNotEmpty(vo.getDernierDelai()))
			      item.setDernierDelai(DateUtil.parse(vo.getDernierDelai()));
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getTagsVo()!=null && this.tags)
			     item.setTags(offreTagsConverter.toItem(vo.getTagsVo())) ;
             if(vo.getFonctionVo()!=null && this.fonction)
			     item.setFonction(fonctionConverter.toItem(vo.getFonctionVo())) ;

	         if(ListUtil.isNotEmpty(vo.getCandidaturesVo()) && this.candidatures)
                  item.setCandidatures(candidatureConverter.toItem(vo.getCandidaturesVo()));



		return item;
 		}
 	}

 	 @Override 
 	public OffreVo toVo(Offre item) {
 		if (item == null) {
    		return null;
      	} else {
			OffreVo vo = new OffreVo();

            if(item.getDateOffre()!=null)
			    vo.setDateOffre(DateUtil.formateDate(item.getDateOffre()));	     
			if(StringUtil.isNotEmpty(item.getTitre()))
				vo.setTitre(item.getTitre());
			
			if(StringUtil.isNotEmpty(item.getInfoSup()))
				vo.setInfoSup(item.getInfoSup());
			
			if(StringUtil.isNotEmpty(item.getType()))
				vo.setType(item.getType());
			
            if(item.getDernierDelai()!=null)
			    vo.setDernierDelai(DateUtil.formateDate(item.getDernierDelai()));	     
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getTags()!=null && this.tags) {
				   vo.setTagsVo(offreTagsConverter.toVo(item.getTags())) ;
			   } 
            if(item.getFonction()!=null && this.fonction) {
				   vo.setFonctionVo(fonctionConverter.toVo(item.getFonction())) ;
			   } 
	         if(ListUtil.isNotEmpty(item.getCandidatures()) && this.candidatures){
				
				 candidatureConverter.init(false);
                vo.setCandidaturesVo(candidatureConverter.toVo(item.getCandidatures()));
              	 candidatureConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       tags = value;
       fonction = value;
       candidatures = value;
	}


	

	
	   public FonctionConverter getFonctionConverter(){
		return this.fonctionConverter;
	}  
        public void setFonctionConverter(FonctionConverter fonctionConverter ){
		 this.fonctionConverter = fonctionConverter;
	}  
	   public CandidatureConverter getCandidatureConverter(){
		return this.candidatureConverter;
	}  
        public void setCandidatureConverter(CandidatureConverter candidatureConverter ){
		 this.candidatureConverter = candidatureConverter;
	}  
	   public OffreTagsConverter getOffreTagsConverter(){
		return this.offreTagsConverter;
	}  
        public void setOffreTagsConverter(OffreTagsConverter offreTagsConverter ){
		 this.offreTagsConverter = offreTagsConverter;
	}  
	
	 public boolean  isTags(){
		  return this.tags;
	 }
	 public void  setTags(boolean tags){
		   this.tags = tags;
	 }
	 public boolean  isFonction(){
		  return this.fonction;
	 }
	 public void  setFonction(boolean fonction){
		   this.fonction = fonction;
	 }
       public Boolean  isCandidatures(){
		 return this.candidatures ;
	   }
		 public void  setCandidatures(Boolean candidatures ){
            this.candidatures  = candidatures ;
		 }
}