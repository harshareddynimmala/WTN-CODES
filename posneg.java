import java.io.*;
import java.util.*;
class posneg
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  if(a==0)
  {
    System.out.println(a+" is neither negative or positive ");
  }
  else if(a>0)
  {
    System.out.println(a+" is a positive number");
  }
else
{
 System.out.println(a+" is a negative number");
}
}
}