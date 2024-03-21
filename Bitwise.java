public class Bitwise{
public static void main(String[] args){
int a =0b1111;
int b =0b1001;
//Bitwise AND
int bitwiseAnd = a & b;
int bitwiseOr = a | b;
int bitwiseXor = a ^ b;
System.out.println("Botwise AND : "+bitwiseAnd);
System.out.println("Botwise AND in binary : " +Integer.toBinaryString(bitwiseAnd));
System.out.println("Botwise OR : "+bitwiseOr);
System.out.println("Botwise XOR : "+bitwiseXor);
System.out.println("Botwise XOR : "+ Integer.toBinaryString(a));

}
}