package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Message; 
import ma.zs.generated.ws.rest.provided.vo.MessageVo;

@Component 
public class MessageConverter extends AbstractConverter<Message,MessageVo>{ 
	
	   @Autowired
         private DemandeConverter demandeConverter ;
	   @Autowired
         private UtilisateurConverter utilisateurConverter ;
    private Boolean emetteur;
    private Boolean demandeConcerne;
    private Boolean destinataire;

	public  MessageConverter(){
		init(true);
	}

	@Override 
 	public Message toItem(MessageVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Message item = new Message();
			 if(StringUtil.isNotEmpty(vo.getContenu()))
                  item.setContenu(vo.getContenu());
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getObjet()))
                  item.setObjet(vo.getObjet());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getEmetteurVo()!=null && this.emetteur)
			     item.setEmetteur(utilisateurConverter.toItem(vo.getEmetteurVo())) ;
             if(vo.getDemandeConcerneVo()!=null && this.demandeConcerne)
			     item.setDemandeConcerne(demandeConverter.toItem(vo.getDemandeConcerneVo())) ;

	         if(ListUtil.isNotEmpty(vo.getDestinataireVo()) && this.destinataire)
                  item.setDestinataire(utilisateurConverter.toItem(vo.getDestinataireVo()));



		return item;
 		}
 	}

 	 @Override 
 	public MessageVo toVo(Message item) {
 		if (item == null) {
    		return null;
      	} else {
			MessageVo vo = new MessageVo();

			if(StringUtil.isNotEmpty(item.getContenu()))
				vo.setContenu(item.getContenu());
			
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			if(StringUtil.isNotEmpty(item.getObjet()))
				vo.setObjet(item.getObjet());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getEmetteur()!=null && this.emetteur) {
				   vo.setEmetteurVo(utilisateurConverter.toVo(item.getEmetteur())) ;
			   } 
            if(item.getDemandeConcerne()!=null && this.demandeConcerne) {
				   vo.setDemandeConcerneVo(demandeConverter.toVo(item.getDemandeConcerne())) ;
			   } 
	         if(ListUtil.isNotEmpty(item.getDestinataire()) && this.destinataire){
				
				 utilisateurConverter.init(false);
                vo.setDestinataireVo(utilisateurConverter.toVo(item.getDestinataire()));
              	 utilisateurConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       emetteur = value;
       demandeConcerne = value;
       destinataire = value;
	}


	

	
	   public DemandeConverter getDemandeConverter(){
		return this.demandeConverter;
	}  
        public void setDemandeConverter(DemandeConverter demandeConverter ){
		 this.demandeConverter = demandeConverter;
	}  
	   public UtilisateurConverter getUtilisateurConverter(){
		return this.utilisateurConverter;
	}  
        public void setUtilisateurConverter(UtilisateurConverter utilisateurConverter ){
		 this.utilisateurConverter = utilisateurConverter;
	}  
	
	 public boolean  isEmetteur(){
		  return this.emetteur;
	 }
	 public void  setEmetteur(boolean emetteur){
		   this.emetteur = emetteur;
	 }
	 public boolean  isDemandeConcerne(){
		  return this.demandeConcerne;
	 }
	 public void  setDemandeConcerne(boolean demandeConcerne){
		   this.demandeConcerne = demandeConcerne;
	 }
       public Boolean  isDestinataire(){
		 return this.destinataire ;
	   }
		 public void  setDestinataire(Boolean destinataire ){
            this.destinataire  = destinataire ;
		 }
}