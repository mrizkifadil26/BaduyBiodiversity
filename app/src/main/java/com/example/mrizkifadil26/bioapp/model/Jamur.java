package com.example.mrizkifadil26.bioapp.model;

import java.util.List;

public class Jamur {

    private int id;
    private String namaLokal;
    private String namaIlmiah;
    private List<String> lokasi;
    private List<String> manfaat;
    private double uv;
    private int gambar;

    public Jamur(int id, String namaLokal, String namaIlmiah, List<String> lokasi, List<String> manfaat, double uv, int gambar) {
        this.id = id;
        this.namaLokal = namaLokal;
        this.namaIlmiah = namaIlmiah;
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

    public List<String> getLokasi() {
        return lokasi;
    }

    public void setLokasi(List<String> lokasi) {
        this.lokasi = lokasi;
    }

    public List<String> getManfaat() {
        return manfaat;
    }

    public void setManfaat(List<String> manfaat) {
        this.manfaat = manfaat;
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
