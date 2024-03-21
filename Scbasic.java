import java.util.Scanner;
public class Scbasic{
public static void main(String []args){

System.out.println("enter a number");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println("you typed :"+num);

System.out.println("enter a floating point number");
float f=sc.nextFloat();
System.out.println("you typed :"+f);

System.out.println("enter a String");
String s =sc.next();
System.out.println("you typed :"+s);
//reading char datatype
System.out.println("enter a char");
char c =sc.next().charAt(0);
System.out.println("you typed :"+c);
sc.close();

}
}