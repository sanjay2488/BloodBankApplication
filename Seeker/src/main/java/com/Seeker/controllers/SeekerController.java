package com.Seeker.controllers;

import java.util.List;


import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Seeker.service.SeekerServiceImpl;
//import com.BloodDetails.model.BloodDetails;
import com.Seeker.model.Seeker;
@RestController
@RequestMapping("/seeker")
@CrossOrigin(origins = "http://localhost:3000")
public class SeekerController {
    @Autowired
    private SeekerServiceImpl seekerimpl;
    @PostMapping("/add")
    public ResponseEntity<Seeker> save(@RequestBody Seeker seeker){
        return new ResponseEntity<Seeker>(seekerimpl.saveSeeker(seeker), HttpStatus.ACCEPTED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Seeker> getbyid(@PathVariable int id){
        return new ResponseEntity<Seeker>(seekerimpl.getSeeker(id), HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Seeker>> getall(){
        return new ResponseEntity<List<Seeker>>(seekerimpl.getAllSeekers(),HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Seeker> update(@PathVariable int id, @RequestBody Seeker seeker){
        return new ResponseEntity<Seeker>(seekerimpl.updateSeeker(id, seeker), HttpStatus.OK);
    }
    @PutMapping("/update")
    public Seeker update(@RequestBody Seeker seeker) {
        return seekerimpl.update(seeker);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        seekerimpl.deleteSeeker(id);
        return "Seeker deleted successfully";
    }
}
