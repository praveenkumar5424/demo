import java.util.Scanner;

public class array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();               

        if (num % 2 == 0) {                   
            System.out.println("Even values");      
        } else {
            System.out.println("Odd val");       
        }

        sc.close();                           
    }
}


