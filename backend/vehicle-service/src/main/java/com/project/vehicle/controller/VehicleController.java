package com.project.vehicle.controller;

import com.project.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/{plate}")
    public ResponseEntity<?> getVehicle(@PathVariable String plate) {
        return ResponseEntity.ok(vehicleService.getVehicleInfo(plate));
    }
}
