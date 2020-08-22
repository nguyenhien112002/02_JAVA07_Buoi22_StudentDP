package com.myclass.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.myclass.controller.StudentController;
import com.myclass.controller.StudentControllerImpl;
import com.myclass.dao.StudentDao;
import com.myclass.dao.StudentDaoImpl;
import com.myclass.entity.SinhVien;

@ComponentScan("com.myclass")
public class AppConfig {
    public List<SinhVien> students(){
        List<SinhVien> listSV = null;
        listSV = new ArrayList<SinhVien>();
        listSV.add(new SinhVien(1, "test1@gmail.com", "nguyen van A", "HN", "0968148196"));
        listSV.add(new SinhVien(2, "test2@gmail.com", "nguyen van B", "DN", "0968148198"));
        listSV.add(new SinhVien(3, "test3@gmail.com", "nguyen van C", "HCM", "0968148199"));
        return listSV;
    }
}
