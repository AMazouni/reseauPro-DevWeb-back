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
import ma.zs.generated.bean.Offre; 
import ma.zs.generated.service.facade.OffreService;
import ma.zs.generated.ws.rest.provided.converter.OffreConverter;
import ma.zs.generated.ws.rest.provided.vo.OffreVo;

@Api("Manages offre services")
@RestController
@RequestMapping("generated/offre")
public class OffreRest {

	@Autowired 
	private OffreService offreService;
	
	@Autowired 
	private OffreConverter offreConverter ;

    @ApiOperation("Saves the specified offre")
	@PostMapping("/")
	public OffreVo save(@RequestBody OffreVo offreVo){
		Offre offre= offreConverter.toItem(offreVo);
	  offre=	offreService.save(offre);
		return offreConverter.toVo(offre);
	}

    @ApiOperation("Delete the specified offre")
	@DeleteMapping("/")
	public int delete(@RequestBody OffreVo offreVo){
		Offre offre = offreConverter.toItem(offreVo);
		return offreService.delete(offre);
	}

	@ApiOperation("Updates the specified offre")
	@PutMapping("/")
	public OffreVo update(@RequestBody OffreVo offreVo){
		Offre offre= offreConverter.toItem(offreVo);
	  offre=	offreService.update(offre);
		return offreConverter.toVo(offre);
	}

	@ApiOperation("Finds a list of all offres")
	@GetMapping("/")
	public List<OffreVo> findAll(){
		return offreConverter.toVo(offreService.findAll());
	}
    
	@ApiOperation("Finds a offre by id")
	@GetMapping("/id/{id}")
	public OffreVo findById(@PathVariable Long id){
		return  offreConverter.toVo(offreService.findById(id));
	}
	@ApiOperation("Deletes a offre by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 offreService.deleteById(id);
	}

	@ApiOperation("Finds a  offre by ref")
    @GetMapping("/ref/{ref}")
	public OffreVo findByRef(@PathVariable String ref){
		return  offreConverter.toVo(offreService.findByRef(ref));
	}
	@ApiOperation("Deletes a  offre by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  offreService.deleteByRef(ref);
	}
	


    @ApiOperation("Finds a offre by ref of tags")
	@GetMapping("/tags/ref/{ref}")
	public List<OffreVo> findByTagsRef(@PathVariable String ref){
		return offreConverter.toVo(offreService.findByTagsRef(ref));
	}
	
	@ApiOperation("Deletes a offre by ref of tags")
	@DeleteMapping("/tags/ref/{ref}")
	public int deleteByTagsRef(@PathVariable String ref){
		return offreService.deleteByTagsRef(ref);
	}
	
	@ApiOperation("Finds offre by id of tags")
	@GetMapping("/tags/id/{id}")
	public List<OffreVo> findByTagsId(@PathVariable Long id){
		return offreConverter.toVo(offreService.findByTagsId(id));
	}
	@ApiOperation("Deletes offre by id of tags")
	@DeleteMapping("/tags/id/{id}")
	public int deleteByTagsId(@PathVariable Long id){
		return offreService.deleteByTagsId(id);
	}
     	
    @ApiOperation("Finds a offre by ref of fonction")
	@GetMapping("/fonction/ref/{ref}")
	public List<OffreVo> findByFonctionRef(@PathVariable String ref){
		return offreConverter.toVo(offreService.findByFonctionRef(ref));
	}
	
	@ApiOperation("Deletes a offre by ref of fonction")
	@DeleteMapping("/fonction/ref/{ref}")
	public int deleteByFonctionRef(@PathVariable String ref){
		return offreService.deleteByFonctionRef(ref);
	}
	
	@ApiOperation("Finds offre by id of fonction")
	@GetMapping("/fonction/id/{id}")
	public List<OffreVo> findByFonctionId(@PathVariable Long id){
		return offreConverter.toVo(offreService.findByFonctionId(id));
	}
	@ApiOperation("Deletes offre by id of fonction")
	@DeleteMapping("/fonction/id/{id}")
	public int deleteByFonctionId(@PathVariable Long id){
		return offreService.deleteByFonctionId(id);
	}
     	
   
    @ApiOperation("Search offre by a specific criterion")
    @PostMapping("/search")
	public List<OffreVo> findByCriteria(@RequestBody OffreVo offreVo){
       return offreConverter.toVo(offreService.findByCriteria(offreVo));
	}	
	public OffreConverter getOffreConverter(){
		return offreConverter;
	}
 
	public void setOffreConverter(OffreConverter offreConverter){
		this.offreConverter=offreConverter;
	}

	public OffreService getOffreService(){
		return offreService;
	}
	public void setOffreService( OffreService offreService){
	 	this.offreService=offreService;
	}
	

}