package com.codingworld.multitenant.controller;

import com.codingworld.multitenant.bean.City;
import com.codingworld.multitenant.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/createcity", method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody City city) {
        cityService.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getcity/all", method = RequestMethod.GET)
    public ResponseEntity<List<City>> getAll() throws SQLException {
        List<City> cities = cityService.getAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @RequestMapping(value = "/getcity/{id}", method = RequestMethod.GET)
    public ResponseEntity<City> get(@PathVariable(value = "id") Long id) {
        City city = cityService.get(id);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @RequestMapping(value = "/getcitybyname/{name}", method = RequestMethod.GET)
    public ResponseEntity<City> get(@PathVariable(value = "name") String name) {
        City city = cityService.getByName(name);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @RequestMapping(value = "deletebyname/{name}", method = RequestMethod.DELETE)
    public ResponseEntity<City> delete(@PathVariable(value = "name") String name) {
        cityService.delete(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
