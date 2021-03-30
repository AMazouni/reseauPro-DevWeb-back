package  ma.zs.generated.ws.rest.provided.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.Commentaire; 
import ma.zs.generated.service.facade.CommentaireService;
import ma.zs.generated.ws.rest.provided.converter.CommentaireConverter;
import ma.zs.generated.ws.rest.provided.vo.CommentaireVo;

@Api("Manages commentaire services")
@RestController
@RequestMapping("generated/commentaire")
public class CommentaireRest {

	@Autowired 
	private CommentaireService commentaireService;
	
	@Autowired 
	private CommentaireConverter commentaireConverter ;

    @ApiOperation("Saves the specified commentaire")
	@PostMapping("/")
	public CommentaireVo save(@RequestBody CommentaireVo commentaireVo){
		Commentaire commentaire= commentaireConverter.toItem(commentaireVo);
	  commentaire=	commentaireService.save(commentaire);
		return commentaireConverter.toVo(commentaire);
	}

    @ApiOperation("Delete the specified commentaire")
	@DeleteMapping("/")
	public int delete(@RequestBody CommentaireVo commentaireVo){
		Commentaire commentaire = commentaireConverter.toItem(commentaireVo);
		return commentaireService.delete(commentaire);
	}

	@ApiOperation("Updates the specified commentaire")
	@PutMapping("/")
	public CommentaireVo update(@RequestBody CommentaireVo commentaireVo){
		Commentaire commentaire= commentaireConverter.toItem(commentaireVo);
	  commentaire=	commentaireService.update(commentaire);
		return commentaireConverter.toVo(commentaire);
	}

	@ApiOperation("Finds a list of all commentaires")
	@GetMapping("/")
	public List<CommentaireVo> findAll(){
		return commentaireConverter.toVo(commentaireService.findAll());
	}
    
	@ApiOperation("Finds a commentaire by id")
	@GetMapping("/id/{id}")
	public CommentaireVo findById(@PathVariable Long id){
		return  commentaireConverter.toVo(commentaireService.findById(id));
	}
	@ApiOperation("Deletes a commentaire by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 commentaireService.deleteById(id);
	}

	@ApiOperation("Finds a  commentaire by comref")
    @GetMapping("/comref/{comref}")
	public CommentaireVo findByComref(@PathVariable String comref){
		return  commentaireConverter.toVo(commentaireService.findByComref(comref));
	}
	@ApiOperation("Deletes a  commentaire by comref")
    @DeleteMapping("/comref/{comref}")
	public int deleteByComref(@PathVariable String comref){
		return  commentaireService.deleteByComref(comref);
	}
	


    @ApiOperation("Finds a commentaire by ref of publication")
	@GetMapping("/publication/ref/{ref}")
	public List<CommentaireVo> findByPublicationRef(@PathVariable String ref){
		return commentaireConverter.toVo(commentaireService.findByPublicationRef(ref));
	}
	
	@ApiOperation("Deletes a commentaire by ref of publication")
	@DeleteMapping("/publication/ref/{ref}")
	public int deleteByPublicationRef(@PathVariable String ref){
		return commentaireService.deleteByPublicationRef(ref);
	}
	
	@ApiOperation("Finds commentaire by id of publication")
	@GetMapping("/publication/id/{id}")
	public List<CommentaireVo> findByPublicationId(@PathVariable Long id){
		return commentaireConverter.toVo(commentaireService.findByPublicationId(id));
	}
	@ApiOperation("Deletes commentaire by id of publication")
	@DeleteMapping("/publication/id/{id}")
	public int deleteByPublicationId(@PathVariable Long id){
		return commentaireService.deleteByPublicationId(id);
	}
     	
    @ApiOperation("Finds a commentaire by email of postePar")
	@GetMapping("/postePar/email/{email}")
	public List<CommentaireVo> findByPosteParEmail(@PathVariable String email){
		return commentaireConverter.toVo(commentaireService.findByPosteParEmail(email));
	}
	
	@ApiOperation("Deletes a commentaire by email of postePar")
	@DeleteMapping("/postePar/email/{email}")
	public int deleteByPosteParEmail(@PathVariable String email){
		return commentaireService.deleteByPosteParEmail(email);
	}
	
	@ApiOperation("Finds commentaire by id of postePar")
	@GetMapping("/postePar/id/{id}")
	public List<CommentaireVo> findByPosteParId(@PathVariable Long id){
		return commentaireConverter.toVo(commentaireService.findByPosteParId(id));
	}
	@ApiOperation("Deletes commentaire by id of postePar")
	@DeleteMapping("/postePar/id/{id}")
	public int deleteByPosteParId(@PathVariable Long id){
		return commentaireService.deleteByPosteParId(id);
	}
     	
   
    @ApiOperation("Search commentaire by a specific criterion")
    @PostMapping("/search")
	public List<CommentaireVo> findByCriteria(@RequestBody CommentaireVo commentaireVo){
       return commentaireConverter.toVo(commentaireService.findByCriteria(commentaireVo));
	}	
	public CommentaireConverter getCommentaireConverter(){
		return commentaireConverter;
	}
 
	public void setCommentaireConverter(CommentaireConverter commentaireConverter){
		this.commentaireConverter=commentaireConverter;
	}

	public CommentaireService getCommentaireService(){
		return commentaireService;
	}
	public void setCommentaireService( CommentaireService commentaireService){
	 	this.commentaireService=commentaireService;
	}
	

}