import java.util.Scanner;

public class identitymatrix {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int [][] a= new int [n][n];
            for(int i=0; i<n;i++)
                for(int j=0; j<n; j++)
            a[i][j] = sc.nextInt();
   boolean identity= true;
   for(int i=0; i<n;i++)
            for(int j=0;j<n;j++)
   if((i==j&&a[i][j]!=1)||(i!=j&&a[i][j]!=0));
   identity=false;
   System.out.print(identity);
        }
}
}