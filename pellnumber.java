package Conditional;

public class pellnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=15;i++) {
		int c=a+b*2;
		a=b;
		b=c;
		System.out.println(c);
		}
	
	}

}
