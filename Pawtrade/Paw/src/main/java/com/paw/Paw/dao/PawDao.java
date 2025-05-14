package com.paw.Paw.dao;

import com.paw.Paw.model.Paw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PawDao extends JpaRepository<Paw, Integer> {
}
