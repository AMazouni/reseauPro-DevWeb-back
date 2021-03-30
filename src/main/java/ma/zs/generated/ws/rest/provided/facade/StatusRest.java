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
import ma.zs.generated.bean.Status; 
import ma.zs.generated.service.facade.StatusService;
import ma.zs.generated.ws.rest.provided.converter.StatusConverter;
import ma.zs.generated.ws.rest.provided.vo.StatusVo;

@Api("Manages status services")
@RestController
@RequestMapping("generated/status")
public class StatusRest {

	@Autowired 
	private StatusService statusService;
	
	@Autowired 
	private StatusConverter statusConverter ;

    @ApiOperation("Saves the specified status")
	@PostMapping("/")
	public StatusVo save(@RequestBody StatusVo statusVo){
		Status status= statusConverter.toItem(statusVo);
	  status=	statusService.save(status);
		return statusConverter.toVo(status);
	}

    @ApiOperation("Delete the specified status")
	@DeleteMapping("/")
	public int delete(@RequestBody StatusVo statusVo){
		Status status = statusConverter.toItem(statusVo);
		return statusService.delete(status);
	}

	@ApiOperation("Updates the specified status")
	@PutMapping("/")
	public StatusVo update(@RequestBody StatusVo statusVo){
		Status status= statusConverter.toItem(statusVo);
	  status=	statusService.update(status);
		return statusConverter.toVo(status);
	}

	@ApiOperation("Finds a list of all statuss")
	@GetMapping("/")
	public List<StatusVo> findAll(){
		return statusConverter.toVo(statusService.findAll());
	}
    
	@ApiOperation("Finds a status by id")
	@GetMapping("/id/{id}")
	public StatusVo findById(@PathVariable Long id){
		return  statusConverter.toVo(statusService.findById(id));
	}
	@ApiOperation("Deletes a status by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 statusService.deleteById(id);
	}

	@ApiOperation("Finds a  status by code")
    @GetMapping("/code/{code}")
	public StatusVo findByCode(@PathVariable String code){
		return  statusConverter.toVo(statusService.findByCode(code));
	}
	@ApiOperation("Deletes a  status by code")
    @DeleteMapping("/code/{code}")
	public int deleteByCode(@PathVariable String code){
		return  statusService.deleteByCode(code);
	}
	


   
    @ApiOperation("Search status by a specific criterion")
    @PostMapping("/search")
	public List<StatusVo> findByCriteria(@RequestBody StatusVo statusVo){
       return statusConverter.toVo(statusService.findByCriteria(statusVo));
	}	
	public StatusConverter getStatusConverter(){
		return statusConverter;
	}
 
	public void setStatusConverter(StatusConverter statusConverter){
		this.statusConverter=statusConverter;
	}

	public StatusService getStatusService(){
		return statusService;
	}
	public void setStatusService( StatusService statusService){
	 	this.statusService=statusService;
	}
	

}