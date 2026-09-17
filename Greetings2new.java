/*
 *Greetings program
 */
 
import java.util.Scanner;
 
public class Greetings2new
{
   public static void main(String[] args)
   {
   Scanner sc = new Scanner(System.in);    //this line is the instantiation
                                             // sc is an instance of the
                                             // Scanner class
   System.out.print("Enter your first name: ");  // the String in double quotes
                                                 // is an argument
   String firstName = sc.nextLine();    // the sc object calls the nextLine method
                                             //  which is in the Scanner class
                                             // input from the keyboard is stored in 
                                             // a variable location called firstName
   System.out.print("Enter your last name: ");
   String lastName = sc.nextLine();
   System.out.println ("Hello, " + firstName + " " + lastName);
   
   /*  There are two types of String objects:
         1.literal String is in "word" double quotes
         2.variable String is populated at a pointer
         
         "adding" Strings is called "concatenation"  */
   System.out.println ("Congratulations on your third program!");
   }
}