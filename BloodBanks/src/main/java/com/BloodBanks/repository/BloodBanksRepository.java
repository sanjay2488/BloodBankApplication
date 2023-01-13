package com.BloodBanks.repository;

import java.util.List;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Modifying;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.transaction.annotation.Transactional;
    import com.BloodBanks.model.BloodBanks;
    public interface BloodBanksRepository  extends JpaRepository<BloodBanks, Integer>{
//      @Query(value = "SELECT * FROM blood_bank WHERE email = :email and password= :password", nativeQuery = true)
//      BloodBanks bloodBankLogin(String email,String password);
//      
//      @Query(value = "SELECT * FROM blood_bank WHERE location = :location", nativeQuery = true)
//      List<BloodBanks> getBloodBankByLocation(String location);
//      
//      @Modifying
//      @Transactional
//      @Query(value = "DELETE  FROM blood_bank WHERE blood_bank_id = :blood_bank_id", nativeQuery = true)
//      int deleteById(int blood_bank_id);
//      
//      @Query(value = "SELECT *  FROM blood_bank WHERE blood_bank_id = :blood_bank_id", nativeQuery = true)
//      BloodBanks findOneById(int blood_bank_id);
        public Optional<BloodBanks> findById(int blood_bank_id);
        public List<BloodBanks> findByLocation(String location);
    }
