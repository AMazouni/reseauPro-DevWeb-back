package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Commentaire; 
import ma.zs.generated.ws.rest.provided.vo.CommentaireVo;

@Component 
public class CommentaireConverter extends AbstractConverter<Commentaire,CommentaireVo>{ 
	
	   @Autowired
         private UtilisateurConverter utilisateurConverter ;
	   @Autowired
         private PublicationConverter publicationConverter ;
    private Boolean publication;
    private Boolean postePar;

	public  CommentaireConverter(){
		init(true);
	}

	@Override 
 	public Commentaire toItem(CommentaireVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Commentaire item = new Commentaire();
			 if(StringUtil.isNotEmpty(vo.getComref()))
                  item.setComref(vo.getComref());
			 if(StringUtil.isNotEmpty(vo.getContenu()))
                  item.setContenu(vo.getContenu());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getPublicationVo()!=null && this.publication)
			     item.setPublication(publicationConverter.toItem(vo.getPublicationVo())) ;
             if(vo.getPosteParVo()!=null && this.postePar)
			     item.setPostePar(utilisateurConverter.toItem(vo.getPosteParVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public CommentaireVo toVo(Commentaire item) {
 		if (item == null) {
    		return null;
      	} else {
			CommentaireVo vo = new CommentaireVo();

			if(StringUtil.isNotEmpty(item.getComref()))
				vo.setComref(item.getComref());
			
			if(StringUtil.isNotEmpty(item.getContenu()))
				vo.setContenu(item.getContenu());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getPublication()!=null && this.publication) {
				   vo.setPublicationVo(publicationConverter.toVo(item.getPublication())) ;
			   } 
            if(item.getPostePar()!=null && this.postePar) {
				   vo.setPosteParVo(utilisateurConverter.toVo(item.getPostePar())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       publication = value;
       postePar = value;
	}


	

	
	   public UtilisateurConverter getUtilisateurConverter(){
		return this.utilisateurConverter;
	}  
        public void setUtilisateurConverter(UtilisateurConverter utilisateurConverter ){
		 this.utilisateurConverter = utilisateurConverter;
	}  
	   public PublicationConverter getPublicationConverter(){
		return this.publicationConverter;
	}  
        public void setPublicationConverter(PublicationConverter publicationConverter ){
		 this.publicationConverter = publicationConverter;
	}  
	
	 public boolean  isPublication(){
		  return this.publication;
	 }
	 public void  setPublication(boolean publication){
		   this.publication = publication;
	 }
	 public boolean  isPostePar(){
		  return this.postePar;
	 }
	 public void  setPostePar(boolean postePar){
		   this.postePar = postePar;
	 }
}