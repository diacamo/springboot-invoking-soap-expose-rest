package com.diacamo.rest;


import com.diacamo.soap.ws.client.CountryClient;
//import com.diacamo.rest.Country;
import com.diacamo.soap.ws.client.gen.Currency;
import com.diacamo.soap.ws.client.gen.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
//@Controller
//@RequestMapping(value = "/country")
public class CountryController {

//
//    private static final String template = "Hello, %s!";
//    //    private final AtomicLong counter = new AtomicLong();
    @Autowired
    CountryClient client;
//
    private com.diacamo.soap.ws.client.gen.Country country;

    @GetMapping("/country/{name}")
//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    @ResponseBody
    public com.diacamo.soap.ws.client.gen.Country getCountry(@PathVariable(value = "name") String name) {

//        GetCountryResponse response = client.getCountry(name);
//        country = new Country();
//        country.setName(response.getCountry().getName());
//        country.setCapital(response.getCountry().getCapital());
//        return country;

        country = client.getCountry(name).getCountry();
        return country;


    }

//    ConcurrentMap<String, Country> countries = new ConcurrentHashMap<>();
//
//    @GetMapping("/{name}")
//    public Country getCountry(@PathVariable String name) {
//        return countries.get(name);
//    }
//
//    @GetMapping("/")
//    public List<Country> getAllCountries () {
//        return new ArrayList<Country>(countries.values());
//    }
//
//    @GetMapping("/")
//    public Country addCountry(@RequestBody Country country) {
//        countries.put(country.getName(), country);
//        return country;
//    }

}

