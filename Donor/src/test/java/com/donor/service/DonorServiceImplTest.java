package com.donor.service;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.donor.service.DonorServiceImpl;
import com.donor.model.Donor;
@SpringBootTest
class DonorApplicationTest{
@Autowired
DonorServiceImpl donorserviceimpl ;
@Test
void contextLoads() {
}
@Test
public void insertDonor() {
Donor d = new Donor();
d.setDonor_id(1);
d.setUsername("Amans");
d.setPassword("amanhf");
d.setAge(25);
d.setBlood_group("b+");
d.setContact_number("8210804453");
d.setEmail("amasnn@gmail.com");
d.setLocation("benaluru");
donorserviceimpl.insert_donor(d);
assertThat(d.getDonor_id()).isGreaterThan(0);
}
@Test
public void DisplayDonor() // display
{
assertThat(donorserviceimpl.getAllDonor()).isNotEqualTo(0);
}}
