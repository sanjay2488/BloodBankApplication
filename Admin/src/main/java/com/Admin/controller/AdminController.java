package com.Admin.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Admin.model.Admin;
import com.Admin.service.AdminServiceImpl;
//@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
     @Autowired
        private AdminServiceImpl adminService;
//      @Autowired
//      private ErrorMapValidationService errorMapValidationService;  
        @PostMapping("/add")
        public ResponseEntity<?> createNewAdmin(@Valid @RequestBody Admin admin) {
            Admin savedAdmin = adminService.insert_admin(admin);
            return new ResponseEntity<>(savedAdmin,HttpStatus.CREATED);
        }
        @GetMapping("/view/{id}")
        public ResponseEntity<?> getAdminById(@PathVariable Integer id){
                Admin viewAdmin=adminService.findAdminById(id);
            return new ResponseEntity<>(viewAdmin,HttpStatus.OK);
            }
        @GetMapping("/viewall")
        public Iterable<Admin> getAllAdmin(){
        return adminService.findAll();
        }
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<?> deleteAdmin(@PathVariable Integer id){
            adminService.deleteById(id);
            return new ResponseEntity<>("Admin with Id"+id+" deleted Successfully",HttpStatus.OK);
        }
}