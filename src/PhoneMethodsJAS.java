import java.util.Scanner;
public class PhoneMethodsJAS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a telephone number: ");
        String phone = sc.nextLine();
        System.out.println("You Entered: " + phone);
        String newPhone = cleanUp(phone);
        checkPhone(newPhone);
        sc.close();
    }

    public static String cleanUp(String phone)
    {
        String newPhone = "";

        for (int i = 0; i < phone.length(); i++)
        {
            if ((phone.charAt(i) >= '0' && phone.charAt(i) <= '9') || phone.charAt(i) == '(' || phone.charAt(i) == ')' || phone.charAt(i) == '-')
            {
                newPhone += phone.charAt(i);
            }
        }
        return newPhone;
    }

    public static void checkPhone(String newPhone)
    {
        if (newPhone.length() != 13)
        {
            System.out.println("Uh oh: Phone number isn't the right length/format");
            System.out.println("It should look something like this: (xxx)xxx-xxxx");
        }
        else if (newPhone.charAt(0) != '(')
        {
            System.out.println("Uh oh: Perenthesis aren't in the right spot");
            System.out.println("It should look something like this: (xxx)xxx-xxxx");
        }
        else if (newPhone.charAt(4) != ')')
        {
            System.out.println("Uh oh: Perenthesis aren't in the right spot");
            System.out.println("It should look something like this: (xxx)xxx-xxxx");
        }
        else if (newPhone.charAt(8) != '-')
        {
            System.out.println("Uh oh: Dash isn't in the right spot");
            System.out.println("It should look something like this: (xxx)xxx-xxxx");
        }
    }
    public static void printOutput(String newPhone)
    {
            String areaCode = newPhone.substring(1, 4);
            String exchange = newPhone.substring(5, 8);
            String lineNumber = newPhone.substring(9, 13);

            System.out.println("Area code: " + areaCode);
            System.out.println("Exchange: " + exchange);
            System.out.println("Line number: " + lineNumber);
            System.out.println("Phone number: " + newPhone);
    }
}