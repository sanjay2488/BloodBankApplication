package com.BloodDetails.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BloodDetails.model.BloodDetails;
@Repository
public interface BloodDetailsRepository extends JpaRepository<BloodDetails, Integer>{
//  @Query(value = "SELECT * FROM blood_details WHERE location = :location", nativeQuery = true)
//  List<BloodDetails> getBloodBankByLocation(String location);
//
   public String deleteById(int blood_id);
}
