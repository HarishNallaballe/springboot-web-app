package com.harish.nallaballe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @PostMapping("/savestate")
    public void save(@RequestBody State state){
        stateRepository.save(state);
    }

    @GetMapping("/get/id")
    public List<State> getAllStates(@PathVariable("id") Integer id){
        return stateRepository.findByCountry(id);
    }
    
}
