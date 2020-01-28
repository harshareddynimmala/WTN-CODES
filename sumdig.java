import java.util.*;
class sumdig
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int sum=0;
  int b;
  b=a;
  while(a!=0)
  {
   sum=sum+a%10;
   a=a/10;  
  }
  System.out.println("The sum of the digits of "+b+" is "+sum);
 }
}