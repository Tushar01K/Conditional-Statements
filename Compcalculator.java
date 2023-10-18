package Conditional;
import java.util.Scanner;

public class Compcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st no.");
		int num1= sc.nextInt();
		System.out.println("enter operator");
		char ope=sc.next().charAt(0);
		System.out.println("enter 2nd no.");
		int num2=sc.nextInt();
		if(ope=='+') {
			System.out.println("ans:"+(num1+num2));
		}
		else if(ope=='-') {
			
			System.out.println("ans:"+(num1-num2));
		}
		else if (ope=='*') {
			System.out.println("ans:"+(num1*num2));
			
		}
		else if(ope=='/') {
			
			System.out.println("ans:"+(num1/num2));
		}
		else if(ope=='%') {
			System.out.println("ans:"+(num1%num2));
		}
		else {
			System.out.println("Give the correct operator");
		}
	}

}
