package com.BloodDetails.controllers;
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

//import com.BloodBanks.model.BloodBanks;
import com.BloodDetails.Service.BloodDetailsServiceImpl;
import com.BloodDetails.model.BloodDetails;
//import com.donor.model.Donor;
//import com.Seeker.model.Seeker;
@RestController
@RequestMapping("/blooddetail")
@CrossOrigin(origins = "http://localhost:3000")
public class BloodDetailsController {
    @Autowired
    BloodDetailsServiceImpl bloodDetailsServiceImpl;
    
    @PostMapping("/add_blooddetails")
    public BloodDetails add_blooddetails(@Valid @RequestBody BloodDetails blooddetail) {
        return bloodDetailsServiceImpl.add_blooddetails(blooddetail);
    }
    @GetMapping("/view_blooddetails/{blood_id}")
    public Optional<BloodDetails> view_blooddetails(@PathVariable int blood_id ){
        return bloodDetailsServiceImpl.view_blooddetails(blood_id);
    }
    @GetMapping("/all")
    public ResponseEntity<List<BloodDetails>> getall(){
        return new ResponseEntity<List<BloodDetails>>(bloodDetailsServiceImpl.getAllBloodDetails(),HttpStatus.OK);
    }
    @DeleteMapping("/delete_blooddetails/{blood_id}")
    public String delete_blooddetails(@PathVariable int blood_id ) {
        bloodDetailsServiceImpl.delete_blooddetails(blood_id );
        return "blooddetails deleted successfully";
    }
    @PutMapping("/update_blooddetails")
    public BloodDetails update_blooddetails(@RequestBody BloodDetails blooddetail) {
        return bloodDetailsServiceImpl.update_blooddetails(blooddetail);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<BloodDetails> update(@PathVariable int id, @RequestBody BloodDetails blooddetail){
        return new ResponseEntity<BloodDetails>(bloodDetailsServiceImpl.update(id,blooddetail), HttpStatus.OK);
    }
    }

