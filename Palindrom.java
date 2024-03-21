public class Palindrom{
public static void main(String[] args){
int num;
int rem;
int rev=0;

num=121;
int num1=num;
while(num>0){
rem=num%10;
num=num/10;
rev=rev*10+rem;

}
System.out.println(rev);
if(num1==rev){
	
	System.out.println("palindrome");
	
}
else
{
	System.out.println("not palindrome");
}

}

}