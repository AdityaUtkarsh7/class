import java.util.Scanner;

public class minimum_swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
//        int[]arr={4,3,1,2};
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int k = i + 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == k && arr[i]!=(i+1)) {
                    swap_in(arr, i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
//        for (int r:arr){
//            System.out.print(r);
//        }
    }

    public static void swap_in(int[] a, int b, int c) {
        int d = a[b];
        a[b] = a[c];
        a[c] = d;

    }
}