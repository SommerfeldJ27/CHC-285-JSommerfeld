import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListJAS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Step 1
        ArrayList <String> list = new ArrayList <String>();
        System.out.print("Enter a word: ");
        String option = sc.nextLine();
        while (!option.equals("stop"))
        {
            System.out.print("Enter a word: ");
            list.add(option);
            option = sc.nextLine();
        }
        Collections.sort(list);
        System.out.println(list);

        // Step 2
        ArrayList <String> newlist = new ArrayList <String>();
        System.out.print("Enter a word length: ");
        int num = sc.nextInt();
        for (String word : list)
        {
            if (word.length() == num)
            {
                newlist.add(word);
            }
        }
        Collections.sort(newlist);

        // Step 3
        System.out.println(newlist);
        while (!newlist.isEmpty())
        {
            newlist.remove(0);
            System.out.println(newlist);
        }
        sc.close();

        System.out.print("Initial List: ");
        System.out.println(list);
        System.out.print("New List: ");
        System.out.println(newlist);
    }
}