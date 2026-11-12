import java.util.Scanner;
import java.util.Arrays;
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

        Arrays.sort(list);
        System.out.println(list);
    }
}
"
        //Print method call

        System.out.print("list2: ");
        printList(list2);
        System.out.println(); //Gives space in between work for termina readablility

        //Average method call
        System.out.println("list1 Average: " + AverageList(list1));
        System.out.println("list2 Average: " + AverageList(list2));

    }

    public static void printList(int[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }

    public static double AverageList(int[] list)
    {
        double sum = 0, avg = 0;
        for (int i = 0; i < list.length; i++)
        {
            sum = sum + list[i];
        }
        avg = sum / list.length;
        return avg;
    }
}
"
