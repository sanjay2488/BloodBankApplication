package com.BloodDetails.Service;
import java.util.List;
import java.util.Optional;

//import com.BloodBanks.model.BloodBanks;
import com.BloodDetails.model.BloodDetails;
public interface BloodDetailsService {
    public BloodDetails add_blooddetails(BloodDetails blooddetail);
    public String delete_blooddetails( int blood_id );
    public BloodDetails update_blooddetails(BloodDetails blooddetail);
    public Optional<BloodDetails> view_blooddetails(int blood_id);
    public BloodDetails update(int id, BloodDetails blooddetail);
    public List<BloodDetails> getAllBloodDetails();
}