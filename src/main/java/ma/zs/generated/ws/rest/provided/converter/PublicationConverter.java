package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Publication; 
import ma.zs.generated.ws.rest.provided.vo.PublicationVo;

@Component 
public class PublicationConverter extends AbstractConverter<Publication,PublicationVo>{ 
	
	   @Autowired
         private CommentaireConverter commentaireConverter ;
	   @Autowired
         private UtilisateurConverter utilisateurConverter ;
    private Boolean postePar;
    private Boolean commentaire;

	public  PublicationConverter(){
		init(true);
	}

	@Override 
 	public Publication toItem(PublicationVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Publication item = new Publication();
			 if(StringUtil.isNotEmpty(vo.getContenu()))
                  item.setContenu(vo.getContenu());
			 if(StringUtil.isNotEmpty(vo.getVerified()))
                  item.setVerified(NumberUtil.toBoolean(vo.getVerified()));
			 if(StringUtil.isNotEmpty(vo.getRef()))
                  item.setRef(vo.getRef());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getPosteParVo()!=null && this.postePar)
			     item.setPostePar(utilisateurConverter.toItem(vo.getPosteParVo())) ;

	         if(ListUtil.isNotEmpty(vo.getCommentaireVo()) && this.commentaire)
                  item.setCommentaire(commentaireConverter.toItem(vo.getCommentaireVo()));



		return item;
 		}
 	}

 	 @Override 
 	public PublicationVo toVo(Publication item) {
 		if (item == null) {
    		return null;
      	} else {
			PublicationVo vo = new PublicationVo();

			if(StringUtil.isNotEmpty(item.getContenu()))
				vo.setContenu(item.getContenu());
			
			if(item.isVerified()!=null)
				vo.setVerified(NumberUtil.toString(item.isVerified()));
			if(StringUtil.isNotEmpty(item.getRef()))
				vo.setRef(item.getRef());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getPostePar()!=null && this.postePar) {
				   vo.setPosteParVo(utilisateurConverter.toVo(item.getPostePar())) ;
			   } 
	         if(ListUtil.isNotEmpty(item.getCommentaire()) && this.commentaire){
				
				 commentaireConverter.init(false);
                vo.setCommentaireVo(commentaireConverter.toVo(item.getCommentaire()));
              	 commentaireConverter.init(true);
			 }

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       postePar = value;
       commentaire = value;
	}


	

	
	   public CommentaireConverter getCommentaireConverter(){
		return this.commentaireConverter;
	}  
        public void setCommentaireConverter(CommentaireConverter commentaireConverter ){
		 this.commentaireConverter = commentaireConverter;
	}  
	   public UtilisateurConverter getUtilisateurConverter(){
		return this.utilisateurConverter;
	}  
        public void setUtilisateurConverter(UtilisateurConverter utilisateurConverter ){
		 this.utilisateurConverter = utilisateurConverter;
	}  
	
	 public boolean  isPostePar(){
		  return this.postePar;
	 }
	 public void  setPostePar(boolean postePar){
		   this.postePar = postePar;
	 }
       public Boolean  isCommentaire(){
		 return this.commentaire ;
	   }
		 public void  setCommentaire(Boolean commentaire ){
            this.commentaire  = commentaire ;
		 }
}