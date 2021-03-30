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
import ma.zs.generated.bean.Etablissement; 
import ma.zs.generated.service.facade.EtablissementService;
import ma.zs.generated.ws.rest.provided.converter.EtablissementConverter;
import ma.zs.generated.ws.rest.provided.vo.EtablissementVo;

@Api("Manages etablissement services")
@RestController
@RequestMapping("generated/etablissement")
public class EtablissementRest {

	@Autowired 
	private EtablissementService etablissementService;
	
	@Autowired 
	private EtablissementConverter etablissementConverter ;

    @ApiOperation("Saves the specified etablissement")
	@PostMapping("/")
	public EtablissementVo save(@RequestBody EtablissementVo etablissementVo){
		Etablissement etablissement= etablissementConverter.toItem(etablissementVo);
	  etablissement=	etablissementService.save(etablissement);
		return etablissementConverter.toVo(etablissement);
	}

    @ApiOperation("Delete the specified etablissement")
	@DeleteMapping("/")
	public int delete(@RequestBody EtablissementVo etablissementVo){
		Etablissement etablissement = etablissementConverter.toItem(etablissementVo);
		return etablissementService.delete(etablissement);
	}

	@ApiOperation("Updates the specified etablissement")
	@PutMapping("/")
	public EtablissementVo update(@RequestBody EtablissementVo etablissementVo){
		Etablissement etablissement= etablissementConverter.toItem(etablissementVo);
	  etablissement=	etablissementService.update(etablissement);
		return etablissementConverter.toVo(etablissement);
	}

	@ApiOperation("Finds a list of all etablissements")
	@GetMapping("/")
	public List<EtablissementVo> findAll(){
		return etablissementConverter.toVo(etablissementService.findAll());
	}
    
	@ApiOperation("Finds a etablissement by id")
	@GetMapping("/id/{id}")
	public EtablissementVo findById(@PathVariable Long id){
		return  etablissementConverter.toVo(etablissementService.findById(id));
	}
	@ApiOperation("Deletes a etablissement by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 etablissementService.deleteById(id);
	}

	@ApiOperation("Finds a  etablissement by ref")
    @GetMapping("/ref/{ref}")
	public EtablissementVo findByRef(@PathVariable String ref){
		return  etablissementConverter.toVo(etablissementService.findByRef(ref));
	}
	@ApiOperation("Deletes a  etablissement by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  etablissementService.deleteByRef(ref);
	}
	


   
    @ApiOperation("Search etablissement by a specific criterion")
    @PostMapping("/search")
	public List<EtablissementVo> findByCriteria(@RequestBody EtablissementVo etablissementVo){
       return etablissementConverter.toVo(etablissementService.findByCriteria(etablissementVo));
	}	
	public EtablissementConverter getEtablissementConverter(){
		return etablissementConverter;
	}
 
	public void setEtablissementConverter(EtablissementConverter etablissementConverter){
		this.etablissementConverter=etablissementConverter;
	}

	public EtablissementService getEtablissementService(){
		return etablissementService;
	}
	public void setEtablissementService( EtablissementService etablissementService){
	 	this.etablissementService=etablissementService;
	}
	

}