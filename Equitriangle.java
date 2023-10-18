package Conditional;

public class Equitriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side1=10;
		int side2=20;
		int side3=20;
		if(side1==side2 && side2==side3 && side3==side1) {
			
			System.out.println("equilateral triangle");
		}
		else if(side1==side2 || side2==side3 ||side1==side3)
		{
			
			System.out.println("isoscelen triangle");
		}
		else {
			
			System.out.println("scalene triangle");
		}
	}

}
