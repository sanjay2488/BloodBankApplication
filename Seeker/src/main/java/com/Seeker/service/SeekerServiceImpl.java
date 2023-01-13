package com.Seeker.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Seeker.service.SeekerService;
import com.Seeker.model.Seeker;
import com.Seeker.repository.SeekerRepository;
@Service
public class SeekerServiceImpl implements SeekerService{
    @Autowired
    private SeekerRepository repo;
    @Override
    public Seeker saveSeeker(Seeker seeker) {
        return repo.save(seeker);
    }
    @Override
    public List<Seeker> getAllSeekers() {
        List<Seeker> listseekers = repo.findAll();
        return listseekers;
    }
    @Override
    public void deleteSeeker(int seeker_id) {
        repo.deleteById(seeker_id);
    }
    @Override
    public Seeker updateSeeker(int id, Seeker seeker) {
        Seeker s1 = repo.findById(id).get();
        s1.setUsername(seeker.getUsername());
        s1.setPassword(seeker.getPassword());
        s1.setGender(seeker.getGender());
        s1.setAge(seeker.getAge());
        s1.setBloodgroup(seeker.getBloodgroup());
        s1.setContact_number(seeker.getContact_number());
        s1.setEmail(seeker.getEmail());
        s1.setAddress(seeker.getAddress());
        s1.setLocation(seeker.getLocation());
        return repo.save(s1);
    }
    @Override
    public Seeker getSeeker(int id) {
        
        Seeker s2 = repo.findById(id).get();
        return s2;
    }
	public Seeker update(Seeker seeker) {
		return repo.save(seeker);
		
	}
}