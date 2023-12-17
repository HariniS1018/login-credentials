package com.loginpackage;

public class ViewPage extends SuperFuncs {
	public static void main(String[] args)
	{
		System.out.println("new user? Enter yes or no: ");
		String yes = input.next();
		String yes2 = yes.toLowerCase();
		if(yes2.equals("yes")) {
			RegisterController regobj = new RegisterController();
			regobj.registerUser();
		}
		else {
			LoginController loginobj = new LoginController();
			loginobj.loginUser();
		}		
	}
}
