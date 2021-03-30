package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Message;
import ma.zs.generated.ws.rest.provided.vo.MessageVo;

public interface MessageService {

        /**

     * find all Message in database 
     * @return List<Message> , If database is empty return  null.
     */
	List<Message> findAll();
	   
	/**

     * find Message from database by ref (reference)
     * @param ref - reference of Message 
     * @return the founded Message , If no Message were
     *         found in database return  null.
     */
	Message findByRef(String ref);

    /**
     * find Message from database by id (id)
     * @param id - id of Message 
     * @return the founded  Message , If no Message were
     *         found in database return  null.
     */
	Message findById(Long id);
     
     /**
     * delete Message from database
     * @param id - id of Message to be deleted
     * 
     */
	void deleteById(Long id);

	List<Message> findByEmetteurEmail(String email);
    int deleteByEmetteurEmail(String email);       
			
    List<Message> findByEmetteurId(Long id);
    int deleteByEmetteurId(Long id);
			 
	List<Message> findByDemandeConcerneRef(String ref);
    int deleteByDemandeConcerneRef(String ref);       
			
    List<Message> findByDemandeConcerneId(Long id);
    int deleteByDemandeConcerneId(Long id);
			 
    /**
     * save Message in database
     * @param message - Message to be saved 
     * @return the saved Message, If the Message can't be saved return null.
     */
	Message save(Message message);

	/**
     * save list Message in database
     * @param messages - list of Message to be saved 
     * @return the saved Message list
     */
	List<Message> save(List<Message> messages);
    
     /**
     * update Message in database
     * @param message - Message to be updated
     * @return the updated Message, If the Message can't be updated return null.
     */
    Message update(Message message);
    
       /**
     * delete Message from database
     * @param message - Message to be deleted
     * @return 1 if Message deleted successfully, If the Message can't be deleted return negative int
     */
	int delete(Message message);


    
        /**
     * delete Message from database by ref (reference)
     * 
     * @param ref - reference of Message to be deleted
     * @return 1 if Message deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Message in by some criteria
     * @return the searhed list Message 
     */
	List<Message> findByCriteria( MessageVo messageVo);
}