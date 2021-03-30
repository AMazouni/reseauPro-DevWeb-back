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
import ma.zs.generated.bean.Publication; 
import ma.zs.generated.service.facade.PublicationService;
import ma.zs.generated.ws.rest.provided.converter.PublicationConverter;
import ma.zs.generated.ws.rest.provided.vo.PublicationVo;

@Api("Manages publication services")
@RestController
@RequestMapping("generated/publication")
public class PublicationRest {

	@Autowired 
	private PublicationService publicationService;
	
	@Autowired 
	private PublicationConverter publicationConverter ;

    @ApiOperation("Saves the specified publication")
	@PostMapping("/")
	public PublicationVo save(@RequestBody PublicationVo publicationVo){
		Publication publication= publicationConverter.toItem(publicationVo);
	  publication=	publicationService.save(publication);
		return publicationConverter.toVo(publication);
	}

    @ApiOperation("Delete the specified publication")
	@DeleteMapping("/")
	public int delete(@RequestBody PublicationVo publicationVo){
		Publication publication = publicationConverter.toItem(publicationVo);
		return publicationService.delete(publication);
	}

	@ApiOperation("Updates the specified publication")
	@PutMapping("/")
	public PublicationVo update(@RequestBody PublicationVo publicationVo){
		Publication publication= publicationConverter.toItem(publicationVo);
	  publication=	publicationService.update(publication);
		return publicationConverter.toVo(publication);
	}

	@ApiOperation("Finds a list of all publications")
	@GetMapping("/")
	public List<PublicationVo> findAll(){
		return publicationConverter.toVo(publicationService.findAll());
	}
    
	@ApiOperation("Finds a publication by id")
	@GetMapping("/id/{id}")
	public PublicationVo findById(@PathVariable Long id){
		return  publicationConverter.toVo(publicationService.findById(id));
	}
	@ApiOperation("Deletes a publication by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 publicationService.deleteById(id);
	}

	@ApiOperation("Finds a  publication by ref")
    @GetMapping("/ref/{ref}")
	public PublicationVo findByRef(@PathVariable String ref){
		return  publicationConverter.toVo(publicationService.findByRef(ref));
	}
	@ApiOperation("Deletes a  publication by ref")
    @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref){
		return  publicationService.deleteByRef(ref);
	}
	


    @ApiOperation("Finds a publication by email of postePar")
	@GetMapping("/postePar/email/{email}")
	public List<PublicationVo> findByPosteParEmail(@PathVariable String email){
		return publicationConverter.toVo(publicationService.findByPosteParEmail(email));
	}
	
	@ApiOperation("Deletes a publication by email of postePar")
	@DeleteMapping("/postePar/email/{email}")
	public int deleteByPosteParEmail(@PathVariable String email){
		return publicationService.deleteByPosteParEmail(email);
	}
	
	@ApiOperation("Finds publication by id of postePar")
	@GetMapping("/postePar/id/{id}")
	public List<PublicationVo> findByPosteParId(@PathVariable Long id){
		return publicationConverter.toVo(publicationService.findByPosteParId(id));
	}
	@ApiOperation("Deletes publication by id of postePar")
	@DeleteMapping("/postePar/id/{id}")
	public int deleteByPosteParId(@PathVariable Long id){
		return publicationService.deleteByPosteParId(id);
	}
     	
   
    @ApiOperation("Search publication by a specific criterion")
    @PostMapping("/search")
	public List<PublicationVo> findByCriteria(@RequestBody PublicationVo publicationVo){
       return publicationConverter.toVo(publicationService.findByCriteria(publicationVo));
	}	
	public PublicationConverter getPublicationConverter(){
		return publicationConverter;
	}
 
	public void setPublicationConverter(PublicationConverter publicationConverter){
		this.publicationConverter=publicationConverter;
	}

	public PublicationService getPublicationService(){
		return publicationService;
	}
	public void setPublicationService( PublicationService publicationService){
	 	this.publicationService=publicationService;
	}
	

}