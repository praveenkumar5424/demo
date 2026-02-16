import java.util.Scanner;
public class diagonaltraversal {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int [][] a= new int [n][n];
            for(int i=0; i<n;i++)
                for(int j=0; j<n; j++)
            a[i][j] = sc.nextInt();
   for(int i=0; i<n;i++){
            
                System.out.print(a[i][i]+" ");
            System.out.println();
   }
        }
    }
}