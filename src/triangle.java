import java.util.Scanner;

public class triangle
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter side a: ");
      int a = sc.nextInt();

      System.out.print("Enter side b: ");
      int b = sc.nextInt();

      System.out.print("Enter side c: ");
      int c = sc.nextInt();

      if (a * a + b * b == c * c)
      {
         System.out.println("Right triangle: true");
      }
      else
      {
         System.out.println("Right triangle: false");
      }

      sc.close();
   }
}