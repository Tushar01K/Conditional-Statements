import java.util.Scanner;
public class Kaprekar{
public static void main(String[]args){}


int num=9;
int left=1;
int right=0;
int sum=0;
int d=1;
boolean isKaprekar=false;
System.out.println("enter a number");
Scanner sc =new Scanner(Syatem.in);
int num= sc.nextInt();
int square=num*num;

while(left!=0){
d=d*10;
right=square%d;
left =square/d;
sum=left+right;
if(sum==sum){
isKaprekar=true;
break;
}


}
if(isKaprekar)
	System.out.println(num+"isKaprekar");
else
	System.out.println(num+"is  not Kaprekar");



}


