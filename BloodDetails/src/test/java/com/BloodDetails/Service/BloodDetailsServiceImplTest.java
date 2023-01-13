package com.BloodDetails.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.BloodDetails.Service.BloodDetailsServiceImpl;
import com.BloodDetails.model.BloodDetails;
@SpringBootTest
class DonorApplicationTest{
@Autowired
BloodDetailsServiceImpl blooddetailsserviceimpl ;
@Test
void contextLoads() {
}
@Test
public void insertBlooddetail() {
BloodDetails b = new BloodDetails();
 b.setBlood_id(1);
b.setUsername("Amans");
b.setPassword("amanhf");
b.setBlood_group("b+");
b.setContact_number("8210804453");
blooddetailsserviceimpl.add_blooddetails(b);
assertThat(b.getBlood_id()).isGreaterThan(0);
}
@Test
public void DisplayBlooddetail() // display
{
assertThat(blooddetailsserviceimpl.getAllBloodDetails()).isNotEqualTo(0);
}}
