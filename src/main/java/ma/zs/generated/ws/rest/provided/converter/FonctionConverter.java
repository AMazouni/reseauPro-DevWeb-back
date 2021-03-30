package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Fonction; 
import ma.zs.generated.ws.rest.provided.vo.FonctionVo;

@Component 
public class FonctionConverter extends AbstractConverter<Fonction,FonctionVo>{ 
	
	   @Autowired
         private EntrepriseConverter entrepriseConverter ;
	   @Autowired
         private EtudiantInfoConverter etudiantInfoConverter ;
    private Boolean entreprise;
    private Boolean occupePar;

	public  FonctionConverter(){
		init(true);
	}

	@Override 
 	public Fonction toItem(FonctionVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Fonction item = new Fonction();
             if(StringUtil.isNotEmpty(vo.getDeteFin()))
			      item.setDeteFin(DateUtil.parse(vo.getDeteFin()));
			 if(StringUtil.isNotEmpty(vo.getTitre()))
                  item.setTitre(vo.getTitre());
             if(StringUtil.isNotEmpty(vo.getDateDebut()))
			      item.setDateDebut(DateUtil.parse(vo.getDateDebut()));
			 if(StringUtil.isNotEmpty(vo.getDescription()))
                  item.setDescription(vo.getDescription());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getEntrepriseVo()!=null && this.entreprise)
			     item.setEntreprise(entrepriseConverter.toItem(vo.getEntrepriseVo())) ;
             if(vo.getOccupeParVo()!=null && this.occupePar)
			     item.setOccupePar(etudiantInfoConverter.toItem(vo.getOccupeParVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public FonctionVo toVo(Fonction item) {
 		if (item == null) {
    		return null;
      	} else {
			FonctionVo vo = new FonctionVo();

            if(item.getDeteFin()!=null)
			    vo.setDeteFin(DateUtil.formateDate(item.getDeteFin()));	     
			if(StringUtil.isNotEmpty(item.getTitre()))
				vo.setTitre(item.getTitre());
			
            if(item.getDateDebut()!=null)
			    vo.setDateDebut(DateUtil.formateDate(item.getDateDebut()));	     
			if(StringUtil.isNotEmpty(item.getDescription()))
				vo.setDescription(item.getDescription());
			
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getEntreprise()!=null && this.entreprise) {
				   vo.setEntrepriseVo(entrepriseConverter.toVo(item.getEntreprise())) ;
			   } 
            if(item.getOccupePar()!=null && this.occupePar) {
                etudiantInfoConverter.setFonctionActuelle(false);
				   vo.setOccupeParVo(etudiantInfoConverter.toVo(item.getOccupePar())) ;
                etudiantInfoConverter.setFonctionActuelle(true);
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       entreprise = value;
       occupePar = value;
	}


	

	
	   public EntrepriseConverter getEntrepriseConverter(){
		return this.entrepriseConverter;
	}  
        public void setEntrepriseConverter(EntrepriseConverter entrepriseConverter ){
		 this.entrepriseConverter = entrepriseConverter;
	}  
	   public EtudiantInfoConverter getEtudiantInfoConverter(){
		return this.etudiantInfoConverter;
	}  
        public void setEtudiantInfoConverter(EtudiantInfoConverter etudiantInfoConverter ){
		 this.etudiantInfoConverter = etudiantInfoConverter;
	}  
	
	 public boolean  isEntreprise(){
		  return this.entreprise;
	 }
	 public void  setEntreprise(boolean entreprise){
		   this.entreprise = entreprise;
	 }
	 public boolean  isOccupePar(){
		  return this.occupePar;
	 }
	 public void  setOccupePar(boolean occupePar){
		   this.occupePar = occupePar;
	 }
}