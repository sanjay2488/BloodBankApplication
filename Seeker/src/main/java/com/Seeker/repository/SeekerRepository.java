package com.Seeker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//import com.BloodBanks.model.BloodBanks;
    import com.Seeker.model.Seeker;
    public interface SeekerRepository extends JpaRepository<Seeker, Integer> {

    }
