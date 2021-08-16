package com.brunocamara.letscode.starwars.services;

import com.brunocamara.letscode.starwars.models.Rebelde;

import java.util.List;

public interface DataService {

	/**
	 * 
	 * Method will All data.
	 *
	 * @author Bruno Camara.
	 * @param 
	 * @return List<DataEntity>
	 * @throws Exception 
	 */
	public abstract List<Rebelde> getAllData() throws Exception;
	
	/**
	 * 
	 * Method will find the document by its ID.
	 *
	 * @author Bruno Camara.
	 * @param id
	 * @return DataEntity
	 */
	public abstract Rebelde getDataById(long id) throws Exception;
		
	/**
	 * 
	 * Method will save or update the data.
	 *
	 * @author Bruno Camara.
	 * @param dataInput
	 * @return String
	 * Document
	 */
	public abstract void save(Rebelde dataInput)throws Exception;

	/**
	 * 
	 * Method will delete the data by its ID.
	 *
	 * @author Bruno Camara.
	 * @param id
	 * @return
	 * Document
	 */
	 public abstract void delete(int id) throws Exception;
	 
}
