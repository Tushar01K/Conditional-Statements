package Conditional;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
				int tempnum=num;
		int revnum=0;
		while(num>0) {
			
			int rem=num%10;
			revnum=revnum*10+rem;
			num=num/10;
			
		}
		System.out.println("reverse number :"+revnum);
		if(revnum==tempnum) {
			
			System.out.println("palindrom ");
		}
		else {
			
			System.out.println("not plndrom");
		}

	}

}
