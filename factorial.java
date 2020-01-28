import java.io.*;
class factorial
{
 public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=n;
  long f=1;
  if(n==0)
  {
    System.out.println("The factorial of 0 is 1");
  }
else{
  do
  {
   f=f*n;
   n=n-1;
  }while(n!=0);
  System.out.println("The factorial of "+n+" is "+f);
 }
}
}