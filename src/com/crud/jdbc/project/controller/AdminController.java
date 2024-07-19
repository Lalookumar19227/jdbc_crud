package com.crud.jdbc.project.controller;

import java.util.Scanner;

import com.crud.jdbc.project.dao.AdminDao;
import com.crud.jdbc.project.dao.ProductDao;
import com.crud.jdbc.project.dto.Admin;

public class AdminController {
	public static void main(String[] args) {
		AdminDao dao = new AdminDao();
		Scanner sc = new Scanner(System.in);

		int id = 306;
		String email = "kul23@gmail.com";
		String password = "kul@123";
		Admin product = new Admin(id, email, password);
		Admin pruduct1 = dao.saveAdmindao(product);

		System.out.println("1.Login Admin");
		int input = sc.nextInt();

		switch (input) {
		case 1: {
			
			System.out.println("Username");

			String username = sc.next();

			System.out.println("Password");
			String password1 = sc.next();

			if (email == username && password == password1) {
				System.out.println("yes varify product owner");

			} else {
				System.out.println("plz. write correct username and password ");
			}
			
			System.out.println("1.Display All Product\n2.Display All ProductOwnwer\3.Display All Customer");
			int option =sc.nextInt();
			switch(option) {
			case 1:{
				
				ProductDao dao1=new ProductDao();
				dao1.displayAllProductDao();
				
				
				
				
				
				
			}break;
			case 2:{
				
			}break;
			
			case 3:{
				
			}
			
			
			
			
			}
			

		}

		}
	}

}
