import java.io.*;
import java.util.Scanner;
class File
{
	public static void main(String args[])throws IOException
	{
		try
		{
			int y;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data to be entered to file");
			String x=sc.nextLine();
			sc.close();
			FileWriter fin=new FileWriter("text.txt");
			fin.write(x);
			System.out.println("Reading from file");
			FileReader fout=new FileReader("text.txt");
			while((y=fout.read())!=-1)
			{
		 		System.out.print((char)y);
			}
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		finally
  		{
  			System.out.println("Execution over");
  		}
	}
}
