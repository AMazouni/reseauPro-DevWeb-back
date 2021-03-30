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
import ma.zs.generated.bean.Message; 
import ma.zs.generated.service.facade.MessageService;
import ma.zs.generated.ws.rest.provided.converter.MessageConverter;
import ma.zs.generated.ws.rest.provided.vo.MessageVo;

@Api("Manages message services")
@RestController
@RequestMapping("generated/message")
public class MessageRest {

	@Autowired 
	private MessageService messageService;
	
	@Autowired 
	private MessageConverter messageConverter ;

    @ApiOperation("Saves the specified message")
	@PostMapping("/")
	public MessageVo save(@RequestBody MessageVo messageVo){
		Message message= messageConverter.toItem(messageVo);
	  message=	messageService.save(message);
		return messageConverter.toVo(message);
	}

    @ApiOperation("Delete the specified message")
	@DeleteMapping("/")
	public int delete(@RequestBody MessageVo messageVo){
		Message message = messageConverter.toItem(messageVo);
		return messageService.delete(message);
	}

	@ApiOperation("Updates the specified message")
	@PutMapping("/")
	public MessageVo update(@RequestBody MessageVo messageVo){
		Message message= messageConverter.toItem(messageVo);
	  message=	messageService.update(message);
		return messageConverter.toVo(message);
	}

	@ApiOperation("Finds a list of all messages")
	@GetMapping("/")
	public List<MessageVo> findAll(){
		return messageConverter.toVo(messageService.findAll());
	}
    
	@ApiOperation("Finds a message by id")
	@GetMapping("/id/{id}")
	public MessageVo findById(@PathVariable Long id){
		return  messageConverter.toVo(messageService.findById(id));
	}
	@ApiOperation("Deletes a message by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 messageService.deleteById(id);
	}

	@ApiOperation("Finds a  message by ref")
    @GetMapping("/ref/{ref}")
	public MessageVo findByRef(@PathVariable String ref){
		return  messageConverter.toVo(messageService.findByRef(ref));
	}
	@ApiOperation("Deletes a  message by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  messageService.deleteByRef(ref);
	}
	


    @ApiOperation("Finds a message by email of emetteur")
	@GetMapping("/emetteur/email/{email}")
	public List<MessageVo> findByEmetteurEmail(@PathVariable String email){
		return messageConverter.toVo(messageService.findByEmetteurEmail(email));
	}
	
	@ApiOperation("Deletes a message by email of emetteur")
	@DeleteMapping("/emetteur/email/{email}")
	public int deleteByEmetteurEmail(@PathVariable String email){
		return messageService.deleteByEmetteurEmail(email);
	}
	
	@ApiOperation("Finds message by id of emetteur")
	@GetMapping("/emetteur/id/{id}")
	public List<MessageVo> findByEmetteurId(@PathVariable Long id){
		return messageConverter.toVo(messageService.findByEmetteurId(id));
	}
	@ApiOperation("Deletes message by id of emetteur")
	@DeleteMapping("/emetteur/id/{id}")
	public int deleteByEmetteurId(@PathVariable Long id){
		return messageService.deleteByEmetteurId(id);
	}
     	
    @ApiOperation("Finds a message by ref of demandeConcerne")
	@GetMapping("/demandeConcerne/ref/{ref}")
	public List<MessageVo> findByDemandeConcerneRef(@PathVariable String ref){
		return messageConverter.toVo(messageService.findByDemandeConcerneRef(ref));
	}
	
	@ApiOperation("Deletes a message by ref of demandeConcerne")
	@DeleteMapping("/demandeConcerne/ref/{ref}")
	public int deleteByDemandeConcerneRef(@PathVariable String ref){
		return messageService.deleteByDemandeConcerneRef(ref);
	}
	
	@ApiOperation("Finds message by id of demandeConcerne")
	@GetMapping("/demandeConcerne/id/{id}")
	public List<MessageVo> findByDemandeConcerneId(@PathVariable Long id){
		return messageConverter.toVo(messageService.findByDemandeConcerneId(id));
	}
	@ApiOperation("Deletes message by id of demandeConcerne")
	@DeleteMapping("/demandeConcerne/id/{id}")
	public int deleteByDemandeConcerneId(@PathVariable Long id){
		return messageService.deleteByDemandeConcerneId(id);
	}
     	
   
    @ApiOperation("Search message by a specific criterion")
    @PostMapping("/search")
	public List<MessageVo> findByCriteria(@RequestBody MessageVo messageVo){
       return messageConverter.toVo(messageService.findByCriteria(messageVo));
	}	
	public MessageConverter getMessageConverter(){
		return messageConverter;
	}
 
	public void setMessageConverter(MessageConverter messageConverter){
		this.messageConverter=messageConverter;
	}

	public MessageService getMessageService(){
		return messageService;
	}
	public void setMessageService( MessageService messageService){
	 	this.messageService=messageService;
	}
	

}