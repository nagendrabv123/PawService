package com.paw.Paw.service;

import com.paw.Paw.controller.PawController;
import com.paw.Paw.dao.PawDao;
import com.paw.Paw.model.Paw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PawService implements PawController {

    @Autowired
    PawDao pawDao;

    @Override
    public List<Paw> getAllPaws() {
        return pawDao.findAll();
    }

    @Override
    public Paw addPaw(Paw paw) {
        return pawDao.save(paw);
    }

    @Override
    public Optional<Paw> getPawById(int pawId) {
        return pawDao.findById(pawId);
    }
}
