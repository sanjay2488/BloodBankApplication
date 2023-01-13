package com.Seeker;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Seeker.model.Seeker;
import com.Seeker.service.SeekerServiceImpl;
@SpringBootTest
class SeekerApplicationTest{
@Autowired
SeekerServiceImpl seekerserviceimpl ;
@Test
void contextLoads() {
}
@Test
public void insertSeeker() {
Seeker c = new Seeker();
c.setSeeker_id(1);
c.setUsername("Audi");
c.setPassword("amans");
c.setGender("male");
c.setAge(22);
c.setBloodgroup("o+");
c.setContact_number("8210804453");
c.setEmail("amasn@gmail.com");
c.setAddress("bihja");
c.setLocation("bengaluru");
seekerserviceimpl.saveSeeker(c);
assertThat(c.getSeeker_id()).isGreaterThan(0);
}
@Test
public void DisplaySeeker() // display
{
assertThat(seekerserviceimpl.getAllSeekers()).isNotEqualTo(0);
}}

