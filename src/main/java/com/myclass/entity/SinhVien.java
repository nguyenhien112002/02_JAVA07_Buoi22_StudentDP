package com.myclass.entity;

public class SinhVien {
    public SinhVien() {
        super();
        // TODO Auto-generated constructor stub
    }

    private int id;
    private String email;
    private String fullname;
    private String address;
    private String phone;
    
    public SinhVien(int id, String email, String fullname, String address, String phone) {
        super();
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
