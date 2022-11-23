package com.toko.online.toko.online.modal;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long No;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "age")
    private Integer age;

    @Lob
    @Column(name = "adress", nullable = false)
    private String adress;

    @Column(name = "Phone_number")
    private Integer phoneNumber;

    @Override
    public String toString() {
        return "User{" +
                "No=" + No +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Long getNo() {
        return No;
    }

    public void setNo(Long no) {
        No = no;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
