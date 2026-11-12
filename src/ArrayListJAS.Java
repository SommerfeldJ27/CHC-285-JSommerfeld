import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListJAS
{
    public static void main(String[] args)
    {
        ArrayList <String> list = new ArrayList <String>();
        //Static list created by user input
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        while (option != ("Stop"))
        {
            System.out.print("Enter a word: ");
            option = sc.nextLine();
            list.add(option);
        }
        sc.close();
        Collections.sort(list);
        System.out.println(list);
    }
}
