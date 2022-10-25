package com.krish.onlineexamination.result;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<Result, Integer> {

	/**
	 * find result by email
	 * @param email
	 * @return list of Result
	 */
	  public List<Result> findByEmailEmail(String email );
}
