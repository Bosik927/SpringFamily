package com.github.bosik927.repository;

import com.github.bosik927.model.Speaker;

import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        return List.of(new Speaker("Name", "Surname"));
    }

}
