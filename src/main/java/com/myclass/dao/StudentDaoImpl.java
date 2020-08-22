package com.myclass.dao;

import java.util.ArrayList;
import java.util.List;

import com.myclass.entity.SinhVien;

public class StudentDaoImpl implements StudentDao {

    public void setListSV(List<SinhVien> listSV) {
        this.listSV = listSV;
    }

    List<SinhVien> listSV = null;

    public StudentDaoImpl() {
        listSV = new ArrayList<SinhVien>();
        listSV.add(new SinhVien(1, "test1@gmail.com", "nguyen van A", "HN", "0968148197"));
        listSV.add(new SinhVien(2, "test2@gmail.com", "nguyen van B", "DN", "0968148198"));
        listSV.add(new SinhVien(3, "test3@gmail.com", "nguyen van C", "HCM", "0968148199"));
    }

    public StudentDaoImpl(List<SinhVien> sv) {
        super();
        this.listSV = listSV;
    }

    public void inDanhSachSinhVien() {
        /*
         * for (SinhVien sv : listSV) { System.out.println("id: " + sv.getId());
         * System.out.println("email: " + sv.getId()); System.out.println("fullname: " +
         * sv.getFullname()); System.out.println("address: " + sv.getAddress());
         * System.out.println("phone: " + sv.getPhone()); }
         */
    }

    public List<SinhVien> findAll() {
        return listSV;
    }

    public SinhVien timSinhVien(int id) {
        for (SinhVien sv : listSV) {
            if (sv.getId() == id)
                return sv;
        }
        return null;
    }

    public void themSinhVien(SinhVien sv) {
        // TODO Auto-generated method stub
        listSV.add(sv);
    }

    public void suaSinhVien(SinhVien sv) {
        // TODO Auto-generated method stub
        SinhVien entity = timSinhVien(sv.getId());
        if (entity != null) {
            entity.setAddress(sv.getEmail());
            entity.setFullname(sv.getFullname());
            entity.setAddress(sv.getAddress());
            entity.setPhone(sv.getPhone());
        }
    }

    public void xoaSinhVien(int id) {
        SinhVien entity = timSinhVien(id);
        if (entity != null) {
            listSV.remove(entity);
        }
    }
}
