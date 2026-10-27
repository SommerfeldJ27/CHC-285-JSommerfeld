import java.util.Scanner;
public class wow
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        String phone = inputPhoneNum();
        System.out.println("You Input Your Number As: " + phone);
        String newPhone = remove(phone);
        System.out.println("The Phone Number Is: " + newPhone);

        if (checkLength(newPhone) == false)
        {
            System.out.println("Invalid Phone Number Please Try Again.");
            return;
        }

        String areacode = newPhone.substring(0, 3);
        String exchange = newPhone.substring(3, 6);
        String linenumber = newPhone.substring(6, 10);

        printOutput(areacode, exchange, linenumber);

        sc.close();
    }

    private static String inputPhoneNum()
    {
        System.out.print("Enter Phone Number: ");
        return sc.nextLine().strip();
    }

    private static String remove(String phone)
    {
        String newPhone = "";

        for (int i = 0; i < phone.length(); i++)
        {
            char num = phone.charAt(i);

            if (num >= '0' && num <= '9')
            {
                newPhone += num;
            }
        }

        return newPhone;
    }

    private static boolean checkLength(String phone)
    {
        return phone.length() == 10;
    }

    private static void printOutput(String areacode, String exchange, String linenumber)
    {
        System.out.println("The area code is " + areacode + ", the exchange is " + exchange + " and the line number is " + linenumber);
    }
}
