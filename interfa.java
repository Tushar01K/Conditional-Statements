interface Demo{

void add();



}
class interfa implements Demo{

 public void add(){
int a =10;
int b=20;
int c=a+b;
System.out.println(c);
}

public static void main(String [] arsg){

interfa obj = new interfa();
obj.add();
}

}