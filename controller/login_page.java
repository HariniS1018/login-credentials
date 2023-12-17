package package1;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class login_page extends view_page {
	public static void log_in(){
		System.out.println("Enter your registered username: ");
		String user = input.next();
		System.out.println("Enter your password: ");
		String pwd = input.next();
		String pwd2 = getMd5(pwd);
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
				System.out.println("The entered username and password is valid");
			else
				System.out.println("The entered username and password is invalid");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
}

