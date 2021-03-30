package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Utilisateur; 
import ma.zs.generated.ws.rest.provided.vo.UtilisateurVo;

@Component 
public class UtilisateurConverter extends AbstractConverter<Utilisateur,UtilisateurVo>{ 
	
	   @Autowired
         private ProfesseurInfoConverter professeurInfoConverter ;
	   @Autowired
         private MessageConverter messageConverter ;
	   @Autowired
         private AdminInfoConverter adminInfoConverter ;
	   @Autowired
         private EtudiantInfoConverter etudiantInfoConverter ;
	   @Autowired
         private CommentaireConverter commentaireConverter ;
	   @Autowired
         private ReponseConverter reponseConverter ;
	   @Autowired
         private PublicationConverter publicationConverter ;
    private Boolean adminInfo;
    private Boolean laureatInfo;
    private Boolean etudiantInfo;
    private Boolean professeurInfo;
    private Boolean reponses;
    private Boolean messagesRecus;
    private Boolean messagesEnvoye;
    private Boolean comRediges;
    private Boolean publicationsRediges;

	public  UtilisateurConverter(){
		init(true);
	}

	@Override 
 	public Utilisateur toItem(UtilisateurVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Utilisateur item = new Utilisateur();
			 if(StringUtil.isNotEmpty(vo.getVerified()))
                  item.setVerified(NumberUtil.toBoolean(vo.getVerified()));
			 if(StringUtil.isNotEmpty(vo.getAbout()))
                  item.setAbout(vo.getAbout());
             if(StringUtil.isNotEmpty(vo.getDateNaissance()))
			      item.setDateNaissance(DateUtil.parse(vo.getDateNaissance()));
			 if(StringUtil.isNotEmpty(vo.getProfilVisible()))
                  item.setProfilVisible(NumberUtil.toBoolean(vo.getProfilVisible()));
			 if(StringUtil.isNotEmpty(vo.getTel()))
                  item.setTel(vo.getTel());
			 if(StringUtil.isNotEmpty(vo.getPassword()))
                  item.setPassword(vo.getPassword());
			 if(StringUtil.isNotEmpty(vo.getRole()))
                  item.setRole(vo.getRole());
			 if(StringUtil.isNotEmpty(vo.getEmail()))
                  item.setEmail(vo.getEmail());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getAdminInfoVo()!=null && this.adminInfo)
			     item.setAdminInfo(adminInfoConverter.toItem(vo.getAdminInfoVo())) ;
             if(vo.getLaureatInfoVo()!=null && this.laureatInfo)
			     item.setLaureatInfo(etudiantInfoConverter.toItem(vo.getLaureatInfoVo())) ;
             if(vo.getEtudiantInfoVo()!=null && this.etudiantInfo)
			     item.setEtudiantInfo(etudiantInfoConverter.toItem(vo.getEtudiantInfoVo())) ;
             if(vo.getProfesseurInfoVo()!=null && this.professeurInfo)
			     item.setProfesseurInfo(professeurInfoConverter.toItem(vo.getProfesseurInfoVo())) ;
             if(vo.getReponsesVo()!=null && this.reponses)
			     item.setReponses(reponseConverter.toItem(vo.getReponsesVo())) ;

	         if(ListUtil.isNotEmpty(vo.getMessagesRecusVo()) && this.messagesRecus)
                  item.setMessagesRecus(messageConverter.toItem(vo.getMessagesRecusVo()));


	         if(ListUtil.isNotEmpty(vo.getMessagesEnvoyeVo()) && this.messagesEnvoye)
                  item.setMessagesEnvoye(messageConverter.toItem(vo.getMessagesEnvoyeVo()));


	         if(ListUtil.isNotEmpty(vo.getComRedigesVo()) && this.comRediges)
                  item.setComRediges(commentaireConverter.toItem(vo.getComRedigesVo()));


	         if(ListUtil.isNotEmpty(vo.getPublicationsRedigesVo()) && this.publicationsRediges)
                  item.setPublicationsRediges(publicationConverter.toItem(vo.getPublicationsRedigesVo()));



