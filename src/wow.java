import java.util.Scanner;
public class wow	
{
	Scanner sc = new Scanner(System.in);	
	public static void main(String[] args)
		{
	// Input Telephone Number and Strip Excess Characters
			String phonenum = sayHello(); 
			System.out.println("The original telephone number was " + phonenum);
			String newtn = remove(phonenum);
			System.out.println("The new telephone number was " + newtn);
	
	// Check Length
			if (checkLength(newtn)==false)
			{
				System.out.println("The original telephone number of length " + newtn.length() + " was not the correct length." );
				System.exit(0);
			}
			
	// Check Parentheses and Dash	
			if (checkPosition(newtn)==false || checkRParen(newtn)==false)
			{
				System.out.println("The original telephone number did not have the parenthesis or dash in the correct position");
				System.exit(0);
			}
			
			checkDash(newtn);
			
	// Break Up and Print the Telephone Number
			String ac = newtn.substring(1,4);
			String ex = newtn.substring(5,8);
			String ln = newtn.substring(9);
			printOutput(newtn, ac, ex, ln);
		}
		
		
		
		
		
		
		
		
///methods	
//********************************************************
	static String sayHello()
	{
			System.out.println("Please enter the original telephone number: ");
			String input = inputPhoneNum();
			return input;
	}
	
//********************************************************	
	static String inputPhoneNum()
	{
			return (sc.readLine());
	}
	
//********************************************************
	static String remove(String x)
	{
		String newtn = "";
			for(int n=0; n<x.length(); n++)
			{
				if ((x.charAt(n) >= '0' && x.charAt(n) <= '9') || (x.charAt(n) == '(') || (x.charAt(n) == ')') || (x.charAt(n) == '-'))
				newtn+=x.charAt(n);
			}
			return newtn;
	}
	
//********************************************************	
	static boolean checkLength(String x)
	{
		boolean c = (x.length() == 13);
		return c;
	}
	
//********************************************************
	static boolean checkPosition(String x)
	{
		boolean d = (x.charAt(0) == '(');
		return d;
	}
	static boolean checkRParen(String x)
	{
		boolean e = (x.charAt(4) == ')');
		return e;
	}
	
//********************************************************
	static void checkDash(String x)
	{
			if (x.charAt(8) != '-')
			{
				System.out.println("The original telephone number did not have the parenthesis or dash in the correct position");
				System.exit(0);
			}
	}
	
//********************************************************
		static void printOutput(String newtn, String ac, String ex, String ln)
	{

			System.out.print("The area code is " + ac);
			System.out.print(", the exchange is " + ex);
			System.out.println(" and the line number is " + ln);
		}
}