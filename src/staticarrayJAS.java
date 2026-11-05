import java.util.Scanner;
public class staticarrayJAS
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How long will the list be: ");
        int numberOfGrades = sc.nextInt();
        int grade[] = new int[numberOfGrades];
        double sum = 0, average = 0;
        int inputGrade;

        for(int n = 0; n < numberOfGrades; n++)
        {
            System.out.print("Input grade #" + (n + 1) + ": ");
            inputGrade = sc.nextInt();
            if (inputGrade > 100 || inputGrade < 0)
            {
                n--;
                System.out.print("Invalid input try again");
            }
            else
            {
                grade[n] = inputGrade;
                sum = sum + grade[n];
            }
        }
    }
}