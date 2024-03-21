public class Reverse{
public static void main(String[]args){
int num=87659 ;
int rev=0;
int rem;
while(num>0){
rem=num%10;
num=num/10;
rev=rev*10+rem;


}
System.out.println(rev);
if(num==rev){
	
	System.out.println("palindrom");
	
}
else
	System.out.println("not palindrom");

}
}