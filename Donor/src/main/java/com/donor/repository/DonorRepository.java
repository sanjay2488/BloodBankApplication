package com.donor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.donor.model.Donor;
@Repository
public interface DonorRepository extends JpaRepository<Donor, Integer>{

}
