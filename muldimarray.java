import java.io.*;
class muldimarray
{
 public static void main(String args[])
 {
  int l=args.length;
  if(l<=8)
  {
   System.out.println("Enter 9 integers");
  }
  else
   {
    int max=0;
    int a;
    for(int i=0;i<=8;i++)
   {
    a=Integer.parseInt(args[i]);
    if(a>max)
    {
     max=a;
    }
   }
  System.out.println(max);
 }
}
} 