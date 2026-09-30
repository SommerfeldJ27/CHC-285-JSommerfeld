import java.util.Scanner;

public class powersJAS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int power;

        do {
            System.out.print("What power? ");
            power = sc.nextInt();

            if (power == -1) {
                System.out.println("stop");
            } 
            else {
                int result = 1;
                int count = 0;

                do {
                    result = result * 2;
                    count++;
                } while (count < power);

                System.out.println(result);
            }

        } while (power != -1);

        sc.close();
    }
}
