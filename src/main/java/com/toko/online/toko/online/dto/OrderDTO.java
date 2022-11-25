package com.toko.online.toko.online.dto;

public class OrderDTO {
    private String pemilik;
    private String harga;
    private String nameBarang;



    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getNameBarang() {
        return nameBarang;
    }

    public void setNameBarang(String nameBarang) {
        this.nameBarang = nameBarang;
    }
}
