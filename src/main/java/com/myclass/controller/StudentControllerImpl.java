package com.myclass.controller;

import java.util.List;
import java.util.Scanner;

import com.myclass.dao.StudentDao;
import com.myclass.entity.SinhVien;

public class StudentControllerImpl implements StudentController {
    StudentDao studentDao = null;
    public StudentControllerImpl(StudentDao studentDao) {
        // TODO Auto-generated constructor stub
        this.studentDao = studentDao;
    }

    public void insert() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên: ");
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scan.nextLine());

        System.out.println("Nhập email: ");
        String email = scan.nextLine();

        System.out.println("Nhập fullname: ");
        String fullname = scan.nextLine();

        System.out.println("Nhập address: ");
        String address = scan.nextLine();

        System.out.println("Nhập phone: ");
        String phone = scan.nextLine();
        SinhVien sv = new SinhVien(id, email, fullname, address, phone);
        studentDao.themSinhVien(sv);
    }

    public void printAll() {
        // TODO Auto-generated method stub
        List<SinhVien> listSV = studentDao.findAll();
        for (int i = 0; i<listSV.size(); i++) {
            SinhVien sv = listSV.get(i);
            System.out.println("Sinh viên thứ : " +(i+1));
            System.out.println("id: " + sv.getId());
            System.out.println("email: " + sv.getId());
            System.out.println("fullname: " + sv.getFullname());
            System.out.println("address: " + sv.getAddress());
            System.out.println("phone: " + sv.getPhone());
        }
    }

}
