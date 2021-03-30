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
import ma.zs.generated.bean.CatDemande; 
import ma.zs.generated.service.facade.CatDemandeService;
import ma.zs.generated.ws.rest.provided.converter.CatDemandeConverter;
import ma.zs.generated.ws.rest.provided.vo.CatDemandeVo;

@Api("Manages catDemande services")
@RestController
@RequestMapping("generated/catDemande")
public class CatDemandeRest {

	@Autowired 
	private CatDemandeService catDemandeService;
	
	@Autowired 
	private CatDemandeConverter catDemandeConverter ;

    @ApiOperation("Saves the specified catDemande")
	@PostMapping("/")
	public CatDemandeVo save(@RequestBody CatDemandeVo catDemandeVo){
		CatDemande catDemande= catDemandeConverter.toItem(catDemandeVo);
	  catDemande=	catDemandeService.save(catDemande);
		return catDemandeConverter.toVo(catDemande);
	}

    @ApiOperation("Delete the specified catDemande")
	@DeleteMapping("/")
	public int delete(@RequestBody CatDemandeVo catDemandeVo){
		CatDemande catDemande = catDemandeConverter.toItem(catDemandeVo);
		return catDemandeService.delete(catDemande);
	}

	@ApiOperation("Updates the specified catDemande")
	@PutMapping("/")
	public CatDemandeVo update(@RequestBody CatDemandeVo catDemandeVo){
		CatDemande catDemande= catDemandeConverter.toItem(catDemandeVo);
	  catDemande=	catDemandeService.update(catDemande);
		return catDemandeConverter.toVo(catDemande);
	}

	@ApiOperation("Finds a list of all catDemandes")
	@GetMapping("/")
	public List<CatDemandeVo> findAll(){
		return catDemandeConverter.toVo(catDemandeService.findAll());
	}
    
	@ApiOperation("Finds a catDemande by id")
	@GetMapping("/id/{id}")
	public CatDemandeVo findById(@PathVariable Long id){
		return  catDemandeConverter.toVo(catDemandeService.findById(id));
	}
	@ApiOperation("Deletes a catDemande by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 catDemandeService.deleteById(id);
	}

	@ApiOperation("Finds a  catDemande by ref")
    @GetMapping("/ref/{ref}")
	public CatDemandeVo findByRef(@PathVariable String ref){
		return  catDemandeConverter.toVo(catDemandeService.findByRef(ref));
	}
	@ApiOperation("Deletes a  catDemande by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  catDemandeService.deleteByRef(ref);
	}
	


   
    @ApiOperation("Search catDemande by a specific criterion")
    @PostMapping("/search")
	public List<CatDemandeVo> findByCriteria(@RequestBody CatDemandeVo catDemandeVo){
       return catDemandeConverter.toVo(catDemandeService.findByCriteria(catDemandeVo));
	}	
	public CatDemandeConverter getCatDemandeConverter(){
		return catDemandeConverter;
	}
 
	public void setCatDemandeConverter(CatDemandeConverter catDemandeConverter){
		this.catDemandeConverter=catDemandeConverter;
	}

	public CatDemandeService getCatDemandeService(){
		return catDemandeService;
	}
	public void setCatDemandeService( CatDemandeService catDemandeService){
	 	this.catDemandeService=catDemandeService;
	}
	

}