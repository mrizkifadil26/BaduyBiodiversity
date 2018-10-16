package com.example.mrizkifadil26.bioapp.model;

import java.util.List;

public class Jamur {

    private int id;
    private String namaLokal;
    private String namaIlmiah;
    private String famili;
    private String lokasi;
    private String manfaat;
    private String uv;
    private int gambar;

    public Jamur(int id, String namaLokal, String namaIlmiah, String famili, String lokasi, String manfaat, String uv, int gambar) {
        this.id = id;
        this.namaLokal = namaLokal;
        this.namaIlmiah = namaIlmiah;
        this.famili = famili;
        this.lokasi = lokasi;
        this.manfaat = manfaat;
        this.uv = uv;
        this.gambar = gambar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getManfaat() {
        return manfaat;
    }

    public void setManfaat(String manfaat) {
        this.manfaat = manfaat;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
