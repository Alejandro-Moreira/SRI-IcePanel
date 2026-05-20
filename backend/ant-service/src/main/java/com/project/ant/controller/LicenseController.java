package com.project.ant.controller;

import com.project.ant.service.LicensePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/licenses")
public class LicenseController {

    @Autowired
    private LicensePointService licensePointService;

    @GetMapping("/{cedula}")
    public ResponseEntity<?> getPoints(@PathVariable String cedula) {
        return ResponseEntity.ok(licensePointService.getLicensePoints(cedula));
    }
}
