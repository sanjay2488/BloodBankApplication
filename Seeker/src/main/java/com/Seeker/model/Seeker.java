package com.Seeker.model;

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
@Table(name="seeker")
public class Seeker {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer seeker_id;
    @Column(unique = true)
    @NotNull(message = "username cannot be null")
    @Size(min = 3,max = 10,message = "length of name must be between 3 & 10")
    private String username;
    @NotNull(message = "password cannot be null")
//  @JsonIgnore()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Size(min = 5,max = 8,message = "password length should be between 5 & 8.")
    private String password;
    private String address;
    @NotNull(message = "mobile number cannot be null")
    @Pattern(regexp = "[789]{1}[0-9]{9}",message = "invalid mobile number")
    private String contact_number;
    private String email;
    private String gender;
    private String location;
    private int age;
    private String bloodgroup;
    public Seeker() {
        super();
    }
    public Integer getSeeker_id() {
        return seeker_id;
    }
    public void setSeeker_id(Integer seeker_id) {
        this.seeker_id = seeker_id;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
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
    public String getBloodgroup() {
        return bloodgroup;
    }
    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
    @Override
    public String toString() {
        return "Seeker [seeker_id=" + seeker_id + ", username=" + username + ", password=" + password + ", address="
                + address + ", contact_number=" + contact_number + ", email=" + email + ", gender=" + gender
                + ", location=" + location + ", age=" + age + ", bloodgroup=" + bloodgroup + "]";
    }
}