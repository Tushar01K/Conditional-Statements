public Basicsallary{
public static void main(Sring [] args){
foat basicsallary=10000;
float hra=0;
float da=0;
if(basicsallary<=10000){
hra= (float)(0.2*basicsallary);
da=(float)(0.8*basicsallary)
}
if(basicsallary<=20000){
hra =(float)(0.25*basicsallary);
da = (float)(0.9*basicsallary);
}
else
{
hra = (float)(0.3*basicsallary);
da =(float)(0.95*basicsallary);
}
floatgrossallary =basicsallary+da+hra;
System.out.println("Gross Sallary:"+grossallary)
}
}