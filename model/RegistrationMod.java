package com.loginpackage;
public class RegistrationMod extends SuperClass {
	public static void store(String name,String pwd) {
    		try {
			PreparedStatement stmt = con.preparestatement("insert into security values(?,?");
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			System.out.println("your account has been successfully created to use....");
    		}
    		catch(Exception e){
    			System.out.println(e);
    		}
  }
}
