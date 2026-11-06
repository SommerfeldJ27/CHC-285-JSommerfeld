import java.util.Scanner;
import java.util.Arrays;
public class StaticArraysJAS
{
    public static void main(String[] args)
    {
        //Premade list created by me
        int[] list1 = {1,2,3,4,5};
        Arrays.sort(list1);

        //Static list created by user input
        Scanner sc = new Scanner(System.in);
        System.out.print("How long would you like your list to be: ");
        int size = sc.nextInt();
        int[] list2 = new int[size]; //List is made
        for(int i = 0; i < list2.length; i++) //For loop allows user to add list2 to the list
        {
            System.out.print("Enter a number: ");
            list2[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(list2);

        //Print method call
        printList(list1);
        System.out.println(); //Gives space in between work for termina readablility
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
