package emailvalidationprog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
public static boolean isValidEmail(String email) {
	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(email);
	return matcher.matches();
}
public static void main(String[] args) {
	List<String> emails= new ArrayList<String>();
	
	emails.add("anabella@gey.com");
	emails.add("stephie@gey.com");
	emails.add("john@gey.com");
	
	emails.add("ashg.gey.com");
	emails.add("yree@gey.com");
	
	for (String value : emails) {
		System.out.println("email address: "+value+" is "+(isValidEmail(value)?"valid" : "invalid"));
	}
	System.out.println("enter any email address for checking");
	Scanner scan = new Scanner(System.in);
	String input= scan.nextLine();
	System.out.println("email address "+input + "is"+(isValidEmail(input)?"valid" : "invalid"));
}
}
