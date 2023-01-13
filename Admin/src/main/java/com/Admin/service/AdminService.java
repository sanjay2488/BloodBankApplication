package com.Admin.service;

import java.util.List;
import com.Admin.model.Admin;
public interface AdminService {
    public Admin insert_admin( Admin admin);
    public List<Admin> findAll();
    public Admin findAdminById(Integer id);
    public void deleteById(Integer id);
}