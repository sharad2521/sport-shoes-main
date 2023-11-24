package com.api.shoes;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class SportyShoesApplication {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);  
		
		String password = "admin";
		
		System.out.println("Enter admin password:	{Default password is admin}");
		String pass = sc.nextLine();
		
		while(!pass.equals(password)) {
			System.out.println("Bad Password!!");
			System.out.println("Enter admin password:");
			pass = sc.nextLine();
		}
		
		System.out.println("If you would like to reset password Enter 1 to proceed");
//		int i = 2;
		int j = 0;
		try {
			j = sc.nextInt();
		}catch(InputMismatchException e1) {
			System.out.println("Enter an integer");
		}
		while(j==1) {
			System.out.println("Enter old password:");
			sc.nextLine();
			pass = sc.nextLine();
			if(pass.equals(password)) {
				System.out.println("Enter new password of 5-10 characters:");
				try{
					password = sc.next("^.{5,10}$");
					password = sc.next();
				}catch(InputMismatchException e) {
					System.out.println("Enter password of 5-10 characters");
				}
				
				break;
			}
		}
		
		if(j==1) {
			System.out.println("Your password has been reset");
			System.out.println("Your password is "+password);
			System.out.println("Enter 1 to login again or otherwise to proceed");
			try {
				j = sc.nextInt();
			}catch(InputMismatchException e1) {
				System.out.println("Enter 1 or any integer");
			}
			
			while(j==1) {
				System.out.println("Enter admin password:");
				sc.nextLine();
				pass = sc.nextLine();
				if(pass.equals(password)) {
					System.out.println("Successfully logged in!!\n\n\n\n\n");
					break;
				}
			}
		}
		
		SpringApplication.run(SportyShoesApplication.class, args);
		
		sc.close();
	}

}
