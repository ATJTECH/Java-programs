import java.util.Scanner;
class Exceptionprogram
{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int x,a,b,r,f=1;
 do
 {
 	System.out.println("Enter your choice \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
 	x=sc.nextInt();
 	System.out.println("Enter the first no.");
 	a=sc.nextInt();
 	System.out.println("Enter the second no.");
 	b=sc.nextInt();
    switch(x)
 	{
  		case 1:
          		r=a+b;
          		System.out.println("The sum is "+r);
          		break;
   		case 2:
          		r=a-b;
          		System.out.println("The difference is "+r);
          		break;
   		case 3:
          		r=a*b;   
          		System.out.println("The multiplication result is "+r);
          		break;
   		case 4:
          		try
          		{
            		x=a/b;
            		System.out.println("The division result is "+ x);
            
          		}
          		catch(ArithmeticException e)
          		{
            		System.out.println("Error occured");
          		}
          		break;
   		default:
          		System.out.println("wrong choice");
          		break;
           
   }
   System.out.println("Do you want to continue 1/0 ");
   f=sc.nextInt();
 }while(f==1);
}
}
