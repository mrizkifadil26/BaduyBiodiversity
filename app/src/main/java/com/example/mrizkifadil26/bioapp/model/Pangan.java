package com.example.mrizkifadil26.bioapp.model;

public class Pangan {

    private int id;
    private String namaLokal;
    private String namaIlmiah;
    private String famili;
    private String fungsiUtama;
    private String fungsiSamping;
    private String uv;
    private int gambar;

    public Pangan(int id, String namaLokal, String namaIlmiah, String famili, String fungsiUtama, String fungsiSamping, String uv, int gambar) {
        this.id = id;
        this.namaLokal = namaLokal;
        this.namaIlmiah = namaIlmiah;
        this.famili = famili;
        this.fungsiUtama = fungsiUtama;
        this.fungsiSamping = fungsiSamping;
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

    public String getFungsiUtama() {
        return fungsiUtama;
    }

    public void setFungsiUtama(String fungsiUtama) {
        this.fungsiUtama = fungsiUtama;
    }

    public String getFungsiSamping() {
        return fungsiSamping;
    }

    public void setFungsiSamping(String fungsiSamping) {
        this.fungsiSamping = fungsiSamping;
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
