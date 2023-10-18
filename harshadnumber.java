package Conditional;
import java.util.*;
public class harshadnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=47;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int  num=sc.nextInt();
		int tempnum=num;
		while(num>0) {
			
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
			
			
		}
		System.out.println("number=:"+sum);
if(tempnum%sum==0) {
			
			System.out.println("harshu");
		}
		else {
			
			System.out.println("not harshu");
		}
		
		

	}

}
