import java.util.*;
public class swap {
    public static void main(String[] args) {
        try (Scanner kbd = new Scanner (System.in)) {
            int size= kbd.nextInt();
            int arr[]= new int[size];
            for(int i=0; i<size; i++)
            arr[i]= kbd.nextInt();
            int [] res=swapadjpair(arr);
            System.out.println(Arrays.toString(res));
        }
}
static int[] swapadjpair(int[] a){
    for (int i=0; i<a.length-1; i=i+2){
        int temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;}
        return a;
}}
