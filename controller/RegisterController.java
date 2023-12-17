package com.loginpackage;
import java.util.Scanner;

public class RegisterController extends Funcs {
	public static void registerUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your user name: ");
		String name = input.next();
		System.out.println("Enter a valid password: ");
		String pwd = input.next();
		if(checkPattern(name,pwd) == true) {
			String pwd2 = getMd5(pwd);
			RegisterMod modobj = new RegisterMod();
      			modobj.storeUser(name, pwd2);
		}
		else {
			System.out.println("Your username or password is not in required format");
			System.out.println("Your username must contain a lowercase, an uppercase and a digit");
			System.out.println("Your password must satisfy the following criteria:");
			System.out.println("\n 1.Your password length must be above 8 and below 20 characters\n 2.Your pwd should contain a lowercase an uppercase and a digit");
			System.out.println("3. It must also contain a special character excluding whitespaces\n");
		}
	}
}
