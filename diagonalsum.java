import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int [][] a= new int [n][n];
            for(int i=0; i<n;i++)
                for(int j=0; j<n; j++)
            a[i][i] = sc.nextInt();
   int sum=0;
   for(int i=0;i<n;i++)
            sum+=a[i][i];
   System.out.print(sum);
        }

}}