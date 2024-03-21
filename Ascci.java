
public class Ascii{
public static void main(String[] args){
char ch='7';
if(ch>='a'&&ch<='z'){
System.out.println(ch+"is a lowercase alphabate");
}
else if(ch>='A'&&ch<='z'){
System.out.println(ch+"is a upperecase alphabate");
}
else if(ch>='0'&& ch<='9'){
System.out.println(ch+"is a number");
}
else{
System.out.println(ch+"is a symbol");
}
}
}