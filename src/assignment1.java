import java.util.Scanner;
public class assignment1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a telephone number: ");
        String phone = sc.nextLine();
        String newPhone = "";

        for (int i = 0; i < phone.length(); i++)
        {
            char ch = phone.charAt(i);
            if (Character.isDigit(ch) || ch == '(' || ch == ')' || ch == '-')
            {
                newPhone += ch;
            }
        }

        if (newPhone.length() != 13)
        {
            System.out.println("Uh oh: Phone number isn't the right length");
        }
        else if (newPhone.charAt(0) != '(')
        {
            System.out.println("Uh oh: Perenthesis aren't in the right spot");
        }
        else if (newPhone.charAt(4) != ')')
        {
            System.out.println("Uh oh: Perenthesis aren't in the right spot");
        }
        else if (newPhone.charAt(8) != '-')
        {
            System.out.println("Uh oh: Dash isn't in the right spot");
        }
        else
        {
            String areaCode = newPhone.substring(1, 4);
            String exchange = newPhone.substring(5, 8);
            String lineNumber = newPhone.substring(9, 13);

            System.out.println("Area code: " + areaCode);
            System.out.println("Exchange: " + exchange);
            System.out.println("Line number: " + lineNumber);
            System.out.println("Phone number: " + newPhone);
        }
        sc.close();
    }
}