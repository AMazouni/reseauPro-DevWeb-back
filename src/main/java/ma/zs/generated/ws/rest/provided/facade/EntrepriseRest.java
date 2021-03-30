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
import ma.zs.generated.bean.Entreprise; 
import ma.zs.generated.service.facade.EntrepriseService;
import ma.zs.generated.ws.rest.provided.converter.EntrepriseConverter;
import ma.zs.generated.ws.rest.provided.vo.EntrepriseVo;

@Api("Manages entreprise services")
@RestController
@RequestMapping("generated/entreprise")
public class EntrepriseRest {

	@Autowired 
	private EntrepriseService entrepriseService;
	
	@Autowired 
	private EntrepriseConverter entrepriseConverter ;

    @ApiOperation("Saves the specified entreprise")
	@PostMapping("/")
	public EntrepriseVo save(@RequestBody EntrepriseVo entrepriseVo){
		Entreprise entreprise= entrepriseConverter.toItem(entrepriseVo);
	  entreprise=	entrepriseService.save(entreprise);
		return entrepriseConverter.toVo(entreprise);
	}

    @ApiOperation("Delete the specified entreprise")
	@DeleteMapping("/")
	public int delete(@RequestBody EntrepriseVo entrepriseVo){
		Entreprise entreprise = entrepriseConverter.toItem(entrepriseVo);
		return entrepriseService.delete(entreprise);
	}

	@ApiOperation("Updates the specified entreprise")
	@PutMapping("/")
	public EntrepriseVo update(@RequestBody EntrepriseVo entrepriseVo){
		Entreprise entreprise= entrepriseConverter.toItem(entrepriseVo);
	  entreprise=	entrepriseService.update(entreprise);
		return entrepriseConverter.toVo(entreprise);
	}

	@ApiOperation("Finds a list of all entreprises")
	@GetMapping("/")
	public List<EntrepriseVo> findAll(){
		return entrepriseConverter.toVo(entrepriseService.findAll());
	}
    
	@ApiOperation("Finds a entreprise by id")
	@GetMapping("/id/{id}")
	public EntrepriseVo findById(@PathVariable Long id){
		return  entrepriseConverter.toVo(entrepriseService.findById(id));
	}
	@ApiOperation("Deletes a entreprise by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 entrepriseService.deleteById(id);
	}

	@ApiOperation("Finds a  entreprise by ref")
    @GetMapping("/ref/{ref}")
	public EntrepriseVo findByRef(@PathVariable String ref){
		return  entrepriseConverter.toVo(entrepriseService.findByRef(ref));
	}
	@ApiOperation("Deletes a  entreprise by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  entrepriseService.deleteByRef(ref);
	}
	


   
    @ApiOperation("Search entreprise by a specific criterion")
    @PostMapping("/search")
	public List<EntrepriseVo> findByCriteria(@RequestBody EntrepriseVo entrepriseVo){
       return entrepriseConverter.toVo(entrepriseService.findByCriteria(entrepriseVo));
	}	
	public EntrepriseConverter getEntrepriseConverter(){
		return entrepriseConverter;
	}
 
	public void setEntrepriseConverter(EntrepriseConverter entrepriseConverter){
		this.entrepriseConverter=entrepriseConverter;
	}

	public EntrepriseService getEntrepriseService(){
		return entrepriseService;
	}
	public void setEntrepriseService( EntrepriseService entrepriseService){
	 	this.entrepriseService=entrepriseService;
	}
	

}