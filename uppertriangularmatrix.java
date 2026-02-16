import java.util.Scanner;
    
public class uppertriangularmatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int [][] a= new int [n][n];
            for(int i=0; i<n;i++)
                for(int j=0; j<n; j++)
            a[i][j] = sc.nextInt();
   for(int i=0; i<n;i++){
            for(int j=0; j<n; j++)
                System.err.print(j>=i?a[i][j]+"":"0");
            System.out.println();
            
            }
        }

    }
}