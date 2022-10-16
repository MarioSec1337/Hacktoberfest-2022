import java.util.Scanner;

public class Math {

   public static void main(String[] args) {

       

       Scanner sc = new Scanner(System.in);

       

       System.out.println("Digit1: ");

       double Digit1 = sc.nextDouble();

       System.out.println("Digit2: ");

       double Digit2 = sc.nextDouble();

       double Sum = Digit1 + Digit2;

       double Difference = Digit1 - Digit2;

       double Product = Digit1 * Digit2;

       double Quotient = Digit1 / Digit2;

       double Remainder = Digit1 % Digit2;

       

       System.out.println("Sum: " + Sum);

       System.out.println("Difference: " + Difference);

       System.out.println("Product: " + Product);

       System.out.println("Quotient: " + Quotient);

       System.out.println("Remainder: " + Remainder);

       

       

   }

}

