package com.Admin.service;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Admin.model.Admin;
import com.Admin.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public Admin insert_admin(Admin admin) {
        
        return adminRepository.save(admin);
    }
    @Override
    public List<Admin> findAll() {
        
        return adminRepository.findAll();
    }
    @Override
    public Admin findAdminById(Integer id) {
        
        return adminRepository.findById(id).get();
    }
    @Override
    public void deleteById(Integer id) {
        
        adminRepository.deleteById(id);
    }
}