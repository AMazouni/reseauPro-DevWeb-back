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
import ma.zs.generated.bean.Fonction; 
import ma.zs.generated.service.facade.FonctionService;
import ma.zs.generated.ws.rest.provided.converter.FonctionConverter;
import ma.zs.generated.ws.rest.provided.vo.FonctionVo;

@Api("Manages fonction services")
@RestController
@RequestMapping("generated/fonction")
public class FonctionRest {

	@Autowired 
	private FonctionService fonctionService;
	
	@Autowired 
	private FonctionConverter fonctionConverter ;

    @ApiOperation("Saves the specified fonction")
	@PostMapping("/")
	public FonctionVo save(@RequestBody FonctionVo fonctionVo){
		Fonction fonction= fonctionConverter.toItem(fonctionVo);
	  fonction=	fonctionService.save(fonction);
		return fonctionConverter.toVo(fonction);
	}

    @ApiOperation("Delete the specified fonction")
	@DeleteMapping("/")
	public int delete(@RequestBody FonctionVo fonctionVo){
		Fonction fonction = fonctionConverter.toItem(fonctionVo);
		return fonctionService.delete(fonction);
	}

	@ApiOperation("Updates the specified fonction")
	@PutMapping("/")
	public FonctionVo update(@RequestBody FonctionVo fonctionVo){
		Fonction fonction= fonctionConverter.toItem(fonctionVo);
	  fonction=	fonctionService.update(fonction);
		return fonctionConverter.toVo(fonction);
	}

	@ApiOperation("Finds a list of all fonctions")
	@GetMapping("/")
	public List<FonctionVo> findAll(){
		return fonctionConverter.toVo(fonctionService.findAll());
	}
    
	@ApiOperation("Finds a fonction by id")
	@GetMapping("/id/{id}")
	public FonctionVo findById(@PathVariable Long id){
		return  fonctionConverter.toVo(fonctionService.findById(id));
	}
	@ApiOperation("Deletes a fonction by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 fonctionService.deleteById(id);
	}

	@ApiOperation("Finds a  fonction by ref")
    @GetMapping("/ref/{ref}")
	public FonctionVo findByRef(@PathVariable String ref){
		return  fonctionConverter.toVo(fonctionService.findByRef(ref));
	}
	@ApiOperation("Deletes a  fonction by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  fonctionService.deleteByRef(ref);
	}
	


    @ApiOperation("Finds a fonction by ref of entreprise")
	@GetMapping("/entreprise/ref/{ref}")
	public List<FonctionVo> findByEntrepriseRef(@PathVariable String ref){
		return fonctionConverter.toVo(fonctionService.findByEntrepriseRef(ref));
	}
	
	@ApiOperation("Deletes a fonction by ref of entreprise")
	@DeleteMapping("/entreprise/ref/{ref}")
	public int deleteByEntrepriseRef(@PathVariable String ref){
		return fonctionService.deleteByEntrepriseRef(ref);
	}
	
	@ApiOperation("Finds fonction by id of entreprise")
	@GetMapping("/entreprise/id/{id}")
	public List<FonctionVo> findByEntrepriseId(@PathVariable Long id){
		return fonctionConverter.toVo(fonctionService.findByEntrepriseId(id));
	}
	@ApiOperation("Deletes fonction by id of entreprise")
	@DeleteMapping("/entreprise/id/{id}")
	public int deleteByEntrepriseId(@PathVariable Long id){
		return fonctionService.deleteByEntrepriseId(id);
	}
     	
    @ApiOperation("Finds a fonction by cne of occupePar")
	@GetMapping("/occupePar/cne/{cne}")
	public List<FonctionVo> findByOccupeParCne(@PathVariable String cne){
		return fonctionConverter.toVo(fonctionService.findByOccupeParCne(cne));
	}
	
	@ApiOperation("Deletes a fonction by cne of occupePar")
	@DeleteMapping("/occupePar/cne/{cne}")
	public int deleteByOccupeParCne(@PathVariable String cne){
		return fonctionService.deleteByOccupeParCne(cne);
	}
	
	@ApiOperation("Finds fonction by id of occupePar")
	@GetMapping("/occupePar/id/{id}")
	public List<FonctionVo> findByOccupeParId(@PathVariable Long id){
		return fonctionConverter.toVo(fonctionService.findByOccupeParId(id));
	}
	@ApiOperation("Deletes fonction by id of occupePar")
	@DeleteMapping("/occupePar/id/{id}")
	public int deleteByOccupeParId(@PathVariable Long id){
		return fonctionService.deleteByOccupeParId(id);
	}
     	
   
    @ApiOperation("Search fonction by a specific criterion")
    @PostMapping("/search")
	public List<FonctionVo> findByCriteria(@RequestBody FonctionVo fonctionVo){
       return fonctionConverter.toVo(fonctionService.findByCriteria(fonctionVo));
	}	
	public FonctionConverter getFonctionConverter(){
		return fonctionConverter;
	}
 
	public void setFonctionConverter(FonctionConverter fonctionConverter){
		this.fonctionConverter=fonctionConverter;
	}

	public FonctionService getFonctionService(){
		return fonctionService;
	}
	public void setFonctionService( FonctionService fonctionService){
	 	this.fonctionService=fonctionService;
	}
	

}