public class Shift1{
public static void main(String[]args){
int a=10;
System.out.println("left shift :"+(10<<1));
System.out.println("right shift:"+(10>>1));
int s=-10;
System.out.println("unsigned right shift:"+(s>>>1)); 
System.out.println("***************************");
System.out.println(Integer.toBinaryString(10<<1));
System.out.println(Integer.toBinaryString(10>>1));
System.out.println(Integer.toBinaryString(10>>>1));




}
}