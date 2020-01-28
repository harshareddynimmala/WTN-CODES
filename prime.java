import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a==0 || a==1)
{
  System.out.println(a+" is neither prime nor composite");
}
else
{
int count=0;
for(int i=1;i<=a;i++)
{
if(a%i == 0)
{
count=count+1;
}
}
if(count == 2)
{
System.out.println(a+" is a prime number");
}
else
{
System.out.println(a+" is not a prime number");
}
}
}
}