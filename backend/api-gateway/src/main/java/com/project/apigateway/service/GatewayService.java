package com.project.apigateway.service;

import org.springframework.stereotype.Service;

@Service
public class GatewayService {

    public String getStatus() {
        return "API Gateway is running";
    }

    public Object fetchVehicle(String plate) {
        // Aquí se puede agregar lógica de ruteo a vehicle-service o autenticación
        return "Proxy to vehicle-service for plate: " + plate;
    }
}
