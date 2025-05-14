package com.paw.pawAdmin.service;

import com.paw.pawAdmin.controller.AdminRest;
import com.paw.pawAdmin.dao.AdminDao;
import com.paw.pawAdmin.exception.CustomException;
import com.paw.pawAdmin.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService implements AdminRest {

    @Autowired
    AdminDao adminDao;

    @Override
    public List<Admin> getAllAdmins() throws CustomException {
        try {
            return adminDao.findAll();
        } catch(Exception e) {
            throw new CustomException(e.getMessage(), e);
        }
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return adminDao.save(admin);
    }

    @Override
    public Optional<Admin> getAdminById(int adminId) {
        return adminDao.findById(adminId);
    }
}
