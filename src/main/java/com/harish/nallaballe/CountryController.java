package com.harish.nallaballe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    
    @Autowired
    private CountryRepository countryRepository;

    @PostMapping("/save")
    public void saveCountry(@RequestBody Country country){
        countryRepository.save(country);
    }

    @GetMapping("/get")
    public List<Country> getAllCountries(){
       return countryRepository.findAll();
    }

}
