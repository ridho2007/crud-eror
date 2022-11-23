package com.toko.online.toko.online.modal;

import com.toko.online.toko.online.auditing.Auditable;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_barang", nullable = false)
    private String nameBarang;

    @Column(name = "harga")
    private Integer harga;

    @Column(name = "pemilik")
    private String pemilik;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", nameBarang='" + nameBarang + '\'' +
                ", harga=" + harga +
                ", pemilik='" + pemilik + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameBarang() {
        return nameBarang;
    }

    public void setNameBarang(String nameBarang) {
        this.nameBarang = nameBarang;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
}
