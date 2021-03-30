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
import ma.zs.generated.bean.ProfesseurInfo; 
import ma.zs.generated.service.facade.ProfesseurInfoService;
import ma.zs.generated.ws.rest.provided.converter.ProfesseurInfoConverter;
import ma.zs.generated.ws.rest.provided.vo.ProfesseurInfoVo;

@Api("Manages professeurInfo services")
@RestController
@RequestMapping("generated/professeurInfo")
public class ProfesseurInfoRest {

	@Autowired 
	private ProfesseurInfoService professeurInfoService;
	
	@Autowired 
	private ProfesseurInfoConverter professeurInfoConverter ;

    @ApiOperation("Saves the specified professeurInfo")
	@PostMapping("/")
	public ProfesseurInfoVo save(@RequestBody ProfesseurInfoVo professeurInfoVo){
		ProfesseurInfo professeurInfo= professeurInfoConverter.toItem(professeurInfoVo);
	  professeurInfo=	professeurInfoService.save(professeurInfo);
		return professeurInfoConverter.toVo(professeurInfo);
	}

    @ApiOperation("Delete the specified professeurInfo")
	@DeleteMapping("/")
	public int delete(@RequestBody ProfesseurInfoVo professeurInfoVo){
		ProfesseurInfo professeurInfo = professeurInfoConverter.toItem(professeurInfoVo);
		return professeurInfoService.delete(professeurInfo);
	}

	@ApiOperation("Updates the specified professeurInfo")
	@PutMapping("/")
	public ProfesseurInfoVo update(@RequestBody ProfesseurInfoVo professeurInfoVo){
		ProfesseurInfo professeurInfo= professeurInfoConverter.toItem(professeurInfoVo);
	  professeurInfo=	professeurInfoService.update(professeurInfo);
		return professeurInfoConverter.toVo(professeurInfo);
	}

	@ApiOperation("Finds a list of all professeurInfos")
	@GetMapping("/")
	public List<ProfesseurInfoVo> findAll(){
		return professeurInfoConverter.toVo(professeurInfoService.findAll());
	}
    
	@ApiOperation("Finds a professeurInfo by id")
	@GetMapping("/id/{id}")
	public ProfesseurInfoVo findById(@PathVariable Long id){
		return  professeurInfoConverter.toVo(professeurInfoService.findById(id));
	}
	@ApiOperation("Deletes a professeurInfo by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 professeurInfoService.deleteById(id);
	}

	@ApiOperation("Finds a  professeurInfo by code")
    @GetMapping("/code/{code}")
	public ProfesseurInfoVo findByCode(@PathVariable String code){
		return  professeurInfoConverter.toVo(professeurInfoService.findByCode(code));
	}
	@ApiOperation("Deletes a  professeurInfo by code")
    @DeleteMapping("/code/{code}")
	public int deleteByCode(@PathVariable String code){
		return  professeurInfoService.deleteByCode(code);
	}
	


    @ApiOperation("Finds a professeurInfo by ref of etablissement")
	@GetMapping("/etablissement/ref/{ref}")
	public List<ProfesseurInfoVo> findByEtablissementRef(@PathVariable String ref){
		return professeurInfoConverter.toVo(professeurInfoService.findByEtablissementRef(ref));
	}
	
	@ApiOperation("Deletes a professeurInfo by ref of etablissement")
	@DeleteMapping("/etablissement/ref/{ref}")
	public int deleteByEtablissementRef(@PathVariable String ref){
		return professeurInfoService.deleteByEtablissementRef(ref);
	}
	
	@ApiOperation("Finds professeurInfo by id of etablissement")
	@GetMapping("/etablissement/id/{id}")
	public List<ProfesseurInfoVo> findByEtablissementId(@PathVariable Long id){
		return professeurInfoConverter.toVo(professeurInfoService.findByEtablissementId(id));
	}
	@ApiOperation("Deletes professeurInfo by id of etablissement")
	@DeleteMapping("/etablissement/id/{id}")
	public int deleteByEtablissementId(@PathVariable Long id){
		return professeurInfoService.deleteByEtablissementId(id);
	}
     	
    @ApiOperation("Finds a professeurInfo by email of compte")
	@GetMapping("/compte/email/{email}")
	public List<ProfesseurInfoVo> findByCompteEmail(@PathVariable String email){
		return professeurInfoConverter.toVo(professeurInfoService.findByCompteEmail(email));
	}
	
	@ApiOperation("Deletes a professeurInfo by email of compte")
	@DeleteMapping("/compte/email/{email}")
	public int deleteByCompteEmail(@PathVariable String email){
		return professeurInfoService.deleteByCompteEmail(email);
	}
	
	@ApiOperation("Finds professeurInfo by id of compte")
	@GetMapping("/compte/id/{id}")
	public List<ProfesseurInfoVo> findByCompteId(@PathVariable Long id){
		return professeurInfoConverter.toVo(professeurInfoService.findByCompteId(id));
	}
	@ApiOperation("Deletes professeurInfo by id of compte")
	@DeleteMapping("/compte/id/{id}")
	public int deleteByCompteId(@PathVariable Long id){
		return professeurInfoService.deleteByCompteId(id);
	}
     	
   
    @ApiOperation("Search professeurInfo by a specific criterion")
    @PostMapping("/search")
	public List<ProfesseurInfoVo> findByCriteria(@RequestBody ProfesseurInfoVo professeurInfoVo){
       return professeurInfoConverter.toVo(professeurInfoService.findByCriteria(professeurInfoVo));
	}	
	public ProfesseurInfoConverter getProfesseurInfoConverter(){
		return professeurInfoConverter;
	}
 
	public void setProfesseurInfoConverter(ProfesseurInfoConverter professeurInfoConverter){
		this.professeurInfoConverter=professeurInfoConverter;
	}

	public ProfesseurInfoService getProfesseurInfoService(){
		return professeurInfoService;
	}
	public void setProfesseurInfoService( ProfesseurInfoService professeurInfoService){
	 	this.professeurInfoService=professeurInfoService;
	}
	

}