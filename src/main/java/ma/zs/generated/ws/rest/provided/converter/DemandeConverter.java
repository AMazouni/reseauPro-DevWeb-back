package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Demande; 
import ma.zs.generated.ws.rest.provided.vo.DemandeVo;

@Component 
public class DemandeConverter extends AbstractConverter<Demande,DemandeVo>{ 
	
	   @Autowired
         private StatusConverter statusConverter ;
	   @Autowired
         private MessageConverter messageConverter ;
	   @Autowired
         private EtudiantInfoConverter etudiantInfoConverter ;
	   @Autowired
         private CatDemandeConverter catDemandeConverter ;
    private Boolean categorieDemande;
    private Boolean demandePar;
    private Boolean status;
    private Boolean demandeA;
    private Boolean messages;

	public  DemandeConverter(){
		init(true);
	}

	@Override 
 	public Demande toItem(DemandeVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Demande item = new Demande();
			 if(StringUtil.isNotEmpty(vo.getObjetDemande()))
                  item.setObjetDemande(vo.getObjetDemande());
			 if(StringUtil.isNotEmpty(vo.getInfoSupp()))
                  item.setInfoSupp(vo.getInfoSupp());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getCategorieDemandeVo()!=null && this.categorieDemande)
			     item.setCategorieDemande(catDemandeConverter.toItem(vo.getCategorieDemandeVo())) ;
             if(vo.getDemandeParVo()!=null && this.demandePar)
			     item.setDemandePar(etudiantInfoConverter.toItem(vo.getDemandeParVo())) ;
             if(vo.getStatusVo()!=null && this.status)
			     item.setStatus(statusConverter.toItem(vo.getStatusVo())) ;
             if(vo.getDemandeAVo()!=null && this.demandeA)
			     item.setDemandeA(etudiantInfoConverter.toItem(vo.getDemandeAVo())) ;

	         if(ListUtil.isNotEmpty(vo.getMessagesVo()) && this.messages)
                  item.setMessages(messageConverter.toItem(vo.getMessagesVo()));



		return item;
 		}
 	}

 	 @Override 
 	public DemandeVo toVo(Demande item) {
 		if (item == null) {
    		return null;
      	} else {
			DemandeVo vo = new DemandeVo();

			if(StringUtil.isNotEmpty(item.getObjetDemande()))
				vo.setObjetDemande(item.getObjetDemande());
			
			if(StringUtil.isNotEmpty(item.getInfoSupp()))
				vo.setInfoSupp(item.getInfoSupp());
			
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getCategorieDemande()!=null && this.categorieDemande) {
				   vo.setCategorieDemandeVo(catDemandeConverter.toVo(item.getCategorieDemande())) ;
			   } 
            if(item.getDemandePar()!=null && this.demandePar) {
				   vo.setDemandeParVo(etudiantInfoConverter.toVo(item.getDemandePar())) ;
			   } 
            if(item.getStatus()!=null && this.status) {
				   vo.setStatusVo(statusConverter.toVo(item.getStatus())) ;
			   } 
            if(item.getDemandeA()!=null && this.demandeA) {
				   vo.setDemandeAVo(etudiantInfoConverter.toVo(item.getDemandeA())) ;
			   } 
	         if(ListUtil.isNotEmpty(item.getMessages()) && this.messages){
				
				 messageConverter.init(false);
                vo.setMessagesVo(messageConverter.toVo(item.getMessages()));
              	 messageConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       categorieDemande = value;
       demandePar = value;
       status = value;
       demandeA = value;
       messages = value;
	}


	

	
	   public StatusConverter getStatusConverter(){
		return this.statusConverter;
	}  
        public void setStatusConverter(StatusConverter statusConverter ){
		 this.statusConverter = statusConverter;
	}  
	   public MessageConverter getMessageConverter(){
		return this.messageConverter;
	}  
        public void setMessageConverter(MessageConverter messageConverter ){
		 this.messageConverter = messageConverter;
	}  
	   public EtudiantInfoConverter getEtudiantInfoConverter(){
		return this.etudiantInfoConverter;
	}  
        public void setEtudiantInfoConverter(EtudiantInfoConverter etudiantInfoConverter ){
		 this.etudiantInfoConverter = etudiantInfoConverter;
	}  
	   public CatDemandeConverter getCatDemandeConverter(){
		return this.catDemandeConverter;
	}  
        public void setCatDemandeConverter(CatDemandeConverter catDemandeConverter ){
		 this.catDemandeConverter = catDemandeConverter;
	}  
	
	 public boolean  isCategorieDemande(){
		  return this.categorieDemande;
	 }
	 public void  setCategorieDemande(boolean categorieDemande){
		   this.categorieDemande = categorieDemande;
	 }
	 public boolean  isDemandePar(){
		  return this.demandePar;
	 }
	 public void  setDemandePar(boolean demandePar){
		   this.demandePar = demandePar;
	 }
	 public boolean  isStatus(){
		  return this.status;
	 }
	 public void  setStatus(boolean status){
		   this.status = status;
	 }
	 public boolean  isDemandeA(){
		  return this.demandeA;
	 }
	 public void  setDemandeA(boolean demandeA){
		   this.demandeA = demandeA;
	 }
       public Boolean  isMessages(){
		 return this.messages ;
	   }
		 public void  setMessages(Boolean messages ){
            this.messages  = messages ;
		 }
}