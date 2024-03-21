import java.util.Scanner;
class prime3{
public  static void main(String []args){
Scanner sc=new Scanner(System.in);
int num;
boolean isPrime=true;
for (int i=0;i<10;i++){
isPrime =true;
System.out.println("enter a number ");
num =sc.nextInt();
for (int  j=2;j<num;j++){
if(num%j==0){
isPrime=false;
break;
}
}
if(isPrime)
System.out.println(num +"is prime");
else
System.out.println(num + "is not prime");
}
}
}