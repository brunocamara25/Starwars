package com.brunocamara.letscode.starwars.repository;

import com.brunocamara.letscode.starwars.models.Rebelde;
import org.springframework.data.repository.CrudRepository;


public interface DataRepositoryInterface extends CrudRepository<Rebelde, Integer> {
	
	/**
	 * 
	 * Method will find the data by its ID.
	 *
	 * @author Bruno Camara.
	 * @param id
	 * @return
	 */
	Rebelde findById(long id);
	
	/**
	 * 
	 * Method will delete the data by its ID.
	 *
	 * @author Bruno Camara.
	 * @param id
	 * @return
	 */
	Rebelde deleteById(long id);

	/**
	 *
	 * Method will save the data by its ID.
	 *
	 * @author Bruno Camara.
	 * @param id
	 * @return
	 */
	Rebelde save(long id);

}