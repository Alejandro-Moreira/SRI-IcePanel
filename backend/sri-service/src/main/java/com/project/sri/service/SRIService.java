package com.project.sri.service;

import com.project.sri.integration.SRIIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SRIService {

    @Autowired
    private SRIIntegrationService integrationService;

    public Object getTaxpayerInfo(String ruc) {
        return integrationService.fetchTaxpayerInfo(ruc);
    }
}
