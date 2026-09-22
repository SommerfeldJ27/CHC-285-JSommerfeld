import java.util.Scanner;

public class triangle
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter side 1: ");
      int side1 = sc.nextInt();
      System.out.print("Enter side 2: ");
      int side2 = sc.nextInt();
      System.out.print("Enter Side 3: ");
      int side3 = sc.nextInt();
      
      if (Math.pow(side1,2) + Math.pow(side2,2) == Math.pow(side3,2)) {
         System.out.println("Right Triangle");   
      } if (Math.pow(side3,2) + Math.pow(side2,2) == Math.pow(side1,2)) {
         System.out.println("Right Triangle");   
      } if (Math.pow(side1,2) + Math.pow(side3,2) == Math.pow(side2,2)) {
         System.out.println("Right Triangle");   
      } else {
        System.out.println("Not Right Triangle");
      }
      sc.close();
   }
}