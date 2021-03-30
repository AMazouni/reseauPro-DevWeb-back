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
import ma.zs.generated.bean.Utilisateur; 
import ma.zs.generated.service.facade.UtilisateurService;
import ma.zs.generated.ws.rest.provided.converter.UtilisateurConverter;
import ma.zs.generated.ws.rest.provided.vo.UtilisateurVo;

@Api("Manages utilisateur services")
@RestController
@RequestMapping("generated/utilisateur")
public class UtilisateurRest {

	@Autowired 
	private UtilisateurService utilisateurService;
	
	@Autowired 
	private UtilisateurConverter utilisateurConverter ;

    @ApiOperation("Saves the specified utilisateur")
	@PostMapping("/")
	public UtilisateurVo save(@RequestBody UtilisateurVo utilisateurVo){
		Utilisateur utilisateur= utilisateurConverter.toItem(utilisateurVo);
	  utilisateur=	utilisateurService.save(utilisateur);
		return utilisateurConverter.toVo(utilisateur);
	}

    @ApiOperation("Delete the specified utilisateur")
	@DeleteMapping("/")
	public int delete(@RequestBody UtilisateurVo utilisateurVo){
		Utilisateur utilisateur = utilisateurConverter.toItem(utilisateurVo);
		return utilisateurService.delete(utilisateur);
	}

	@ApiOperation("Updates the specified utilisateur")
	@PutMapping("/")
	public UtilisateurVo update(@RequestBody UtilisateurVo utilisateurVo){
		Utilisateur utilisateur= utilisateurConverter.toItem(utilisateurVo);
	  utilisateur=	utilisateurService.update(utilisateur);
		return utilisateurConverter.toVo(utilisateur);
	}

	@ApiOperation("Finds a list of all utilisateurs")
	@GetMapping("/")
	public List<UtilisateurVo> findAll(){
		return utilisateurConverter.toVo(utilisateurService.findAll());
	}
    
	@ApiOperation("Finds a utilisateur by id")
	@GetMapping("/id/{id}")
	public UtilisateurVo findById(@PathVariable Long id){
		return  utilisateurConverter.toVo(utilisateurService.findById(id));
	}
	@ApiOperation("Deletes a utilisateur by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 utilisateurService.deleteById(id);
	}

	@ApiOperation("Finds a  utilisateur by email")
    @GetMapping("/email/{email}")
	public UtilisateurVo findByEmail(@PathVariable String email){
		return  utilisateurConverter.toVo(utilisateurService.findByEmail(email));
	}
	@ApiOperation("Deletes a  utilisateur by email")
    @DeleteMapping("/email/{email}")
	public int deleteByEmail(@PathVariable String email){
		return  utilisateurService.deleteByEmail(email);
	}
	


    @ApiOperation("Finds a utilisateur by nom of adminInfo")
	@GetMapping("/adminInfo/nom/{nom}")
	public List<UtilisateurVo> findByAdminInfoNom(@PathVariable String nom){
		return utilisateurConverter.toVo(utilisateurService.findByAdminInfoNom(nom));
	}
	
	@ApiOperation("Deletes a utilisateur by nom of adminInfo")
	@DeleteMapping("/adminInfo/nom/{nom}")
	public int deleteByAdminInfoNom(@PathVariable String nom){
		return utilisateurService.deleteByAdminInfoNom(nom);
	}
	
	@ApiOperation("Finds utilisateur by id of adminInfo")
	@GetMapping("/adminInfo/id/{id}")
	public List<UtilisateurVo> findByAdminInfoId(@PathVariable Long id){
		return utilisateurConverter.toVo(utilisateurService.findByAdminInfoId(id));
	}
	@ApiOperation("Deletes utilisateur by id of adminInfo")
	@DeleteMapping("/adminInfo/id/{id}")
	public int deleteByAdminInfoId(@PathVariable Long id){
		return utilisateurService.deleteByAdminInfoId(id);
	}
     	
    @ApiOperation("Finds a utilisateur by cne of laureatInfo")
	@GetMapping("/laureatInfo/cne/{cne}")
	public List<UtilisateurVo> findByLaureatInfoCne(@PathVariable String cne){
		return utilisateurConverter.toVo(utilisateurService.findByLaureatInfoCne(cne));
	}
	
	@ApiOperation("Deletes a utilisateur by cne of laureatInfo")
	@DeleteMapping("/laureatInfo/cne/{cne}")
	public int deleteByLaureatInfoCne(@PathVariable String cne){
		return utilisateurService.deleteByLaureatInfoCne(cne);
	}
	
