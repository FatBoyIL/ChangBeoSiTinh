package com.testapi.ChangBeoSiTinh.api.model;

public class dookki {
    private int id;
    private String gachien;
    private String comtron;
    private String nuocuong;

    public dookki(int id, String gachien, String comtron, String nuocuong) {
        this.id = id;
        this.gachien = gachien;
        this.comtron = comtron;
        this.nuocuong = nuocuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGachien() {
        return gachien;
    }

    public void setGachien(String gachien) {
        this.gachien = gachien;
    }

    public String getComtron() {
        return comtron;
    }

    public void setComtron(String comtron) {
        this.comtron = comtron;
    }

    public String getNuocuong() {
        return nuocuong;
    }

    public void setNuocuong(String nuocuong) {
        this.nuocuong = nuocuong;
    }
}
