package com.loginpackage;

public class LoginController extends SuperFuncs {
	public static void loginUser(){
		System.out.println("Enter your registered username: ");
		String user = input.next();
		System.out.println("Enter your password: ");
		String pwd = input.next();
		String securePwd = getMd5(pwd);
		LoginMod modobj = new LoginMod();
		if(modobj.retrieveUser(user,securePwd))
			System.out.println("The entered username and password is valid");
		else
			System.out.println("The entered username and password is invalid");
		}
	}	
}

