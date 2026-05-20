package com.project.vehicle.service;

import com.project.vehicle.integration.VehicleIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleIntegrationService integrationService;

    public Object getVehicleInfo(String plate) {
        return integrationService.fetchVehicleData(plate);
    }
}
