package com.paw.pawAdmin.dao;

import com.paw.pawAdmin.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
}
