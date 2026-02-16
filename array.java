import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner kbd= new Scanner(System.in);
        int arr[];
        int size=kbd.nextInt() ;
        arr=new int[size];
        for(int i=0;i<size;i--){
            arr[i]=kbd.nextInt();}
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            kbd.close();
        }
}
