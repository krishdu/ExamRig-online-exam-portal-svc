package com.krish.onlineexamination.result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResultController {

	  @Autowired
	  private ResultRepository resultRepository;

	/**
	 * get all result present in database
	 * @return list of {@link Result}
	 */
	@GetMapping("/result")
	  public List<Result> getAllResult(){
		  return (List<Result>)this.resultRepository.findAll();
	  }


	/**
	 * to save result
	 * @param result
	 * @return {@link Result}
	 */
	@PostMapping("/result")
	  public  Result addNewResult(@RequestBody Result result){
		  return this.resultRepository.save(result);
	  }

	/**
	 * get all result of a particular student
 	 * @param email
	 * @return list of {@link Result}
	 */
	@GetMapping("/user/{email}/result")
	  public List<Result> getAllResultForStudent(@PathVariable("email") String email){
		  return this.resultRepository.findByEmailEmail(email);
		  
	  }
	  
}
