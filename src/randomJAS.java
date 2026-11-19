import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class randomJAS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.print("Enter a num for random list size: ");
        int option = sc.nextInt();
        double sum = 0.0;
        Random rnd = new Random();
        for (int i = 0; i < option; i++)
        {
            list.add(rnd.nextInt(option) + 1);
            sum = sum + (int)list.get(i);
        }
        System.out.println(list);
        double avg = sum/list.size();
        System.out.println("Average is: " + avg);
        sc.close();
    }
}