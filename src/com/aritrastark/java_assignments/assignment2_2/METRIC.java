package com.aritrastark.java_assignments.assignment2_2;

public class METRIC {
    private double km;
    private double mi;

    public void convertToKm(){
        this.km = this.mi*1.5;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getMi() {
        return mi;
    }

    public void setMi(double mi) {
        this.mi = mi;
    }

    public void convertToMile(){
        this.mi = this.km/1.5;
    }
}
