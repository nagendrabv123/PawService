package com.paw.Paw.controller;

import com.paw.Paw.model.Paw;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paw")
public interface PawController {

    @GetMapping("/getAllPaws")
    List<Paw> getAllPaws();

    @PostMapping("/addPaw")
    Paw addPaw(@RequestBody Paw user);

    @GetMapping("/getPawById/{pawId}")
    Optional<Paw> getPawById(@PathVariable int userId);

}
