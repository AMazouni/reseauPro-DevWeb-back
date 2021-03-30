package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.AdminInfo; 
import ma.zs.generated.ws.rest.provided.vo.AdminInfoVo;

@Component 
public class AdminInfoConverter extends AbstractConverter<AdminInfo,AdminInfoVo>{ 
	
	   @Autowired
         private UtilisateurConverter utilisateurConverter ;
    private Boolean compte;

	public  AdminInfoConverter(){
		init(true);
	}

	@Override 
 	public AdminInfo toItem(AdminInfoVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	AdminInfo item = new AdminInfo();
			 if(StringUtil.isNotEmpty(vo.getNom()))
                  item.setNom(vo.getNom());
			 if(StringUtil.isNotEmpty(vo.getPrenom()))
                  item.setPrenom(vo.getPrenom());
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(vo.getCode());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getCompteVo()!=null && this.compte)
			     item.setCompte(utilisateurConverter.toItem(vo.getCompteVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public AdminInfoVo toVo(AdminInfo item) {
 		if (item == null) {
    		return null;
      	} else {
			AdminInfoVo vo = new AdminInfoVo();

			if(StringUtil.isNotEmpty(item.getNom()))
				vo.setNom(item.getNom());
			
			if(StringUtil.isNotEmpty(item.getPrenom()))
				vo.setPrenom(item.getPrenom());
			
			if(StringUtil.isNotEmpty(item.getCode()))
				vo.setCode(item.getCode());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getCompte()!=null && this.compte) {
                utilisateurConverter.setAdminInfo(false);
				   vo.setCompteVo(utilisateurConverter.toVo(item.getCompte())) ;
                utilisateurConverter.setAdminInfo(true);
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       compte = value;
	}


	

	
	   public UtilisateurConverter getUtilisateurConverter(){
		return this.utilisateurConverter;
	}  
        public void setUtilisateurConverter(UtilisateurConverter utilisateurConverter ){
		 this.utilisateurConverter = utilisateurConverter;
	}  
	
	 public boolean  isCompte(){
		  return this.compte;
	 }
	 public void  setCompte(boolean compte){
		   this.compte = compte;
	 }
}