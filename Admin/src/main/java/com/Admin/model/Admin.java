package com.Admin.model;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer admin_id;
    @Column(unique = true)
    @NotNull(message = "username cannot be null")
    @Size(min = 3, max = 10, message = "length of name must be between 3 & 10")
    private String username;
    @NotNull(message = "password cannot be null")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Size(min = 5, max = 8, message = "password length should be between 5 & 8.")
    @Column
    private String password;
    @Column
    private String address;
    @NotNull(message = "mobile number cannot be null")
    @Pattern(regexp = "[789]{1}[0-9]{9}", message = "invalid mobile number")
    @Column
    private String contact_number;
    public Admin() {
        super();
    }
    public Admin(Integer admin_id, String username, String password, String address, String contact_number) {
        super();
        this.admin_id = admin_id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.contact_number = contact_number;
    }
    public Integer getAdmin_id() {
        return admin_id;
    }
    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
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
    @Override
    public String toString() {
        return "Admin [admin_id=" + admin_id + ", username=" + username + ", password=" + password + ", address="
                + address + ", contact_number=" + contact_number + "]";
    }
}