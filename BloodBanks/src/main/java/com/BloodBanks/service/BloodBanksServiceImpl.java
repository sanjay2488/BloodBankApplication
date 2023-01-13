package com.BloodBanks.service;

import java.util.List;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.BloodBanks.model.BloodBanks;
import com.BloodBanks.repository.BloodBanksRepository;
//import com.donor.model.Donor;
//import com.BloodDetails.model.BloodDetails;
//import com.donor.model.Donor;
    @Service
    public class BloodBanksServiceImpl implements BloodBanksService {
        @Autowired
        BloodBanksRepository bloodBanksRepository;
        public BloodBanks insert_bloodbank(BloodBanks bloodbank){
            return bloodBanksRepository.save(bloodbank);
        }
        public void delete_bloodbank( int blood_bank_id) {
             bloodBanksRepository.deleteById(blood_bank_id);
        }
        public List<BloodBanks> bloodbank( String location){
            return bloodBanksRepository.findByLocation(location);
        }
        public BloodBanks update_bloodbank( BloodBanks bloodbank) {
            return bloodBanksRepository.save(bloodbank);
        }
        public Optional<BloodBanks> view_bloodbank( int blood_bank_id ){
            return bloodBanksRepository.findById(blood_bank_id);
        }
        public List<BloodBanks> getAllBloodBanks() {
            List<BloodBanks> listbloodbank = bloodBanksRepository.findAll();
            return listbloodbank;
        }
		 
			
		public BloodBanks update_bloodbanki(int blood_bank_id, BloodBanks bloodbank) {
			BloodBanks b1 = ((BloodBanksRepository) bloodbank).findById(blood_bank_id).get();
            b1.setUsername(bloodbank.getUsername());
            b1.setPassword(bloodbank.getPassword());
            
           // b1.setBlood_group(bloodbank.getBlood_group());
            b1.setContact_number(bloodbank.getContact_number());
           
            b1.setLocation(bloodbank.getLocation());
            return bloodBanksRepository.save(b1);
		}
		 
    }