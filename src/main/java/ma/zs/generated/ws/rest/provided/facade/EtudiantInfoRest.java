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
import ma.zs.generated.bean.EtudiantInfo; 
import ma.zs.generated.service.facade.EtudiantInfoService;
import ma.zs.generated.ws.rest.provided.converter.EtudiantInfoConverter;
import ma.zs.generated.ws.rest.provided.vo.EtudiantInfoVo;

@Api("Manages etudiantInfo services")
@RestController
@RequestMapping("generated/etudiantInfo")
public class EtudiantInfoRest {

	@Autowired 
	private EtudiantInfoService etudiantInfoService;
	
	@Autowired 
	private EtudiantInfoConverter etudiantInfoConverter ;

    @ApiOperation("Saves the specified etudiantInfo")
	@PostMapping("/")
	public EtudiantInfoVo save(@RequestBody EtudiantInfoVo etudiantInfoVo){
		EtudiantInfo etudiantInfo= etudiantInfoConverter.toItem(etudiantInfoVo);
	  etudiantInfo=	etudiantInfoService.save(etudiantInfo);
		return etudiantInfoConverter.toVo(etudiantInfo);
	}

    @ApiOperation("Delete the specified etudiantInfo")
	@DeleteMapping("/")
	public int delete(@RequestBody EtudiantInfoVo etudiantInfoVo){
		EtudiantInfo etudiantInfo = etudiantInfoConverter.toItem(etudiantInfoVo);
		return etudiantInfoService.delete(etudiantInfo);
	}

	@ApiOperation("Updates the specified etudiantInfo")
	@PutMapping("/")
	public EtudiantInfoVo update(@RequestBody EtudiantInfoVo etudiantInfoVo){
		EtudiantInfo etudiantInfo= etudiantInfoConverter.toItem(etudiantInfoVo);
	  etudiantInfo=	etudiantInfoService.update(etudiantInfo);
		return etudiantInfoConverter.toVo(etudiantInfo);
	}

	@ApiOperation("Finds a list of all etudiantInfos")
	@GetMapping("/")
	public List<EtudiantInfoVo> findAll(){
		return etudiantInfoConverter.toVo(etudiantInfoService.findAll());
	}
    
	@ApiOperation("Finds a etudiantInfo by id")
	@GetMapping("/id/{id}")
	public EtudiantInfoVo findById(@PathVariable Long id){
		return  etudiantInfoConverter.toVo(etudiantInfoService.findById(id));
	}
	@ApiOperation("Deletes a etudiantInfo by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 etudiantInfoService.deleteById(id);
	}

	@ApiOperation("Finds a  etudiantInfo by cne")
    @GetMapping("/cne/{cne}")
	public EtudiantInfoVo findByCne(@PathVariable String cne){
		return  etudiantInfoConverter.toVo(etudiantInfoService.findByCne(cne));
	}
	@ApiOperation("Deletes a  etudiantInfo by cne")
    @DeleteMapping("/cne/{cne}")
	public int deleteByCne(@PathVariable String cne){
		return  etudiantInfoService.deleteByCne(cne);
	}
	


    @ApiOperation("Finds a etudiantInfo by ref of sexe")
	@GetMapping("/sexe/ref/{ref}")
	public List<EtudiantInfoVo> findBySexeRef(@PathVariable String ref){
		return etudiantInfoConverter.toVo(etudiantInfoService.findBySexeRef(ref));
	}
	
	@ApiOperation("Deletes a etudiantInfo by ref of sexe")
	@DeleteMapping("/sexe/ref/{ref}")
	public int deleteBySexeRef(@PathVariable String ref){
		return etudiantInfoService.deleteBySexeRef(ref);
	}
	
	@ApiOperation("Finds etudiantInfo by id of sexe")
	@GetMapping("/sexe/id/{id}")
	public List<EtudiantInfoVo> findBySexeId(@PathVariable Long id){
		return etudiantInfoConverter.toVo(etudiantInfoService.findBySexeId(id));
	}
	@ApiOperation("Deletes etudiantInfo by id of sexe")
	@DeleteMapping("/sexe/id/{id}")
	public int deleteBySexeId(@PathVariable Long id){
		return etudiantInfoService.deleteBySexeId(id);
	}
     	
    @ApiOperation("Finds a etudiantInfo by ref of formationActuelle")
	@GetMapping("/formationActuelle/ref/{ref}")
	public List<EtudiantInfoVo> findByFormationActuelleRef(@PathVariable String ref){
		return etudiantInfoConverter.toVo(etudiantInfoService.findByFormationActuelleRef(ref));
	}
	
