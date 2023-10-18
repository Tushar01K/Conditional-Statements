package Conditional;

public class kaparekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		int sq=num*num;
		int digcnt=0;
		int tempnum=num;
		while(num>0) {
			digcnt++;
			num=num/10;
			
			
		}
		//System.out.println("cnt of dig: "+digcnt);
		int div=(int)Math.pow(10, digcnt);
		int fpart=sq/div;
		int spart=sq%div;
		int add=fpart+spart;
		//System.out.println("add is: "+add);
		if(tempnum==add)
			System.out.println("number is kaprekar");
		else
			System.out.println("nmber is not kaprekar");

	}
	

}
