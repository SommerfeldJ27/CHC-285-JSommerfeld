import java.util.Scanner;
public class wow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = sc.nextLine();
        System.out.print("Enter your num");
        int num = sc.nextInt();
        while (name != "stop") {
            for (int i = 1; i <= num; i++) {
                System.out.println("Hello" + name);
            }
            System.out.print("Enter your num: ");
            num = sc.nextInt();
            System.out.println("Enter your name:");
            name = sc.nextLine();
            sc.close();
        }
    }
}