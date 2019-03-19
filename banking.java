package practice;
class Practice
{
//function to add
public static double simple_inter(double P,double R,double t)
{
double result=0.0;
result=(P*R*t)/100;
return result;
}
public static double compound_inter(double P,double R,double t)
{
double result=0.0;
result=Math.pow((1+R/100),t);
result=result*P;
return result;
}