	@ApiOperation("Deletes a etudiantInfo by ref of formationActuelle")
	@DeleteMapping("/formationActuelle/ref/{ref}")
	public int deleteByFormationActuelleRef(@PathVariable String ref){
		return etudiantInfoService.deleteByFormationActuelleRef(ref);
	}
	
	@ApiOperation("Finds etudiantInfo by id of formationActuelle")
	@GetMapping("/formationActuelle/id/{id}")
	public List<EtudiantInfoVo> findByFormationActuelleId(@PathVariable Long id){
		return etudiantInfoConverter.toVo(etudiantInfoService.findByFormationActuelleId(id));
	}
	@ApiOperation("Deletes etudiantInfo by id of formationActuelle")
	@DeleteMapping("/formationActuelle/id/{id}")
	public int deleteByFormationActuelleId(@PathVariable Long id){
		return etudiantInfoService.deleteByFormationActuelleId(id);
	}
     	
    @ApiOperation("Finds a etudiantInfo by ref of fonctionActuelle")
	@GetMapping("/fonctionActuelle/ref/{ref}")
	public List<EtudiantInfoVo> findByFonctionActuelleRef(@PathVariable String ref){
		return etudiantInfoConverter.toVo(etudiantInfoService.findByFonctionActuelleRef(ref));
	}
	
	@ApiOperation("Deletes a etudiantInfo by ref of fonctionActuelle")
	@DeleteMapping("/fonctionActuelle/ref/{ref}")
	public int deleteByFonctionActuelleRef(@PathVariable String ref){
		return etudiantInfoService.deleteByFonctionActuelleRef(ref);
	}
	
	@ApiOperation("Finds etudiantInfo by id of fonctionActuelle")
	@GetMapping("/fonctionActuelle/id/{id}")
	public List<EtudiantInfoVo> findByFonctionActuelleId(@PathVariable Long id){
		return etudiantInfoConverter.toVo(etudiantInfoService.findByFonctionActuelleId(id));
	}
	@ApiOperation("Deletes etudiantInfo by id of fonctionActuelle")
	@DeleteMapping("/fonctionActuelle/id/{id}")
	public int deleteByFonctionActuelleId(@PathVariable Long id){
		return etudiantInfoService.deleteByFonctionActuelleId(id);
	}
     	
    @ApiOperation("Finds a etudiantInfo by email of compte")
	@GetMapping("/compte/email/{email}")
	public List<EtudiantInfoVo> findByCompteEmail(@PathVariable String email){
		return etudiantInfoConverter.toVo(etudiantInfoService.findByCompteEmail(email));
	}
	
	@ApiOperation("Deletes a etudiantInfo by email of compte")
	@DeleteMapping("/compte/email/{email}")
	public int deleteByCompteEmail(@PathVariable String email){
		return etudiantInfoService.deleteByCompteEmail(email);
	}
	
	@ApiOperation("Finds etudiantInfo by id of compte")
	@GetMapping("/compte/id/{id}")
	public List<EtudiantInfoVo> findByCompteId(@PathVariable Long id){
		return etudiantInfoConverter.toVo(etudiantInfoService.findByCompteId(id));
	}
	@ApiOperation("Deletes etudiantInfo by id of compte")
	@DeleteMapping("/compte/id/{id}")
	public int deleteByCompteId(@PathVariable Long id){
		return etudiantInfoService.deleteByCompteId(id);
	}
     	
   
    @ApiOperation("Search etudiantInfo by a specific criterion")
    @PostMapping("/search")
	public List<EtudiantInfoVo> findByCriteria(@RequestBody EtudiantInfoVo etudiantInfoVo){
       return etudiantInfoConverter.toVo(etudiantInfoService.findByCriteria(etudiantInfoVo));
	}	
	public EtudiantInfoConverter getEtudiantInfoConverter(){
		return etudiantInfoConverter;
	}
 
	public void setEtudiantInfoConverter(EtudiantInfoConverter etudiantInfoConverter){
		this.etudiantInfoConverter=etudiantInfoConverter;
	}

	public EtudiantInfoService getEtudiantInfoService(){
		return etudiantInfoService;
	}
	public void setEtudiantInfoService( EtudiantInfoService etudiantInfoService){
	 	this.etudiantInfoService=etudiantInfoService;
	}
	

}