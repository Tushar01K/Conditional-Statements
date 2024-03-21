public class Electricitybill{
public static void main(String[]args){
int units=30;
float totalbill,tbill,surcharge;
if(units<=50){
tbill=units*0.50f;
}
else if(units<=150){
tbill=((50*0.50f)+(units-50)*0.75f));
}
else if(units<=250){
tbill=((50*0.50f)+(100*0.75f)+(units-150)*1.20f);
}
else {
tbill=50*0.50f+100*0.75f+100*1.20f+(units-250)*1.50f;
}
System.out.println("bill : "+tbill);
surcharge = tbill*0.20f;
System.out.println("surcharge : "+surcharge);
totalbill =tbill+surcharge;
System.out.println("Total bill:"+totalbill);

}
}