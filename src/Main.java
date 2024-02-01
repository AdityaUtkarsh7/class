//import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        reverse(arr);
        for (int w:arr){
            System.out.println(w);
        }
    }
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}