package com.project.sri.controller;

import com.project.sri.service.SRIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sri")
public class SRIController {

    @Autowired
    private SRIService sriService;

    @GetMapping("/taxpayer/{ruc}")
    public ResponseEntity<?> getTaxpayerInfo(@PathVariable String ruc) {
        return ResponseEntity.ok(sriService.getTaxpayerInfo(ruc));
    }
}
