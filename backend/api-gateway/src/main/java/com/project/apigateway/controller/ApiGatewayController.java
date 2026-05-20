package com.project.apigateway.controller;

import com.project.apigateway.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class ApiGatewayController {

    @Autowired
    private GatewayService gatewayService;

    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok(gatewayService.getStatus());
    }

    @GetMapping("/vehicles/{plate}")
    public ResponseEntity<?> proxyVehicle(@PathVariable String plate) {
        return ResponseEntity.ok(gatewayService.fetchVehicle(plate));
    }
}
