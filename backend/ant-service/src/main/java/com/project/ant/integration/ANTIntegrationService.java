package com.project.ant.integration;

import org.springframework.stereotype.Service;

@Service
public class ANTIntegrationService {

    public Object fetchPoints(String cedula) {
        // Scraping / HTTP Request ANT
        return "License points for cedula: " + cedula;
    }
}
