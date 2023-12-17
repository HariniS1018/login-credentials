package com.loginpackage;

public class LoginMod extends SuperFuncs{
	public static boolean retrieveUser(String name, String pwd){
		String dbuser, dbpass = null;
		boolean result = false;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select username,password from security where username = \" " + user + "\"");
			dbuser = rs.getString(1);
			dbpass = rs.getString(2);
			if(user.equals(dbuser)&& pwd.equals(dbpass))
			        result = true;
			else
			        result = false;
		}
    		catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
