package com.BloodBanks.controllers;

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
import com.BloodBanks.service.BloodBanksServiceImpl;
//import com.donor.model.Donor;
import com.BloodBanks.model.BloodBanks;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/bloodbank")
public class BloodBanksController {
    @Autowired
    BloodBanksServiceImpl bloodBanksDaoServiceImpl;
    @PostMapping("/insert_bloodbank")
    public BloodBanks insert_bloodbank(@Valid @RequestBody BloodBanks bloodbank) {
        return bloodBanksDaoServiceImpl.insert_bloodbank(bloodbank);
    }
    
    @GetMapping("/view_bloodbank/{blood_bank_id}")
    public Optional<BloodBanks> view_bloodbank(@PathVariable int blood_bank_id ){
        return bloodBanksDaoServiceImpl.view_bloodbank(blood_bank_id);
    }
    @GetMapping("/all")
    public ResponseEntity<List<BloodBanks>> getall(){
        return new ResponseEntity<List<BloodBanks>>(bloodBanksDaoServiceImpl.getAllBloodBanks(),HttpStatus.OK);
    }
    
    @DeleteMapping("/delete_bloodbank/{blood_bank_id}")
    public String delete_bloodbank (@PathVariable int blood_bank_id ) {
        bloodBanksDaoServiceImpl.delete_bloodbank(blood_bank_id );
        return "BloodBank deleted successfully";
    }
    @GetMapping("/bloodbank/{location}")
    public List<BloodBanks> bloodbank(@PathVariable String location){
        return bloodBanksDaoServiceImpl.bloodbank(location);
    }
    @PutMapping("/update_bloodbank")
    public BloodBanks update_bloodbank(@RequestBody BloodBanks bloodbank) {
        return bloodBanksDaoServiceImpl.update_bloodbank(bloodbank);
    }
    @PutMapping("/update_bloodbanki/{blood_bank_id}")
    public ResponseEntity<BloodBanks> update(@PathVariable int blood_bank_id, @RequestBody BloodBanks bloodbank ){
        return new ResponseEntity<BloodBanks>(bloodBanksDaoServiceImpl.update_bloodbanki(blood_bank_id, bloodbank),HttpStatus.OK);
    }
}
