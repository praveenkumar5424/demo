import java.util.Scanner;

public class rowwithmaximumsum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r= sc.nextInt();
            int c= sc.nextInt();
            int [][] a= new int [r][c];
            for(int i=0; i<r;i++)
                for(int j=0; j<c; j++)
            a[i][j] = sc.nextInt();
   int maxsum=  Integer.MIN_VALUE;
   for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++)
                sum +=a[i][j];
            if(sum>maxsum){
                maxsum=sum;
                
            }
            }
        }
        char[] index = null;
        System.out.print(index);
    }
}