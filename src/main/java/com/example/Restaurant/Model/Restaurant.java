package com.example.Restaurant.Model;

public class Restaurant {
    private String name;
    private String address;
    private int rid;
    private String speciality;
    private int totalStaffs;
    private int noOfSeats;
    private Double perDayIncome;

    public Restaurant()
    {

    }


    public Restaurant( String name, String address, int rid, String  speciality,int totalStaffs,int noOfSeats,Double perDayIcome) {
        this.name=name;
        this.address = address;
        this.rid=rid;
        this.speciality=speciality;
        this.totalStaffs=totalStaffs;
        this.noOfSeats=noOfSeats;
        this.perDayIncome=perDayIcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Double getPerDayIncome() {
        return perDayIncome;
    }

    public void setPerDayIncome(Double perDayIncome) {
        this.perDayIncome = perDayIncome;
    }
}