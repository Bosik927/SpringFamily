package com.github.bosik927.service;

import com.github.bosik927.model.Speaker;
import com.github.bosik927.repository.HibernateSpeakerRepositoryImpl;
import com.github.bosik927.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
