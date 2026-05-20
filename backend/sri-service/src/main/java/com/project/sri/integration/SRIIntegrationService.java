package com.project.sri.integration;

import org.springframework.stereotype.Service;

@Service
public class SRIIntegrationService {

    public Object fetchTaxpayerInfo(String ruc) {
        // Consumo API REST SRI
        String url = "https://srienlinea.sri.gob.ec/...";
        return "Taxpayer info for RUC: " + ruc;
    }
}
