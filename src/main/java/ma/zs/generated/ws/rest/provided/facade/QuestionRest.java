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
import ma.zs.generated.bean.Question; 
import ma.zs.generated.service.facade.QuestionService;
import ma.zs.generated.ws.rest.provided.converter.QuestionConverter;
import ma.zs.generated.ws.rest.provided.vo.QuestionVo;

@Api("Manages question services")
@RestController
@RequestMapping("generated/question")
public class QuestionRest {

	@Autowired 
	private QuestionService questionService;
	
	@Autowired 
	private QuestionConverter questionConverter ;

    @ApiOperation("Saves the specified question")
	@PostMapping("/")
	public QuestionVo save(@RequestBody QuestionVo questionVo){
		Question question= questionConverter.toItem(questionVo);
	  question=	questionService.save(question);
		return questionConverter.toVo(question);
	}

    @ApiOperation("Delete the specified question")
	@DeleteMapping("/")
	public int delete(@RequestBody QuestionVo questionVo){
		Question question = questionConverter.toItem(questionVo);
		return questionService.delete(question);
	}

	@ApiOperation("Updates the specified question")
	@PutMapping("/")
	public QuestionVo update(@RequestBody QuestionVo questionVo){
		Question question= questionConverter.toItem(questionVo);
	  question=	questionService.update(question);
		return questionConverter.toVo(question);
	}

	@ApiOperation("Finds a list of all questions")
	@GetMapping("/")
	public List<QuestionVo> findAll(){
		return questionConverter.toVo(questionService.findAll());
	}
    
	@ApiOperation("Finds a question by id")
	@GetMapping("/id/{id}")
	public QuestionVo findById(@PathVariable Long id){
		return  questionConverter.toVo(questionService.findById(id));
	}
	@ApiOperation("Deletes a question by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 questionService.deleteById(id);
	}

	@ApiOperation("Finds a  question by formule")
    @GetMapping("/formule/{formule}")
	public QuestionVo findByFormule(@PathVariable String formule){
		return  questionConverter.toVo(questionService.findByFormule(formule));
	}
	@ApiOperation("Deletes a  question by formule")
    @DeleteMapping("/formule/{formule}")
	public int deleteByFormule(@PathVariable String formule){
		return  questionService.deleteByFormule(formule);
	}
	


   
    @ApiOperation("Search question by a specific criterion")
    @PostMapping("/search")
	public List<QuestionVo> findByCriteria(@RequestBody QuestionVo questionVo){
       return questionConverter.toVo(questionService.findByCriteria(questionVo));
	}	
	public QuestionConverter getQuestionConverter(){
		return questionConverter;
	}
 
	public void setQuestionConverter(QuestionConverter questionConverter){
		this.questionConverter=questionConverter;
	}

	public QuestionService getQuestionService(){
		return questionService;
	}
	public void setQuestionService( QuestionService questionService){
	 	this.questionService=questionService;
	}
	

}