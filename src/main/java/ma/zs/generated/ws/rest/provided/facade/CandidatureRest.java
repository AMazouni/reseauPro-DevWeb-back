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
import ma.zs.generated.bean.Candidature; 
import ma.zs.generated.service.facade.CandidatureService;
import ma.zs.generated.ws.rest.provided.converter.CandidatureConverter;
import ma.zs.generated.ws.rest.provided.vo.CandidatureVo;

@Api("Manages candidature services")
@RestController
@RequestMapping("generated/candidature")
public class CandidatureRest {

	@Autowired 
	private CandidatureService candidatureService;
	
	@Autowired 
	private CandidatureConverter candidatureConverter ;

    @ApiOperation("Saves the specified candidature")
	@PostMapping("/")
	public CandidatureVo save(@RequestBody CandidatureVo candidatureVo){
		Candidature candidature= candidatureConverter.toItem(candidatureVo);
	  candidature=	candidatureService.save(candidature);
		return candidatureConverter.toVo(candidature);
	}

    @ApiOperation("Delete the specified candidature")
	@DeleteMapping("/")
	public int delete(@RequestBody CandidatureVo candidatureVo){
		Candidature candidature = candidatureConverter.toItem(candidatureVo);
		return candidatureService.delete(candidature);
	}

	@ApiOperation("Updates the specified candidature")
	@PutMapping("/")
	public CandidatureVo update(@RequestBody CandidatureVo candidatureVo){
		Candidature candidature= candidatureConverter.toItem(candidatureVo);
	  candidature=	candidatureService.update(candidature);
		return candidatureConverter.toVo(candidature);
	}

	@ApiOperation("Finds a list of all candidatures")
	@GetMapping("/")
	public List<CandidatureVo> findAll(){
		return candidatureConverter.toVo(candidatureService.findAll());
	}
    
	@ApiOperation("Finds a candidature by id")
	@GetMapping("/id/{id}")
	public CandidatureVo findById(@PathVariable Long id){
		return  candidatureConverter.toVo(candidatureService.findById(id));
	}
	@ApiOperation("Deletes a candidature by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 candidatureService.deleteById(id);
	}

	@ApiOperation("Finds a  candidature by ref")
    @GetMapping("/ref/{ref}")
	public CandidatureVo findByRef(@PathVariable String ref){
		return  candidatureConverter.toVo(candidatureService.findByRef(ref));
	}
	@ApiOperation("Deletes a  candidature by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  candidatureService.deleteByRef(ref);
	}
	


    @ApiOperation("Finds a candidature by cne of candidat")
	@GetMapping("/candidat/cne/{cne}")
	public List<CandidatureVo> findByCandidatCne(@PathVariable String cne){
		return candidatureConverter.toVo(candidatureService.findByCandidatCne(cne));
	}
	
	@ApiOperation("Deletes a candidature by cne of candidat")
	@DeleteMapping("/candidat/cne/{cne}")
	public int deleteByCandidatCne(@PathVariable String cne){
		return candidatureService.deleteByCandidatCne(cne);
	}
	
	@ApiOperation("Finds candidature by id of candidat")
	@GetMapping("/candidat/id/{id}")
	public List<CandidatureVo> findByCandidatId(@PathVariable Long id){
		return candidatureConverter.toVo(candidatureService.findByCandidatId(id));
	}
	@ApiOperation("Deletes candidature by id of candidat")
	@DeleteMapping("/candidat/id/{id}")
	public int deleteByCandidatId(@PathVariable Long id){
		return candidatureService.deleteByCandidatId(id);
	}
     	
    @ApiOperation("Finds a candidature by code of status")
	@GetMapping("/status/code/{code}")
	public List<CandidatureVo> findByStatusCode(@PathVariable String code){
		return candidatureConverter.toVo(candidatureService.findByStatusCode(code));
	}
	
	@ApiOperation("Deletes a candidature by code of status")
	@DeleteMapping("/status/code/{code}")
	public int deleteByStatusCode(@PathVariable String code){
		return candidatureService.deleteByStatusCode(code);
	}
	
	@ApiOperation("Finds candidature by id of status")
	@GetMapping("/status/id/{id}")
	public List<CandidatureVo> findByStatusId(@PathVariable Long id){
		return candidatureConverter.toVo(candidatureService.findByStatusId(id));
	}
	@ApiOperation("Deletes candidature by id of status")
	@DeleteMapping("/status/id/{id}")
	public int deleteByStatusId(@PathVariable Long id){
		return candidatureService.deleteByStatusId(id);
	}
     	
    @ApiOperation("Finds a candidature by ref of offreConcerne")
	@GetMapping("/offreConcerne/ref/{ref}")
	public List<CandidatureVo> findByOffreConcerneRef(@PathVariable String ref){
		return candidatureConverter.toVo(candidatureService.findByOffreConcerneRef(ref));
	}
	
	@ApiOperation("Deletes a candidature by ref of offreConcerne")
	@DeleteMapping("/offreConcerne/ref/{ref}")
	public int deleteByOffreConcerneRef(@PathVariable String ref){
		return candidatureService.deleteByOffreConcerneRef(ref);
	}
	
	@ApiOperation("Finds candidature by id of offreConcerne")
	@GetMapping("/offreConcerne/id/{id}")
	public List<CandidatureVo> findByOffreConcerneId(@PathVariable Long id){
		return candidatureConverter.toVo(candidatureService.findByOffreConcerneId(id));
	}
	@ApiOperation("Deletes candidature by id of offreConcerne")
	@DeleteMapping("/offreConcerne/id/{id}")
	public int deleteByOffreConcerneId(@PathVariable Long id){
		return candidatureService.deleteByOffreConcerneId(id);
	}
     	
   
    @ApiOperation("Search candidature by a specific criterion")
    @PostMapping("/search")
	public List<CandidatureVo> findByCriteria(@RequestBody CandidatureVo candidatureVo){
       return candidatureConverter.toVo(candidatureService.findByCriteria(candidatureVo));
	}	
	public CandidatureConverter getCandidatureConverter(){
		return candidatureConverter;
	}
 
	public void setCandidatureConverter(CandidatureConverter candidatureConverter){
		this.candidatureConverter=candidatureConverter;
	}

	public CandidatureService getCandidatureService(){
		return candidatureService;
	}
	public void setCandidatureService( CandidatureService candidatureService){
	 	this.candidatureService=candidatureService;
	}
	

}