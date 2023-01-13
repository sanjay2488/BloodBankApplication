package com.BloodBanks.service;

import java.util.List;

import java.util.Optional;

import com.BloodBanks.model.BloodBanks;





public interface BloodBanksService {
    public BloodBanks insert_bloodbank(BloodBanks bloodbank);
    public Optional<BloodBanks> view_bloodbank(int blood_bank_id);
 public void delete_bloodbank(int blood_bank_id);
 public List<BloodBanks> getAllBloodBanks();
 public List<BloodBanks> bloodbank(String location);
    public BloodBanks update_bloodbank( BloodBanks bloodbank);
}
