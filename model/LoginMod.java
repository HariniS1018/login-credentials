package com.loginpackage;

public class LoginMod extends SuperFuncs{
  public static boolean retrieveUser(String name, String pwd){
    String dbuser, dbpass = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select username,password from security where username = \" " + user + "\"");
			while(rs.next()) {
				dbuser = rs.getString(1);
				dbpass = rs.getString(2);
			}
			System.out.println(dbuser + " " + dbpass);
			if(user.equals(dbuser)&& pwd2.equals(dbpass))
        return true;
      else
        return false;
    }
    catch(NoSuchAlgorithmException e) {
			throw new RuntimeException (e);
		}
	}
}
