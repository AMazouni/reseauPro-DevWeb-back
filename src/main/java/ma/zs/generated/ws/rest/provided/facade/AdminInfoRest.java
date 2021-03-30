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
import ma.zs.generated.bean.AdminInfo; 
import ma.zs.generated.service.facade.AdminInfoService;
import ma.zs.generated.ws.rest.provided.converter.AdminInfoConverter;
import ma.zs.generated.ws.rest.provided.vo.AdminInfoVo;

@Api("Manages adminInfo services")
@RestController
@RequestMapping("generated/adminInfo")
public class AdminInfoRest {

	@Autowired 
	private AdminInfoService adminInfoService;
	
	@Autowired 
	private AdminInfoConverter adminInfoConverter ;

    @ApiOperation("Saves the specified adminInfo")
	@PostMapping("/")
	public AdminInfoVo save(@RequestBody AdminInfoVo adminInfoVo){
		AdminInfo adminInfo= adminInfoConverter.toItem(adminInfoVo);
	  adminInfo=	adminInfoService.save(adminInfo);
		return adminInfoConverter.toVo(adminInfo);
	}

    @ApiOperation("Delete the specified adminInfo")
	@DeleteMapping("/")
	public int delete(@RequestBody AdminInfoVo adminInfoVo){
		AdminInfo adminInfo = adminInfoConverter.toItem(adminInfoVo);
		return adminInfoService.delete(adminInfo);
	}

	@ApiOperation("Updates the specified adminInfo")
	@PutMapping("/")
	public AdminInfoVo update(@RequestBody AdminInfoVo adminInfoVo){
		AdminInfo adminInfo= adminInfoConverter.toItem(adminInfoVo);
	  adminInfo=	adminInfoService.update(adminInfo);
		return adminInfoConverter.toVo(adminInfo);
	}

	@ApiOperation("Finds a list of all adminInfos")
	@GetMapping("/")
	public List<AdminInfoVo> findAll(){
		return adminInfoConverter.toVo(adminInfoService.findAll());
	}
    
	@ApiOperation("Finds a adminInfo by id")
	@GetMapping("/id/{id}")
	public AdminInfoVo findById(@PathVariable Long id){
		return  adminInfoConverter.toVo(adminInfoService.findById(id));
	}
	@ApiOperation("Deletes a adminInfo by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 adminInfoService.deleteById(id);
	}

	@ApiOperation("Finds a  adminInfo by nom")
    @GetMapping("/nom/{nom}")
	public AdminInfoVo findByNom(@PathVariable String nom){
		return  adminInfoConverter.toVo(adminInfoService.findByNom(nom));
	}
	@ApiOperation("Deletes a  adminInfo by nom")
    @DeleteMapping("/nom/{nom}")
	public int deleteByNom(@PathVariable String nom){
		return  adminInfoService.deleteByNom(nom);
	}
	


    @ApiOperation("Finds a adminInfo by email of compte")
	@GetMapping("/compte/email/{email}")
	public List<AdminInfoVo> findByCompteEmail(@PathVariable String email){
		return adminInfoConverter.toVo(adminInfoService.findByCompteEmail(email));
	}
	
	@ApiOperation("Deletes a adminInfo by email of compte")
	@DeleteMapping("/compte/email/{email}")
	public int deleteByCompteEmail(@PathVariable String email){
		return adminInfoService.deleteByCompteEmail(email);
	}
	
	@ApiOperation("Finds adminInfo by id of compte")
	@GetMapping("/compte/id/{id}")
	public List<AdminInfoVo> findByCompteId(@PathVariable Long id){
		return adminInfoConverter.toVo(adminInfoService.findByCompteId(id));
	}
	@ApiOperation("Deletes adminInfo by id of compte")
	@DeleteMapping("/compte/id/{id}")
	public int deleteByCompteId(@PathVariable Long id){
		return adminInfoService.deleteByCompteId(id);
	}
     	
   
    @ApiOperation("Search adminInfo by a specific criterion")
    @PostMapping("/search")
	public List<AdminInfoVo> findByCriteria(@RequestBody AdminInfoVo adminInfoVo){
       return adminInfoConverter.toVo(adminInfoService.findByCriteria(adminInfoVo));
	}	
	public AdminInfoConverter getAdminInfoConverter(){
		return adminInfoConverter;
	}
 
	public void setAdminInfoConverter(AdminInfoConverter adminInfoConverter){
		this.adminInfoConverter=adminInfoConverter;
	}

	public AdminInfoService getAdminInfoService(){
		return adminInfoService;
	}
	public void setAdminInfoService( AdminInfoService adminInfoService){
	 	this.adminInfoService=adminInfoService;
	}
	

}