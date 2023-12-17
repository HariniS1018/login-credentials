package package1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class view_page {
	static Scanner input = new Scanner(System.in);
	Connection con = DriverManager.getConnection('jdbc:sql://localhost:3306/AU","Student","root"');
	Statement st = con.createStatement();
	static ResultSet rs ;
	public static void main(String[] args)
	{
		System.out.println("new user? Enter yes or no: ");
		String yes = input.next();
		String yes2 = yes.toLowerCase();
		if(yes2.equals("yes")) {
			registeration regobj = new registeration();
			regobj.register();
		}
		else {
			login_page loginobj = new login_page();
			login_page.log_in();
		}		
		}
	public static String getMd5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("Md5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger no = new BigInteger(1,messageDigest);
			String hashtext = no.toString(16);
			while(hashtext.length()<32)
				hashtext = "0" + hashtext;
			return hashtext;
		}
		catch(NoSuchAlgorithmException e) {
			throw new RuntimeException (e);
		}
	}
}
