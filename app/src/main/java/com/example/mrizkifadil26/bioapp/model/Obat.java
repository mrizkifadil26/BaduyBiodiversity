package com.example.mrizkifadil26.bioapp.model;

import java.util.List;

public class Obat {

    private int id;
    private String namaLokal;
    private String namaIlmiah;
    private String famili;
    private String penyakit;
    private String bagianTanaman;
    private String caraPenggunaan;
    private String uv;
    private int gambar;

    public Obat(int id, String namaLokal, String namaIlmiah, String famili, String penyakit, String bagianTanaman, String caraPenggunaan, String uv, int gambar) {
        this.id = id;
        this.namaLokal = namaLokal;
        this.namaIlmiah = namaIlmiah;
        this.famili = famili;
        this.penyakit = penyakit;
        this.bagianTanaman = bagianTanaman;
        this.caraPenggunaan = caraPenggunaan;
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

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public String getBagianTanaman() {
        return bagianTanaman;
    }

    public void setBagianTanaman(String bagianTanaman) {
        this.bagianTanaman = bagianTanaman;
    }

    public String getCaraPenggunaan() {
        return caraPenggunaan;
    }

    public void setCaraPenggunaan(String caraPenggunaan) {
        this.caraPenggunaan = caraPenggunaan;
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
