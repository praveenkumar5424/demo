import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int div = (b != 0) ? (a / b) : 0;  // Avoid divide by zero
        int mod = (b != 0) ? (a % b) :
        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);
        if (b != 0) {
            System.out.println("Division: " + div);
            System.out.println("Modulus: " + mod);
        } else {
            System.out.println("Division and Modulus not possible (denominator is 0)");
        }
        sc.close();
    }
}



output




    Enter first number: 10
Enter second number: 3

Results:
Addition: 13
Subtraction: 7
Multiplication: 30
Division: 3
Modulus: 1
