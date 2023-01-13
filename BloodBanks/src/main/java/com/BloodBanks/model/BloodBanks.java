package com.BloodBanks.model;

import java.util.Objects;
import java.util.Optional;

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
@Table(name="bloodbank")
public class BloodBanks {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer blood_bank_id;
    @Column(unique = true)
    @NotNull(message = "username cannot be null")
    @Size(min = 3,max = 10,message = "length of name must be between 3 & 10")
    private String username;
    @NotNull(message = "password cannot be null")
//  @JsonIgnore()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Size(min = 5,max = 8,message = "password length should be between 5 & 8.")
    private String password;
    
    @NotNull(message = "mobile number cannot be null")
    @Pattern(regexp = "[789]{1}[0-9]{9}",message = "invalid mobile number")
    private String contact_number;
    private String location;
    public BloodBanks() {
        super();
        // TODO Auto-generated constructor stub
    }
    public BloodBanks(Integer blood_bank_id,
            @NotNull(message = "username cannot be null") @Size(min = 3, max = 10, message = "length of name must be between 3 & 10") String username,
            @NotNull(message = "password cannot be null") @Size(min = 5, max = 8, message = "password length should be between 5 & 8.") String password,
            String address,
            @NotNull(message = "mobile number cannot be null") @Pattern(regexp = "[789]{1}[0-9]{9}", message = "invalid mobile number") String contact_number,
            String location) {
        super();
        this.blood_bank_id = blood_bank_id;
        this.username = username;
        this.password = password;
        
        this.contact_number = contact_number;
        this.location = location;
    }
    public Integer getBlood_bank_id() {
        return blood_bank_id;
    }
    public void setBlood_bank_id(Integer blood_bank_id) {
        this.blood_bank_id = blood_bank_id;
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
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "BloodBanks [blood_bank_id=" + blood_bank_id + ", username=" + username + ", password=" + password
                + ", contact_number=" + contact_number + ", location=" + location + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(blood_bank_id, contact_number, location, password, username);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BloodBanks other = (BloodBanks) obj;
        return Objects.equals(blood_bank_id, other.blood_bank_id)
                && Objects.equals(contact_number, other.contact_number) && Objects.equals(location, other.location)
                && Objects.equals(password, other.password) && Objects.equals(username, other.username);
    }
	
}
