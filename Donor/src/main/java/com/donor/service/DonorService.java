package com.donor.service;

import java.util.List;

//import com.Seeker.model.Seeker;
import com.donor.model.Donor;
public interface DonorService {
    public Donor insert_donor( Donor donor);
    public Donor update_donor( int id,Donor donor);
    public void delete_donor ( Integer donor_id );
    public List<Donor> getAllDonor();
    public Donor update(Donor donor);
}
