import java.util.Scanner;
public class Portfolio2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while (choice != 6)
        {
            System.out.println("Welcome to The Tournament! Please select from the following options: ");
            System.out.println("1. View Teams");
            System.out.println("2. Register a Team");
            System.out.println("3. Remove a Team");
            System.out.println("4. View Players");
            System.out.println("5. Tournament Breakdown");
            System.out.println("6. Close Up");
        }
    }
}
