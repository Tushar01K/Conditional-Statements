package Conditional;

public class Maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5;
		int num2=7;
		int num3=9;
		if(num1>num2 && num1>num3) {
			
			System.out.println("num1 is greater than num2 & num3  ");
		}
		else if(num2>num1 && num2>num3) {
			
			
			System.out.println("num2 is greater than num1 &num3");
		}
		else if (num3>num1 & num3>num2) {
			System.out.println("num3 is greater than num1 & num2" +"   num3 is   "+num3);
		}
		else {
			
			System.out.println("bye");
		}
	}

}
