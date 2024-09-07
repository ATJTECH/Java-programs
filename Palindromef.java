import java.util.Scanner;
public class Palindromef
{
 public static void main(String[] arg)
 {
  int f=0;
  Scanner reader=new Scanner(System.in);
  System.out.println("Enter a string");
  String str=reader.nextLine();
  int l=str.length();
  for(int i=0;i<l/2;i++)
  if(str.charAt(i)!=str.charAt(l-i-1))
  {
       f=1;
       break;
  }
  if(f==1)
      System.out.println("Not a string palindrome");
   else
      System.out.println("String palindrome");
 }
}
