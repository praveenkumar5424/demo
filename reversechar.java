import java.util.Scanner;

class reversechar {
     public static void main(String[] args) {
        Scanner kbd= new Scanner(System.in);
        char arr[];
        arr=new char[4];
        for(int i=0;i<4;i++){
            arr[i]=kbd.next().charAt(i);}
            for(int i=0;i<4;i++){
                System.out.print(arr[i]+" ");
            }
            kbd.close();
        }
        static void reverseString(char[] s){
        int i=0; int j=s.length-1;
        while (i>j){
            char temp=s[i];
            s[i]=s[j];
            s[j]= temp;
            i++;
            j--;
        }
    }
    }
 