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
import ma.zs.generated.bean.Formation; 
import ma.zs.generated.service.facade.FormationService;
import ma.zs.generated.ws.rest.provided.converter.FormationConverter;
import ma.zs.generated.ws.rest.provided.vo.FormationVo;

@Api("Manages formation services")
@RestController
@RequestMapping("generated/formation")
public class FormationRest {

	@Autowired 
	private FormationService formationService;
	
	@Autowired 
	private FormationConverter formationConverter ;

    @ApiOperation("Saves the specified formation")
	@PostMapping("/")
	public FormationVo save(@RequestBody FormationVo formationVo){
		Formation formation= formationConverter.toItem(formationVo);
	  formation=	formationService.save(formation);
		return formationConverter.toVo(formation);
	}

    @ApiOperation("Delete the specified formation")
	@DeleteMapping("/")
	public int delete(@RequestBody FormationVo formationVo){
		Formation formation = formationConverter.toItem(formationVo);
		return formationService.delete(formation);
	}

	@ApiOperation("Updates the specified formation")
	@PutMapping("/")
	public FormationVo update(@RequestBody FormationVo formationVo){
		Formation formation= formationConverter.toItem(formationVo);
	  formation=	formationService.update(formation);
		return formationConverter.toVo(formation);
	}

	@ApiOperation("Finds a list of all formations")
	@GetMapping("/")
	public List<FormationVo> findAll(){
		return formationConverter.toVo(formationService.findAll());
	}
    
	@ApiOperation("Finds a formation by id")
	@GetMapping("/id/{id}")
	public FormationVo findById(@PathVariable Long id){
		return  formationConverter.toVo(formationService.findById(id));
	}
	@ApiOperation("Deletes a formation by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 formationService.deleteById(id);
	}

	@ApiOperation("Finds a  formation by ref")
    @GetMapping("/ref/{ref}")
	public FormationVo findByRef(@PathVariable String ref){
		return  formationConverter.toVo(formationService.findByRef(ref));
	}
	@ApiOperation("Deletes a  formation by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  formationService.deleteByRef(ref);
	}
	


    @ApiOperation("Finds a formation by ref of etablissement")
	@GetMapping("/etablissement/ref/{ref}")
	public List<FormationVo> findByEtablissementRef(@PathVariable String ref){
		return formationConverter.toVo(formationService.findByEtablissementRef(ref));
	}
	
	@ApiOperation("Deletes a formation by ref of etablissement")
	@DeleteMapping("/etablissement/ref/{ref}")
	public int deleteByEtablissementRef(@PathVariable String ref){
		return formationService.deleteByEtablissementRef(ref);
	}
	
	@ApiOperation("Finds formation by id of etablissement")
	@GetMapping("/etablissement/id/{id}")
	public List<FormationVo> findByEtablissementId(@PathVariable Long id){
		return formationConverter.toVo(formationService.findByEtablissementId(id));
	}
	@ApiOperation("Deletes formation by id of etablissement")
	@DeleteMapping("/etablissement/id/{id}")
	public int deleteByEtablissementId(@PathVariable Long id){
		return formationService.deleteByEtablissementId(id);
	}
     	
    @ApiOperation("Finds a formation by code of responsable")
	@GetMapping("/responsable/code/{code}")
	public List<FormationVo> findByResponsableCode(@PathVariable String code){
		return formationConverter.toVo(formationService.findByResponsableCode(code));
	}
	
	@ApiOperation("Deletes a formation by code of responsable")
	@DeleteMapping("/responsable/code/{code}")
	public int deleteByResponsableCode(@PathVariable String code){
		return formationService.deleteByResponsableCode(code);
	}
	
	@ApiOperation("Finds formation by id of responsable")
	@GetMapping("/responsable/id/{id}")
	public List<FormationVo> findByResponsableId(@PathVariable Long id){
		return formationConverter.toVo(formationService.findByResponsableId(id));
	}
	@ApiOperation("Deletes formation by id of responsable")
	@DeleteMapping("/responsable/id/{id}")
	public int deleteByResponsableId(@PathVariable Long id){
		return formationService.deleteByResponsableId(id);
	}
     	
   
    @ApiOperation("Search formation by a specific criterion")
    @PostMapping("/search")
	public List<FormationVo> findByCriteria(@RequestBody FormationVo formationVo){
       return formationConverter.toVo(formationService.findByCriteria(formationVo));
	}	
	public FormationConverter getFormationConverter(){
		return formationConverter;
	}
 
	public void setFormationConverter(FormationConverter formationConverter){
		this.formationConverter=formationConverter;
	}

	public FormationService getFormationService(){
		return formationService;
	}
	public void setFormationService( FormationService formationService){
	 	this.formationService=formationService;
	}
	

}