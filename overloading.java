class overloading{

void add(){
int a=10;
int b=20;
System.out.println(a+b);
}

void add(int a,int b){

System.out.println(a+b);
}

public static void main(String [] args){

overloading obj = new overloading();
obj.add(40,80);
obj.add();



}
}