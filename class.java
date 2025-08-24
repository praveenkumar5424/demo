import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1;  // use long for large results
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
        sc.close();
    }
}



output
  Enter a number: 5
  Factorial of 5 is: 120

  Enter a number: 0
  Factorial of 0 is: 1

  Enter a number: -3
  Factorial is not defined for negative numbers.
