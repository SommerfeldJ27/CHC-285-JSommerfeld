import java.util.Scanner;
public class piJAS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your N value: ");
        double e = .000001;
        int N = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++)
        {
            sum += Math.pow(-1, i) / (2 * i + 1);
        }
        System.out.println("The approximation for pi/4 is " + sum);
        System.out.println(Math.abs(sum - Math.PI/4) < e);
        sc.close();
    }
}