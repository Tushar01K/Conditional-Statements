package Conditional;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s1=90;
int s2=80;
int s3=70;
int s4=60;
int s5=50;
int s6=60;
int total=s1+s2+s3+s4+s5+s6;
System.out.println("total marks: "+total);
double per=(total/600.0*100.0);
System.out.println("percentage: "+per);
if(per>=90) {
	
	System.out.println("A grade");
}
else if(per>=80) {
	System.out.println("B grade");
}
else if( per>=70) {
	
	System.out.println("C grade");
}
else if (per>=60) {
	System.out.println("D grade");
}
else {
	System.out.println("fail");
}
	}

}
