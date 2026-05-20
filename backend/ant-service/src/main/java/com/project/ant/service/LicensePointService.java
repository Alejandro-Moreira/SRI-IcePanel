package com.project.ant.service;

import com.project.ant.cache.CacheManager;
import com.project.ant.integration.ANTIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicensePointService {

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private ANTIntegrationService antIntegrationService;

    public Object getLicensePoints(String cedula) {
        Object cached = cacheManager.getCachedData(cedula);
        if (cached != null) {
            return cached;
        }

        Object response = antIntegrationService.fetchPoints(cedula);
        cacheManager.save(cedula, response);
        return response;
    }
}
