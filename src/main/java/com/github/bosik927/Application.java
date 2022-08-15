package com.github.bosik927;

import com.github.bosik927.service.SpeakerService;
import com.github.bosik927.service.SpeakerServiceImpl;

public class Application {

    public static void main(String... args){
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).firstName());
    }
}
