package com.project.sri.model;

public class SriInfo {

    private String ruc;
    private String businessName;
    private String status;

    public SriInfo() {
    }

    public SriInfo(String ruc, String businessName, String status) {
        this.ruc = ruc;
        this.businessName = businessName;
        this.status = status;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
