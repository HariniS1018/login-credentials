package com.loginpackage;

public class LoginController extends SuperFuncs {
	public static void loginUser(){
		System.out.println("Enter your registered username: ");
		String user = input.next();
		System.out.println("Enter your password: ");
		String pwd = input.next();
		String pwd2 = getMd5(pwd);
		LoginMod modobj = new LoginMod();
		if(modobj.retrieveUser(user,pwd2))
			System.out.println("The entered username and password is valid");
		else
			System.out.println("The entered username and password is invalid");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
}

