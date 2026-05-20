package com.project.ant.model;

public class LicensePoints {

    private String cedula;
    private int points;
    private String status;

    public LicensePoints() {
    }

    public LicensePoints(String cedula, int points, String status) {
        this.cedula = cedula;
        this.points = points;
        this.status = status;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
