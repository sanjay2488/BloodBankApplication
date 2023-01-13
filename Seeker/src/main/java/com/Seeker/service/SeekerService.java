package com.Seeker.service;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.Seeker.model.Seeker;
//import com.BloodDetails.model.BloodDetails;
public interface SeekerService {
    public Seeker saveSeeker( Seeker seeker);
    //public Optional<Seeker> view_user( int seeker_id );
    public List<Seeker> getAllSeekers();
    public void deleteSeeker (int seeker_id );
    public Seeker updateSeeker(int id, Seeker seeker);
    public Seeker update(Seeker seeker);
    public Seeker getSeeker(int id);
}