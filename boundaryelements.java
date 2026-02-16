import java.util.Scanner;

    
public class boundaryelements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r= sc.nextInt();
            int c= sc.nextInt();
            int [][] a= new int [r][c];
            for(int i=0; i<r;i++)
                for(int j=0; j<c; j++)
            a[i][j] = sc.nextInt();
   for(int i=0; i<r;i++){
            for(int j=0; j<c; j++)
                System.out.print((i==0||j==0||i==r-1||j==c-1)? a[i][j]+"":" ");
            System.out.println();
   }
        }
}
}