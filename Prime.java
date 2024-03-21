import java.util.Scanner;

public class Prime{
public static void main(String [] args){
System.out.println("enter a number");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
sc.close();
int count=0;
for(int i=2;i< num;i++){
if(num%i==0){
count++;
break;

}
}
if(count==0)
System.out.println(num+"is prime");
else
System.out.println(num +"is not prime");

}
}