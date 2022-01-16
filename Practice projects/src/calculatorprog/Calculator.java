package calculatorprog;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		double n1,n2,res;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the operator(+ , - , * , /)");
		operator = input.next().charAt(0);
		System.out.println("enter the two numbers ");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		input.close();
		switch(operator) {
		case '+':
			res = n1+n2;
			System.out.println(n1+ "+" +n2+ "=" +res);
			break;
			
		case '-':
			res = n1-n2;
			System.out.println(n1+ "-" +n2+ "=" +res);
			break;

		case '*':
			res = n1*n2;
			System.out.println(n1+ "*" +n2+ "=" +res);
			break;
			
		case '/':
			res = n1/n2;
			System.out.println(n1+ "/" +n2+ "=" +res);
			break;
			
		default:
			System.out.printf("It is an invalid operater",operator);
		}
	}
}
