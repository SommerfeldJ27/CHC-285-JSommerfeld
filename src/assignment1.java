import java.util.Scanner;
public class assignment1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        phone = phone.strip(); // Removes leading and trailing spaces

        int len = phone.length(); // Get phone length

        if (len != 10)
        {
            System.out.println("Not valid phone number. Please try again.");
        }
        else
        {
            System.out.println(phone);
        }
        sc.close();
    }
}
