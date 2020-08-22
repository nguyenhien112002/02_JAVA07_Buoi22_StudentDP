package com.myclass.dao;

import java.util.List;

import com.myclass.entity.SinhVien;

public interface StudentDao {
    List<SinhVien> findAll();
    // in
    public void inDanhSachSinhVien();
    // thêm
    public void themSinhVien(SinhVien sv);
    // sửa
    public void suaSinhVien(SinhVien sv);
    // xóa
    public void xoaSinhVien(int id);
    // tìm kiếm
    public SinhVien timSinhVien(int id);
}
