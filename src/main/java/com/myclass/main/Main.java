package com.myclass.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myclass.config.AppConfig;
import com.myclass.controller.StudentController;

public class Main {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentController studentController = (StudentController)context.getBean("studentController");
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Chọn chức năng: ");
        System.out.println("1.In danh sách sinh viên: ");
        System.out.println("2.Thêm sinh viên: ");
        System.out.println("3.Sửa sinh viên: ");
        System.out.println("4.Xóa sinh vien: ");
        int choose = scan.nextInt();

        switch (choose) {
        case 1:
            studentController.printAll();
            break;
        case 2:
            studentController.insert();
            studentController.printAll();
            break;
        case 3:
            
            break;
        case 4:
            
            break;
        default:
            break;
        }
    }

}
