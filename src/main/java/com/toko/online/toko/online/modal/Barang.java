package com.toko.online.toko.online.modal;

import javax.persistence.*;

@Entity
@Table(name = "Barang")
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long No;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price")
    private Float price=0f;

    @Column(name = "count")
    private Integer count=0;

    @Column(name = "reting")
    private Integer reting=0;

    @Lob
    @Column(name = "deskripsi", nullable = false)
    private String deskripsi;

    @Column(name = "publish")
    private Boolean publish;

    @Override
    public String toString() {
        return "Barang{" +
                "No=" + No +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", reting=" + reting +
                ", deskripsi='" + deskripsi + '\'' +
                ", publish=" + publish +
                '}';
    }

    public Long getNo() {
        return No;
    }

    public void setNo(Long no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getReting() {
        return reting;
    }

    public void setReting(Integer reting) {
        this.reting = reting;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }
}
