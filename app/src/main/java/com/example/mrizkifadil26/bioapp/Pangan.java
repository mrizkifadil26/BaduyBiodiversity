package com.example.mrizkifadil26.bioapp;

import java.util.List;

public class Pangan {

    private String namaLokal;
    private String namaIlmiah;
    private String famili;
    private List fungsiUtama;
    private List fungsiSamping;
    private double uv;
    private int gambar;

    public Pangan(String namaLokal, String namaIlmiah, String famili, List fungsiUtama, List fungsiSamping, double uv, int gambar) {
        this.namaLokal = namaLokal;
        this.namaIlmiah = namaIlmiah;
        this.famili = famili;
        this.fungsiUtama = fungsiUtama;
        this.fungsiSamping = fungsiSamping;
        this.uv = uv;
        this.gambar = gambar;
    }

    public String getNamaLokal() {
        return namaLokal;
    }

    public void setNamaLokal(String namaLokal) {
        this.namaLokal = namaLokal;
    }

    public String getNamaIlmiah() {
        return namaIlmiah;
    }

    public void setNamaIlmiah(String namaIlmiah) {
        this.namaIlmiah = namaIlmiah;
    }

    public String getFamili() {
        return famili;
    }

    public void setFamili(String famili) {
        this.famili = famili;
    }

    public List getFungsiUtama() {
        return fungsiUtama;
    }

    public void setFungsiUtama(List fungsiUtama) {
        this.fungsiUtama = fungsiUtama;
    }

    public List getFungsiSamping() {
        return fungsiSamping;
    }

    public void setFungsiSamping(List fungsiSamping) {
        this.fungsiSamping = fungsiSamping;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
