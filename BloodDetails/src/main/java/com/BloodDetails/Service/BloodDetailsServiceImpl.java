package com.BloodDetails.Service;
import java.util.List;

import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.BloodDetails.model.BloodDetails;
import com.BloodDetails.repository.BloodDetailsRepository;
//import com.donor.model.Donor;

@Service
    public class BloodDetailsServiceImpl implements BloodDetailsService{
        @Autowired
    BloodDetailsRepository blooddetailsRepository;
        @Override
        public BloodDetails add_blooddetails(BloodDetails blooddetail) {
            
            return blooddetailsRepository.save(blooddetail);
        }
        public String delete_blooddetails(int blood_id) {
        blooddetailsRepository.deleteById(blood_id);
            return "blooddetail deleted";
        }
        @Override
        public BloodDetails update_blooddetails(BloodDetails blooddetail) {
            
         return blooddetailsRepository.save(blooddetail);
        }
     
		public Optional<BloodDetails> view_blooddetails(int blood_id) {
			 return blooddetailsRepository.findById(blood_id);
			
			
		}
		public BloodDetails update(int id, BloodDetails blooddetail) {
			 BloodDetails bd1 = blooddetailsRepository.findById(id).get();
	            bd1.setUsername(blooddetail.getUsername());
	            bd1.setPassword(blooddetail.getPassword());
	            
	            bd1.setBlood_group(blooddetail.getBlood_group());
	            bd1.setContact_number(blooddetail.getContact_number());
	            
	            
	            return blooddetailsRepository.save(bd1);
			
			
		}
		public List<BloodDetails> getAllBloodDetails() {
			List<BloodDetails> listblooddetails = blooddetailsRepository.findAll();
            return listblooddetails;
			
			
		}
    }