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
import ma.zs.generated.bean.Reponse; 
import ma.zs.generated.service.facade.ReponseService;
import ma.zs.generated.ws.rest.provided.converter.ReponseConverter;
import ma.zs.generated.ws.rest.provided.vo.ReponseVo;

@Api("Manages reponse services")
@RestController
@RequestMapping("generated/reponse")
public class ReponseRest {

	@Autowired 
	private ReponseService reponseService;
	
	@Autowired 
	private ReponseConverter reponseConverter ;

    @ApiOperation("Saves the specified reponse")
	@PostMapping("/")
	public ReponseVo save(@RequestBody ReponseVo reponseVo){
		Reponse reponse= reponseConverter.toItem(reponseVo);
	  reponse=	reponseService.save(reponse);
		return reponseConverter.toVo(reponse);
	}

    @ApiOperation("Delete the specified reponse")
	@DeleteMapping("/")
	public int delete(@RequestBody ReponseVo reponseVo){
		Reponse reponse = reponseConverter.toItem(reponseVo);
		return reponseService.delete(reponse);
	}

	@ApiOperation("Updates the specified reponse")
	@PutMapping("/")
	public ReponseVo update(@RequestBody ReponseVo reponseVo){
		Reponse reponse= reponseConverter.toItem(reponseVo);
	  reponse=	reponseService.update(reponse);
		return reponseConverter.toVo(reponse);
	}

	@ApiOperation("Finds a list of all reponses")
	@GetMapping("/")
	public List<ReponseVo> findAll(){
		return reponseConverter.toVo(reponseService.findAll());
	}
    
	@ApiOperation("Finds a reponse by id")
	@GetMapping("/id/{id}")
	public ReponseVo findById(@PathVariable Long id){
		return  reponseConverter.toVo(reponseService.findById(id));
	}
	@ApiOperation("Deletes a reponse by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 reponseService.deleteById(id);
	}

	@ApiOperation("Finds a  reponse by reponse")
    @GetMapping("/reponse/{reponse}")
	public ReponseVo findByReponse(@PathVariable String reponse){
		return  reponseConverter.toVo(reponseService.findByReponse(reponse));
	}
	@ApiOperation("Deletes a  reponse by reponse")
    @DeleteMapping("/reponse/{reponse}")
	public int deleteByReponse(@PathVariable String reponse){
		return  reponseService.deleteByReponse(reponse);
	}
	


    @ApiOperation("Finds a reponse by formule of question")
	@GetMapping("/question/formule/{formule}")
	public List<ReponseVo> findByQuestionFormule(@PathVariable String formule){
		return reponseConverter.toVo(reponseService.findByQuestionFormule(formule));
	}
	
	@ApiOperation("Deletes a reponse by formule of question")
	@DeleteMapping("/question/formule/{formule}")
	public int deleteByQuestionFormule(@PathVariable String formule){
		return reponseService.deleteByQuestionFormule(formule);
	}
	
	@ApiOperation("Finds reponse by id of question")
	@GetMapping("/question/id/{id}")
	public List<ReponseVo> findByQuestionId(@PathVariable Long id){
		return reponseConverter.toVo(reponseService.findByQuestionId(id));
	}
	@ApiOperation("Deletes reponse by id of question")
	@DeleteMapping("/question/id/{id}")
	public int deleteByQuestionId(@PathVariable Long id){
		return reponseService.deleteByQuestionId(id);
	}
     	
   
    @ApiOperation("Search reponse by a specific criterion")
    @PostMapping("/search")
	public List<ReponseVo> findByCriteria(@RequestBody ReponseVo reponseVo){
       return reponseConverter.toVo(reponseService.findByCriteria(reponseVo));
	}	
	public ReponseConverter getReponseConverter(){
		return reponseConverter;
	}
 
	public void setReponseConverter(ReponseConverter reponseConverter){
		this.reponseConverter=reponseConverter;
	}

	public ReponseService getReponseService(){
		return reponseService;
	}
	public void setReponseService( ReponseService reponseService){
	 	this.reponseService=reponseService;
	}
	

}