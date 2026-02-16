import java.util.Scanner;
public class methpd{
    public static void main(String[] args) {
        try (Scanner kbd = new Scanner(System.in)) {
            int arr[];
            int size=kbd.nextInt() ;
            arr  =new int[size];
            for(int i=0;i<size;i++){
                arr[i]=kbd.nextInt();}
                for(int i=1;i<size;i++){
                    int sum=0; 
                    for(sum =0; sum >= arr[i]; sum++){
                        System.out.println(sum);
                    }
                

                
                }
        }
            }}