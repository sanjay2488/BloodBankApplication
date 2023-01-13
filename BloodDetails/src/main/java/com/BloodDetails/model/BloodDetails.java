package com.BloodDetails.model;
import java.util.Objects;

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
@Table(name = "blooddetail")
@EntityListeners(AuditingEntityListener.class)
public class BloodDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer blood_id;
    @Column(unique = true)
    @NotNull(message = "username cannot be null")
    @Size(min = 3, max = 10, message = "length of name must be between 3 & 10")
    private String username;
    @NotNull(message = "password cannot be null")
//          @JsonIgnore()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Size(min = 5, max = 8, message = "password length should be between 5 & 8.")
    private String password;
    @NotNull(message = "mobile number cannot be null")
    @Pattern(regexp = "[789]{1}[0-9]{9}", message = "invalid mobile number")
    private String contact_number;
    private String blood_group;
    private int quantity;
    @Override
    public String toString() {
        return "BloodDetails [blood_id=" + blood_id + ", username=" + username + ", password=" + password
                + ", contact_number=" + contact_number + ", blood_group=" + blood_group + ", quantity=" + quantity
                + "]";
    }
    public BloodDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
    public BloodDetails(Integer blood_id,
            @NotNull(message = "username cannot be null") @Size(min = 3, max = 10, message = "length of name must be between 3 & 10") String username,
            @NotNull(message = "password cannot be null") @Size(min = 5, max = 8, message = "password length should be between 5 & 8.") String password,
            @NotNull(message = "mobile number cannot be null") @Pattern(regexp = "[789]{1}[0-9]{9}", message = "invalid mobile number") String contact_number,
            String blood_group, int quantity) {
        super();
        this.blood_id = blood_id;
        this.username = username;
        this.password = password;
        this.contact_number = contact_number;
        this.blood_group = blood_group;
        this.quantity = quantity;
    }
    public Integer getBlood_id() {
        return blood_id;
    }
    public void setBlood_id(Integer blood_id) {
        this.blood_id = blood_id;
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
    public String getBlood_group() {
        return blood_group;
    }
    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
