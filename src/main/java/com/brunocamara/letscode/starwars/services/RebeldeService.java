package com.brunocamara.letscode.starwars.services;

import com.brunocamara.letscode.starwars.models.Rebelde;
import com.brunocamara.letscode.starwars.repository.DataRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RebeldeService {

    @Autowired
    DataRepositoryInterface dataRepository;

    public void saveRebelde(Rebelde rebelde){
        dataRepository.save(rebelde);
    }

}
