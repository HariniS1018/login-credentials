package com.loginpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SuperFuncs{
  static Scanner input = new Scanner(System.in);
  Connection con = DriverManager.getConnection('jdbc:sql://localhost:3306/AU","Student","root"');
	
  public static boolean checkPattern(String name,String pwd) {
		 String pattern1 = "[a-z0-9A-Z_]{5,20}";
		 String pattern2 = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[_@!#$%]).{5,20}";
		 boolean result = false;
		 if(Pattern.matches(pattern1,name) && Pattern.matches(pattern2,pwd))
       result = true;
		 else
			 result = false;
		return result;
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
