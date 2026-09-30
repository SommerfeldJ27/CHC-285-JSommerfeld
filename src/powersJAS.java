import java.util.Scanner;
public class powersJAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your power: ");
        int num = sc.nextInt();
        while (num != -1) {
            int prod = 1;
            for (int i = 1; i <= num; i++) {
                prod *= 2;
            }
            System.out.println(num + " " + prod);
            System.out.print("Enter your power: ");
            num = sc.nextInt();
        }
    }
}