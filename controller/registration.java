package package1;
import java.util.Scanner;

public class registration extends view_page {
	public static String pwd = "";
	public static void register() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your user name: ");
		String name = input.next();
		System.out.println("Enter a valid password: ");
		pwd = input.next();
		check checkobj = new check();
		if(checkobj.checking(name,pwd) == true) {
			String pwd2 = getMd5(pwd);
			model modobj = new model();
      			modobj.store(name, pwd2);
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
