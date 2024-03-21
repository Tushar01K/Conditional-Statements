public class Sumofdivisor{
public static void main(String[]args){
int sum=0;
int num=5;
for(int i=0;i<=num;i++){
for(int j=i;j<=i;j++){
if(i%j==0){
sum=sum+j;
}

}

}
System.out.println(sum);

}}