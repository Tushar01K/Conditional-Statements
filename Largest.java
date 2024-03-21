public class Largest{
public static void main(String[]args){
int num=576;
int temp=0;

while(num>0){
 int rem=num%10;
 if(rem>temp)
 {temp=rem;}
 num=num/10;

}
System.out.println(temp);

}

}