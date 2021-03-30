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
import ma.zs.generated.bean.Demande; 
import ma.zs.generated.service.facade.DemandeService;
import ma.zs.generated.ws.rest.provided.converter.DemandeConverter;
import ma.zs.generated.ws.rest.provided.vo.DemandeVo;

@Api("Manages demande services")
@RestController
@RequestMapping("generated/demande")
public class DemandeRest {

	@Autowired 
	private DemandeService demandeService;
	
	@Autowired 
	private DemandeConverter demandeConverter ;

    @ApiOperation("Saves the specified demande")
	@PostMapping("/")
	public DemandeVo save(@RequestBody DemandeVo demandeVo){
		Demande demande= demandeConverter.toItem(demandeVo);
	  demande=	demandeService.save(demande);
		return demandeConverter.toVo(demande);
	}

    @ApiOperation("Delete the specified demande")
	@DeleteMapping("/")
	public int delete(@RequestBody DemandeVo demandeVo){
		Demande demande = demandeConverter.toItem(demandeVo);
		return demandeService.delete(demande);
	}

	@ApiOperation("Updates the specified demande")
	@PutMapping("/")
	public DemandeVo update(@RequestBody DemandeVo demandeVo){
		Demande demande= demandeConverter.toItem(demandeVo);
	  demande=	demandeService.update(demande);
		return demandeConverter.toVo(demande);
	}

	@ApiOperation("Finds a list of all demandes")
	@GetMapping("/")
	public List<DemandeVo> findAll(){
		return demandeConverter.toVo(demandeService.findAll());
	}
    
	@ApiOperation("Finds a demande by id")
	@GetMapping("/id/{id}")
	public DemandeVo findById(@PathVariable Long id){
		return  demandeConverter.toVo(demandeService.findById(id));
	}
	@ApiOperation("Deletes a demande by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 demandeService.deleteById(id);
	}

	@ApiOperation("Finds a  demande by ref")
    @GetMapping("/ref/{ref}")
	public DemandeVo findByRef(@PathVariable String ref){
		return  demandeConverter.toVo(demandeService.findByRef(ref));
	}
	@ApiOperation("Deletes a  demande by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  demandeService.deleteByRef(ref);
	}
	


    @ApiOperation("Finds a demande by ref of categorieDemande")
	@GetMapping("/categorieDemande/ref/{ref}")
	public List<DemandeVo> findByCategorieDemandeRef(@PathVariable String ref){
		return demandeConverter.toVo(demandeService.findByCategorieDemandeRef(ref));
	}
	
	@ApiOperation("Deletes a demande by ref of categorieDemande")
	@DeleteMapping("/categorieDemande/ref/{ref}")
	public int deleteByCategorieDemandeRef(@PathVariable String ref){
		return demandeService.deleteByCategorieDemandeRef(ref);
	}
	
	@ApiOperation("Finds demande by id of categorieDemande")
	@GetMapping("/categorieDemande/id/{id}")
	public List<DemandeVo> findByCategorieDemandeId(@PathVariable Long id){
		return demandeConverter.toVo(demandeService.findByCategorieDemandeId(id));
	}
	@ApiOperation("Deletes demande by id of categorieDemande")
	@DeleteMapping("/categorieDemande/id/{id}")
	public int deleteByCategorieDemandeId(@PathVariable Long id){
		return demandeService.deleteByCategorieDemandeId(id);
	}
     	
    @ApiOperation("Finds a demande by cne of demandePar")
	@GetMapping("/demandePar/cne/{cne}")
	public List<DemandeVo> findByDemandeParCne(@PathVariable String cne){
		return demandeConverter.toVo(demandeService.findByDemandeParCne(cne));
	}
	
	@ApiOperation("Deletes a demande by cne of demandePar")
	@DeleteMapping("/demandePar/cne/{cne}")
	public int deleteByDemandeParCne(@PathVariable String cne){
		return demandeService.deleteByDemandeParCne(cne);
	}
	
	@ApiOperation("Finds demande by id of demandePar")
	@GetMapping("/demandePar/id/{id}")
	public List<DemandeVo> findByDemandeParId(@PathVariable Long id){
		return demandeConverter.toVo(demandeService.findByDemandeParId(id));
	}
	@ApiOperation("Deletes demande by id of demandePar")
	@DeleteMapping("/demandePar/id/{id}")
	public int deleteByDemandeParId(@PathVariable Long id){
		return demandeService.deleteByDemandeParId(id);
	}
     	
    @ApiOperation("Finds a demande by code of status")
	@GetMapping("/status/code/{code}")
	public List<DemandeVo> findByStatusCode(@PathVariable String code){
		return demandeConverter.toVo(demandeService.findByStatusCode(code));
	}
	
	@ApiOperation("Deletes a demande by code of status")
	@DeleteMapping("/status/code/{code}")
	public int deleteByStatusCode(@PathVariable String code){
		return demandeService.deleteByStatusCode(code);
	}
	
	@ApiOperation("Finds demande by id of status")
	@GetMapping("/status/id/{id}")
	public List<DemandeVo> findByStatusId(@PathVariable Long id){
		return demandeConverter.toVo(demandeService.findByStatusId(id));
	}
	@ApiOperation("Deletes demande by id of status")
	@DeleteMapping("/status/id/{id}")
	public int deleteByStatusId(@PathVariable Long id){
		return demandeService.deleteByStatusId(id);
	}
     	
    @ApiOperation("Finds a demande by cne of demandeA")
	@GetMapping("/demandeA/cne/{cne}")
	public List<DemandeVo> findByDemandeACne(@PathVariable String cne){
		return demandeConverter.toVo(demandeService.findByDemandeACne(cne));
	}
	
	@ApiOperation("Deletes a demande by cne of demandeA")
	@DeleteMapping("/demandeA/cne/{cne}")
	public int deleteByDemandeACne(@PathVariable String cne){
		return demandeService.deleteByDemandeACne(cne);
	}
	
	@ApiOperation("Finds demande by id of demandeA")
	@GetMapping("/demandeA/id/{id}")
	public List<DemandeVo> findByDemandeAId(@PathVariable Long id){
		return demandeConverter.toVo(demandeService.findByDemandeAId(id));
	}
	@ApiOperation("Deletes demande by id of demandeA")
	@DeleteMapping("/demandeA/id/{id}")
	public int deleteByDemandeAId(@PathVariable Long id){
		return demandeService.deleteByDemandeAId(id);
	}
     	
   
    @ApiOperation("Search demande by a specific criterion")
    @PostMapping("/search")
	public List<DemandeVo> findByCriteria(@RequestBody DemandeVo demandeVo){
       return demandeConverter.toVo(demandeService.findByCriteria(demandeVo));
	}	
	public DemandeConverter getDemandeConverter(){
		return demandeConverter;
	}
 
	public void setDemandeConverter(DemandeConverter demandeConverter){
		this.demandeConverter=demandeConverter;
	}

	public DemandeService getDemandeService(){
		return demandeService;
	}
	public void setDemandeService( DemandeService demandeService){
	 	this.demandeService=demandeService;
	}
	

}