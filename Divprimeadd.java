public class Divprimeadd{
public static void main(String []args){
	int num=20;
	int sum=0;
for(int i=3;i<num;i++){
if(i%3==0   || i%7==0)
sum=sum+i;
}
System.out.println(sum);
}

}