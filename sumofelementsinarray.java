import java.util.Scanner;
public class sumofelementsinarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row= sc.nextInt();
            int col= sc.nextInt();
            int arr[][]= new int [row][col];
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++)
                    arr[i][j]=sc.nextInt();
                }
                for (int i=0; i<row; i++){
                for (int j=0; j<col; j++)
                System.out.print(arr[i][j]+" ");
                System.out.println();

}
System.out.println("total sum: " +twoDsum(arr));
System.out.println("row sum: " );
rowSum(arr);
System.out.println("col sum: " );
colSum(arr);
        }
}
static int twoDsum(int a[][]){
    int sum=0;
    for(int i=0;i<a.length;i++){
        for (int j=0;j<a[i].length;j++)
        sum+=a[i][j];

    }
    return sum;
}

static void rowSum(int a[][]){
    for (int i=0; i<a.length;i++){
        int sum=0;
        for(int j=0;j<a[i].length;j++){
            sum+=a[i][j];
        }
            System.out.println(sum);
        }
    

}
static void colSum(int a[][]){
    for (int j=0; j<a[0].length;j++){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i][j];
        }
            System.out.println(sum);
        }
}}