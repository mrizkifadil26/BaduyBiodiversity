package com.example.mrizkifadil26.bioapp.model;

import java.util.List;

public class Obat {

    private int id;
    private String namaLokal;
    private String namaIlmiah;
    private String famili;
    private List<String> penyakit;
    private List<String> bagianTanaman;
    private String caraPenggunaan;
    private double uv;
    private int gambar;

    public Obat(int id, String namaLokal, String namaIlmiah, String famili, List<String> penyakit, List<String> bagianTanaman, String caraPenggunaan, double uv, int gambar) {
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

    public List<String> getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(List<String> penyakit) {
        this.penyakit = penyakit;
    }

    public List<String> getBagianTanaman() {
        return bagianTanaman;
    }

    public void setBagianTanaman(List<String> bagianTanaman) {
        this.bagianTanaman = bagianTanaman;
    }

    public String getCaraPenggunaan() {
        return caraPenggunaan;
    }

    public void setCaraPenggunaan(String caraPenggunaan) {
        this.caraPenggunaan = caraPenggunaan;
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
