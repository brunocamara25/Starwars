package com.brunocamara.letscode.starwars.services;


import com.brunocamara.letscode.starwars.models.Rebelde;
import com.brunocamara.letscode.starwars.repository.DataRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
	DataRepositoryInterface dataRepository;

    //private static final Logger LOG = LoggerFactory.getLogger(DataServiceImpl.class);
    
    
    /**
	 * 
	 * Get all data from database
	 *
	 * @author Bruno Camara
	 * @return List<DataEntity>
	 * @throws Exception
	 */
    public List<Rebelde> getAllData() throws Exception{
        List<Rebelde> data = new ArrayList<Rebelde>();
        dataRepository.findAll().forEach(person -> data.add(person));
        return data;
    }

    /**
	 * 
	 * Get data from a specific Id on database
	 *
	 * @author Bruno Camara
	 * @param id
	 * @return DataEntity
	 * @throws Exception
	 */
    public Rebelde getDataById(long id) throws Exception{
        return dataRepository.findById(id);
    }

    /**
	 * 
	 * Save data on database
	 *
	 * @author Bruno Camara
	 * @param dataInput
	 * @return String
	 * @throws Exception
	 */
    public void save(Rebelde dataInput)throws Exception {

    	dataRepository.save(dataInput);
    }

	/**
	 * 
	 * Delete data on database
	 *
	 * @author Bruno Camara
	 * @param id
	 * @throws Exception
	 */
    public void delete(int id) {
    	dataRepository.deleteById(id);
    }

}