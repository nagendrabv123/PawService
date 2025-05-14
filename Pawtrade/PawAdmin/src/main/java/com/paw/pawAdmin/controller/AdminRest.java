package com.paw.pawAdmin.controller;

import com.paw.pawAdmin.exception.CustomException;
import com.paw.pawAdmin.model.Admin;
import jakarta.ws.rs.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public interface AdminRest {

    @GetMapping("/getAllAdmins")
    List<Admin> getAllAdmins() throws CustomException;

    @PostMapping("/addAdmin")
    Admin addAdmin(@RequestBody Admin admin);

    @GetMapping("/getAdminById/{adminId}")
    Optional<Admin> getAdminById(@PathVariable int adminId);
}
