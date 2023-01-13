package com.donor.service;

import java.util.List;


import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

//import com.Seeker.model.Seeker;
//import com.Seeker.model.Seeker;
import com.donor.model.Donor;
    import com.donor.repository.DonorRepository;
    @Service
    public class DonorServiceImpl implements DonorService {
        @Autowired
        DonorRepository donorRepository;
        @Override
        public Donor insert_donor( Donor donor) {
            return donorRepository.save(donor);
        }
        
        @Override
        public void delete_donor ( Integer donor_id ) {
             donorRepository.deleteById(donor_id);
        }
        public List<Donor> getAllDonor() {
            List<Donor> listdonor = donorRepository.findAll();
            return listdonor;
        }
        public Donor update_donor(int id, Donor donor) {
            Donor d1 = donorRepository.findById(id).get();
            d1.setUsername(donor.getUsername());
            d1.setPassword(donor.getPassword());
            d1.setAge(donor.getAge());
            d1.setBlood_group(donor.getBlood_group());
            d1.setContact_number(donor.getContact_number());
            d1.setEmail(donor.getEmail());
            d1.setLocation(donor.getLocation());
            return donorRepository.save(d1);
        }
       

		public Donor update(Donor donor) {
			return donorRepository.save(donor);
			
			
		}

		
    }
