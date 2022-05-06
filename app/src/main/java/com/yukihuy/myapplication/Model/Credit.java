package com.yukihuy.myapplication.Model;

import ml.huytools.lib.Annotation.JsonName;
import ml.huytools.lib.MVP.Model;

public class Credit extends Model {
    @JsonName
    private  int id;
    @JsonName
    private String ten_goi;
    @JsonName
    private int credit;
    @JsonName
    private int so_tien;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen_goi() {
        return ten_goi;
    }

    public void setTen_goi(String ten_goi) {
        this.ten_goi = ten_goi;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getSo_tien() {
        return so_tien;
    }

    public void setSo_tien(int so_tien) {
        this.so_tien = so_tien;
    }
}
