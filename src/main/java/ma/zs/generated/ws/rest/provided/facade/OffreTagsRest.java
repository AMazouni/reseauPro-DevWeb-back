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
import ma.zs.generated.bean.OffreTags; 
import ma.zs.generated.service.facade.OffreTagsService;
import ma.zs.generated.ws.rest.provided.converter.OffreTagsConverter;
import ma.zs.generated.ws.rest.provided.vo.OffreTagsVo;

@Api("Manages offreTags services")
@RestController
@RequestMapping("generated/offreTags")
public class OffreTagsRest {

	@Autowired 
	private OffreTagsService offreTagsService;
	
	@Autowired 
	private OffreTagsConverter offreTagsConverter ;

    @ApiOperation("Saves the specified offreTags")
	@PostMapping("/")
	public OffreTagsVo save(@RequestBody OffreTagsVo offreTagsVo){
		OffreTags offreTags= offreTagsConverter.toItem(offreTagsVo);
	  offreTags=	offreTagsService.save(offreTags);
		return offreTagsConverter.toVo(offreTags);
	}

    @ApiOperation("Delete the specified offreTags")
	@DeleteMapping("/")
	public int delete(@RequestBody OffreTagsVo offreTagsVo){
		OffreTags offreTags = offreTagsConverter.toItem(offreTagsVo);
		return offreTagsService.delete(offreTags);
	}

	@ApiOperation("Updates the specified offreTags")
	@PutMapping("/")
	public OffreTagsVo update(@RequestBody OffreTagsVo offreTagsVo){
		OffreTags offreTags= offreTagsConverter.toItem(offreTagsVo);
	  offreTags=	offreTagsService.update(offreTags);
		return offreTagsConverter.toVo(offreTags);
	}

	@ApiOperation("Finds a list of all offreTagss")
	@GetMapping("/")
	public List<OffreTagsVo> findAll(){
		return offreTagsConverter.toVo(offreTagsService.findAll());
	}
    
	@ApiOperation("Finds a offreTags by id")
	@GetMapping("/id/{id}")
	public OffreTagsVo findById(@PathVariable Long id){
		return  offreTagsConverter.toVo(offreTagsService.findById(id));
	}
	@ApiOperation("Deletes a offreTags by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 offreTagsService.deleteById(id);
	}

	@ApiOperation("Finds a  offreTags by ref")
    @GetMapping("/ref/{ref}")
	public OffreTagsVo findByRef(@PathVariable String ref){
		return  offreTagsConverter.toVo(offreTagsService.findByRef(ref));
	}
	@ApiOperation("Deletes a  offreTags by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  offreTagsService.deleteByRef(ref);
	}
	


   
    @ApiOperation("Search offreTags by a specific criterion")
    @PostMapping("/search")
	public List<OffreTagsVo> findByCriteria(@RequestBody OffreTagsVo offreTagsVo){
       return offreTagsConverter.toVo(offreTagsService.findByCriteria(offreTagsVo));
	}	
	public OffreTagsConverter getOffreTagsConverter(){
		return offreTagsConverter;
	}
 
	public void setOffreTagsConverter(OffreTagsConverter offreTagsConverter){
		this.offreTagsConverter=offreTagsConverter;
	}

	public OffreTagsService getOffreTagsService(){
		return offreTagsService;
	}
	public void setOffreTagsService( OffreTagsService offreTagsService){
	 	this.offreTagsService=offreTagsService;
	}
	

}