	@ApiOperation("Finds utilisateur by id of laureatInfo")
	@GetMapping("/laureatInfo/id/{id}")
	public List<UtilisateurVo> findByLaureatInfoId(@PathVariable Long id){
		return utilisateurConverter.toVo(utilisateurService.findByLaureatInfoId(id));
	}
	@ApiOperation("Deletes utilisateur by id of laureatInfo")
	@DeleteMapping("/laureatInfo/id/{id}")
	public int deleteByLaureatInfoId(@PathVariable Long id){
		return utilisateurService.deleteByLaureatInfoId(id);
	}
     	
    @ApiOperation("Finds a utilisateur by cne of etudiantInfo")
	@GetMapping("/etudiantInfo/cne/{cne}")
	public List<UtilisateurVo> findByEtudiantInfoCne(@PathVariable String cne){
		return utilisateurConverter.toVo(utilisateurService.findByEtudiantInfoCne(cne));
	}
	
	@ApiOperation("Deletes a utilisateur by cne of etudiantInfo")
	@DeleteMapping("/etudiantInfo/cne/{cne}")
	public int deleteByEtudiantInfoCne(@PathVariable String cne){
		return utilisateurService.deleteByEtudiantInfoCne(cne);
	}
	
	@ApiOperation("Finds utilisateur by id of etudiantInfo")
	@GetMapping("/etudiantInfo/id/{id}")
	public List<UtilisateurVo> findByEtudiantInfoId(@PathVariable Long id){
		return utilisateurConverter.toVo(utilisateurService.findByEtudiantInfoId(id));
	}
	@ApiOperation("Deletes utilisateur by id of etudiantInfo")
	@DeleteMapping("/etudiantInfo/id/{id}")
	public int deleteByEtudiantInfoId(@PathVariable Long id){
		return utilisateurService.deleteByEtudiantInfoId(id);
	}
     	
    @ApiOperation("Finds a utilisateur by code of professeurInfo")
	@GetMapping("/professeurInfo/code/{code}")
	public List<UtilisateurVo> findByProfesseurInfoCode(@PathVariable String code){
		return utilisateurConverter.toVo(utilisateurService.findByProfesseurInfoCode(code));
	}
	
	@ApiOperation("Deletes a utilisateur by code of professeurInfo")
	@DeleteMapping("/professeurInfo/code/{code}")
	public int deleteByProfesseurInfoCode(@PathVariable String code){
		return utilisateurService.deleteByProfesseurInfoCode(code);
	}
	
	@ApiOperation("Finds utilisateur by id of professeurInfo")
	@GetMapping("/professeurInfo/id/{id}")
	public List<UtilisateurVo> findByProfesseurInfoId(@PathVariable Long id){
		return utilisateurConverter.toVo(utilisateurService.findByProfesseurInfoId(id));
	}
	@ApiOperation("Deletes utilisateur by id of professeurInfo")
	@DeleteMapping("/professeurInfo/id/{id}")
	public int deleteByProfesseurInfoId(@PathVariable Long id){
		return utilisateurService.deleteByProfesseurInfoId(id);
	}
     	
    @ApiOperation("Finds a utilisateur by reponse of reponses")
	@GetMapping("/reponses/reponse/{reponse}")
	public List<UtilisateurVo> findByReponsesReponse(@PathVariable String reponse){
		return utilisateurConverter.toVo(utilisateurService.findByReponsesReponse(reponse));
	}
	
	@ApiOperation("Deletes a utilisateur by reponse of reponses")
	@DeleteMapping("/reponses/reponse/{reponse}")
	public int deleteByReponsesReponse(@PathVariable String reponse){
		return utilisateurService.deleteByReponsesReponse(reponse);
	}
	
	@ApiOperation("Finds utilisateur by id of reponses")
	@GetMapping("/reponses/id/{id}")
	public List<UtilisateurVo> findByReponsesId(@PathVariable Long id){
		return utilisateurConverter.toVo(utilisateurService.findByReponsesId(id));
	}
	@ApiOperation("Deletes utilisateur by id of reponses")
	@DeleteMapping("/reponses/id/{id}")
	public int deleteByReponsesId(@PathVariable Long id){
		return utilisateurService.deleteByReponsesId(id);
	}
     	
   
    @ApiOperation("Search utilisateur by a specific criterion")
    @PostMapping("/search")
	public List<UtilisateurVo> findByCriteria(@RequestBody UtilisateurVo utilisateurVo){
       return utilisateurConverter.toVo(utilisateurService.findByCriteria(utilisateurVo));
	}	
	public UtilisateurConverter getUtilisateurConverter(){
		return utilisateurConverter;
	}
 
	public void setUtilisateurConverter(UtilisateurConverter utilisateurConverter){
		this.utilisateurConverter=utilisateurConverter;
	}

	public UtilisateurService getUtilisateurService(){
		return utilisateurService;
	}
	public void setUtilisateurService( UtilisateurService utilisateurService){
	 	this.utilisateurService=utilisateurService;
	}
	

}