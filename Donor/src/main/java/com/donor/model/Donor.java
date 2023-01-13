package com.donor.model;

import java.util.Objects;
import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name = "donor")
public class Donor {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer donor_id;
    @Column(unique = true)
    @NotNull(message = "username cannot be null")
    @Size(min = 3,max = 10,message = "length of name must be between 3 & 10")
    private String username;
    @NotNull(message = "password cannot be null")
//  @JsonIgnore()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Size(min = 5,max = 8,message = "password length should be between 5 & 8.")
    @Column
    private String password;
    @NotNull(message = "mobile number cannot be null")
    @Pattern(regexp = "[789]{1}[0-9]{9}",message = "invalid mobile number")
    @Column
    private String contact_number;
    @Column
    private String email;
    @Column
    private String blood_group;
    @Column
    private String location;
    @Column
    private int age;
    public Donor() {
        super();
        
    }
    public Donor(Integer donor_id,String email,String username,String password,String contact_number, String blood_group, String location, int age) {
        super();
        this.donor_id = donor_id;
        this.username = username;
        this.password = password;
        this.contact_number = contact_number;
        this.email = email;
        this.blood_group = blood_group;
        this.location = location;
        this.age = age;
    }
    public Integer getDonor_id() {
        return donor_id;
    }
    @Override
    public String toString() {
        return "Donor [donor_id=" + donor_id + ", username=" + username + ", password=" + password + ", contact_number=" + contact_number + ", email=" + email + ", blood_group=" + blood_group
                + ", location=" + location + ", age=" + age + "]";
    }
    public void setDonor_id(Integer donor_id) {
        this.donor_id = donor_id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getContact_number() {
        return contact_number;
    }
    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBlood_group() {
        return blood_group;
    }
    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}