package com.crud.jdbc.project.controller;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Book Store Management System");
		System.out.println("Enter your option as you wish");
		System.out.println("1.Admin\n2.ProductOwner\n3.customer\n4.Product");
		int option = sc.nextInt();

		switch (option) {

		case 1: {
                 AdminController admin=new AdminController();
			admin.main(args);
		}
			break;

		case 2: {

		}
			break;

		case 3: {

		}
			break;

		case 4: {

		}

		}

	}
}