		return item;
 		}
 	}

 	 @Override 
 	public UtilisateurVo toVo(Utilisateur item) {
 		if (item == null) {
    		return null;
      	} else {
			UtilisateurVo vo = new UtilisateurVo();

			if(item.isVerified()!=null)
				vo.setVerified(NumberUtil.toString(item.isVerified()));
			if(StringUtil.isNotEmpty(item.getAbout()))
				vo.setAbout(item.getAbout());
			
            if(item.getDateNaissance()!=null)
			    vo.setDateNaissance(DateUtil.formateDate(item.getDateNaissance()));	     
			if(item.isProfilVisible()!=null)
				vo.setProfilVisible(NumberUtil.toString(item.isProfilVisible()));
			if(StringUtil.isNotEmpty(item.getTel()))
				vo.setTel(item.getTel());
			
			if(StringUtil.isNotEmpty(item.getPassword()))
				vo.setPassword(item.getPassword());
			
			if(StringUtil.isNotEmpty(item.getRole()))
				vo.setRole(item.getRole());
			
			if(StringUtil.isNotEmpty(item.getEmail()))
				vo.setEmail(item.getEmail());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getAdminInfo()!=null && this.adminInfo) {
                adminInfoConverter.setCompte(false);
				   vo.setAdminInfoVo(adminInfoConverter.toVo(item.getAdminInfo())) ;
                adminInfoConverter.setCompte(true);
			   } 
            if(item.getLaureatInfo()!=null && this.laureatInfo) {
                etudiantInfoConverter.setCompte(false);
				   vo.setLaureatInfoVo(etudiantInfoConverter.toVo(item.getLaureatInfo())) ;
                etudiantInfoConverter.setCompte(true);
			   } 
            if(item.getEtudiantInfo()!=null && this.etudiantInfo) {
                etudiantInfoConverter.setCompte(false);
				   vo.setEtudiantInfoVo(etudiantInfoConverter.toVo(item.getEtudiantInfo())) ;
                etudiantInfoConverter.setCompte(true);
			   } 
            if(item.getProfesseurInfo()!=null && this.professeurInfo) {
                professeurInfoConverter.setCompte(false);
				   vo.setProfesseurInfoVo(professeurInfoConverter.toVo(item.getProfesseurInfo())) ;
                professeurInfoConverter.setCompte(true);
			   } 
            if(item.getReponses()!=null && this.reponses) {
				   vo.setReponsesVo(reponseConverter.toVo(item.getReponses())) ;
			   } 
	         if(ListUtil.isNotEmpty(item.getMessagesRecus()) && this.messagesRecus){
				
				 messageConverter.init(false);
                vo.setMessagesRecusVo(messageConverter.toVo(item.getMessagesRecus()));
              	 messageConverter.init(true);
			 }
	         if(ListUtil.isNotEmpty(item.getMessagesEnvoye()) && this.messagesEnvoye){
				
				 messageConverter.init(false);
                vo.setMessagesEnvoyeVo(messageConverter.toVo(item.getMessagesEnvoye()));
              	 messageConverter.init(true);
			 }
	         if(ListUtil.isNotEmpty(item.getComRediges()) && this.comRediges){
				
				 commentaireConverter.init(false);
                vo.setComRedigesVo(commentaireConverter.toVo(item.getComRediges()));
              	 commentaireConverter.init(true);
			 }
	         if(ListUtil.isNotEmpty(item.getPublicationsRediges()) && this.publicationsRediges){
				
				 publicationConverter.init(false);
                vo.setPublicationsRedigesVo(publicationConverter.toVo(item.getPublicationsRediges()));
              	 publicationConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       adminInfo = value;
       laureatInfo = value;
       etudiantInfo = value;
       professeurInfo = value;
       reponses = value;
       messagesRecus = value;
       messagesEnvoye = value;
       comRediges = value;
       publicationsRediges = value;
	}


	

	
	   public ProfesseurInfoConverter getProfesseurInfoConverter(){
		return this.professeurInfoConverter;
	}  
        public void setProfesseurInfoConverter(ProfesseurInfoConverter professeurInfoConverter ){
		 this.professeurInfoConverter = professeurInfoConverter;
	}  
	   public MessageConverter getMessageConverter(){
		return this.messageConverter;
	}  
        public void setMessageConverter(MessageConverter messageConverter ){
		 this.messageConverter = messageConverter;
	}  
	   public AdminInfoConverter getAdminInfoConverter(){
		return this.adminInfoConverter;
	}  
        public void setAdminInfoConverter(AdminInfoConverter adminInfoConverter ){
		 this.adminInfoConverter = adminInfoConverter;
	}  
	   public EtudiantInfoConverter getEtudiantInfoConverter(){
		return this.etudiantInfoConverter;
	}  
        public void setEtudiantInfoConverter(EtudiantInfoConverter etudiantInfoConverter ){
		 this.etudiantInfoConverter = etudiantInfoConverter;
	}  
	   public CommentaireConverter getCommentaireConverter(){
		return this.commentaireConverter;
	}  
        public void setCommentaireConverter(CommentaireConverter commentaireConverter ){
		 this.commentaireConverter = commentaireConverter;
	}  
	   public ReponseConverter getReponseConverter(){
		return this.reponseConverter;
	}  
        public void setReponseConverter(ReponseConverter reponseConverter ){
		 this.reponseConverter = reponseConverter;
	}  
	   public PublicationConverter getPublicationConverter(){
		return this.publicationConverter;
	}  
        public void setPublicationConverter(PublicationConverter publicationConverter ){
		 this.publicationConverter = publicationConverter;
	}  
	
	 public boolean  isAdminInfo(){
		  return this.adminInfo;
	 }
	 public void  setAdminInfo(boolean adminInfo){
		   this.adminInfo = adminInfo;
	 }
	 public boolean  isLaureatInfo(){
		  return this.laureatInfo;
	 }
	 public void  setLaureatInfo(boolean laureatInfo){
		   this.laureatInfo = laureatInfo;
	 }
	 public boolean  isEtudiantInfo(){
		  return this.etudiantInfo;
	 }
	 public void  setEtudiantInfo(boolean etudiantInfo){
		   this.etudiantInfo = etudiantInfo;
	 }
	 public boolean  isProfesseurInfo(){
		  return this.professeurInfo;
	 }
	 public void  setProfesseurInfo(boolean professeurInfo){
		   this.professeurInfo = professeurInfo;
	 }
	 public boolean  isReponses(){
		  return this.reponses;
	 }
	 public void  setReponses(boolean reponses){
		   this.reponses = reponses;
	 }
       public Boolean  isMessagesRecus(){
		 return this.messagesRecus ;
	   }
		 public void  setMessagesRecus(Boolean messagesRecus ){
            this.messagesRecus  = messagesRecus ;
		 }
       public Boolean  isMessagesEnvoye(){
		 return this.messagesEnvoye ;
	   }
		 public void  setMessagesEnvoye(Boolean messagesEnvoye ){
            this.messagesEnvoye  = messagesEnvoye ;
		 }
       public Boolean  isComRediges(){
		 return this.comRediges ;
	   }
		 public void  setComRediges(Boolean comRediges ){
            this.comRediges  = comRediges ;
		 }
       public Boolean  isPublicationsRediges(){
		 return this.publicationsRediges ;
	   }
		 public void  setPublicationsRediges(Boolean publicationsRediges ){
            this.publicationsRediges  = publicationsRediges ;
		 }
}