import java.util.Scanner;

public class next_permutation1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test= sc.nextInt();
        for (;test>0;test--){
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
        int i=arr.length-2;
        int temp=0;
        while (true){
             if (arr[i]<arr[i+1]) {
                temp=i;
                break;
            }
             if (i==0){
                 reverse(arr,i);
                 break;
             }
            i--;
        }
        swap_in(arr,temp,temp+1);
        if ((temp+2)< arr.length){
            reverse(arr,temp+1);
        }
//        System.out.println(temp);
        for (int k:arr){
            System.out.print(k+" ");
        }
        }
    }
    public static void swap_in(int[] a, int b, int c) {
        int d = a[b];
        a[b] = a[c];
        a[c] = d;

    }
    public static void reverse(int[] arr,int i) {
//        int i = 0;
        int j = arr.length - 1;
        while (i < arr.length - 1) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
