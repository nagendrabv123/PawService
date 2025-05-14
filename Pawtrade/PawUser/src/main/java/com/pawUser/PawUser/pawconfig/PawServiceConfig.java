package com.pawUser.PawUser.pawconfig;

import com.pawUser.PawUser.model.Paw;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Configuration
@FeignClient(name = "PAW")
public interface PawServiceConfig {

    @GetMapping("/paw/getAllPaws")
    List<Paw> getAllPaws();

    @PostMapping("/paw/addPaw")
    Paw addPaw(@RequestBody Paw user);

    @GetMapping("/paw/getPawById/{pawId}")
    Optional<Paw> getPawById(@PathVariable int userId);


}
