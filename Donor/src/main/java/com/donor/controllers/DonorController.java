package com.donor.controllers;

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

//import com.Seeker.model.Seeker;
//import com.Seeker.model.Seeker;
import com.donor.model.Donor;
import com.donor.service.DonorServiceImpl;
import com.donor.model.Donor;
@RestController
@RequestMapping("/donor")
@CrossOrigin(origins = "http://localhost:3000")
public class DonorController {
    @Autowired
    private DonorServiceImpl donorServiceImpl;
    
    @PostMapping("/insert_donor")
    public Donor insert_donor(@Valid @RequestBody Donor donor) {
        System.out.println("hi");
        return donorServiceImpl.insert_donor(donor);
    }
   
    @DeleteMapping("/delete_donor/{donor_id}")
    public String delete_donor (@PathVariable int donor_id ) {
        donorServiceImpl.delete_donor(donor_id );
        return "Donor deleted successfully";
    }
    @GetMapping("/all")
    public ResponseEntity<List<Donor>> getall(){
        return new ResponseEntity<List<Donor>>(donorServiceImpl.getAllDonor(),HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Donor> update(@PathVariable int id, @RequestBody Donor donor){
        return new ResponseEntity<Donor>(donorServiceImpl.update_donor(id, donor),HttpStatus.OK);
    }
    @PutMapping("/update")
    public Donor update(@RequestBody Donor donor) {
        return donorServiceImpl.update(donor);
    }

}
