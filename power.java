package Conditional;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=7;
		int power=2;
		int pow=(int)Math.pow(base, power);
		System.out.println(pow);
		int ans=1;
		for(int i=1;i<=power;i++) {
			ans=ans*base;
			
			
		}
		System.out.println(ans);

	}
	
}
