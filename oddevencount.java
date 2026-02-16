import java.util.*;
public class oddevencount{
    public static void main(String[] args) {
        try (Scanner kbd = new Scanner (System.in)) {
            System.out.print("enter the range: ");
            int size= kbd.nextInt();
            int arr[]= new int[size];
            System.out.print("enter the numbers: ");
            for(int i=0; i<size; i++)
            arr[i]= kbd.nextInt();
            evenOddCount(arr);
        }}
        static void evenOddCount(int[] a){
            int len= a.length;

            int even = 0, odd=0;
            for(int i =0; i<len;i++){
                if (a[i]%2==0){
                even++;}
                else{
                 odd++;}
            }
            System.out.println("number of even numbers: " +even);
            System.out.println("number of odd numbers: " +odd);
        }


    }