import java.util.Scanner;
public class pi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your N value: ");
        int N = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++)
        {
            double term = Math.pow(-1, i) / (2 * i + 1);
            sum += term;
        }
        System.out.println("The approximation for pi/4 is " + sum);
        sc.close();
    }
}