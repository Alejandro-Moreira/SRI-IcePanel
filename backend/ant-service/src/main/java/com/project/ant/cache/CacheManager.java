package com.project.ant.cache;

import org.springframework.stereotype.Service;

@Service
public class CacheManager {

    public Object getCachedData(String key) {
        // Redis lookup
        return null;
    }

    public void save(String key, Object value) {
        // Save in Redis
    }
}
