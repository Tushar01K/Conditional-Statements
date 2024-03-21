class Parent{
void parent(){
System.out.println("parent called");

}

}

class Inheritance extends Parent{

void child(){
System.out.println("child called");
}


public static void main(String [] args){


Inheritance obj = new Inheritance();
obj.child();
obj.parent();


}
}