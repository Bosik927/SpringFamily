package com.github.bosik927.repository;

import com.github.bosik927.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
