public class Decrement{
public static void main(String[] args){
	/* preincrement ++a first increment by 1,them use
	postincrement --a first use then increment by 1
	predecrement --a first decrement  by 1 then use
	post decrement a--first use then decrement by 1
	*/
int a=11;
int b=11;
int c=11;
int d=11;
System.out.println("post decrement a:"+ (a++));
System.out.println("Pre decrement b:"+(++b));
c++;
System.out.println("Post decrement c:" +c);
++d;
System.out.println("Post decrement d:" +d);
}
}