import java.util.Scanner;

public class max_subarray_sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t>0){
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        if (bl(arr)==true){
        int q=totalsum(arr)-maxSubarraySum1(arr);
        System.out.println(q);
        }
        else System.out.println("0");
        t--;
    }
    }
    public static int maxSubarraySum1(int[] arr) {
//		int sum =0;//A
        int ans=Integer.MAX_VALUE;
        for (int s = 0; s < arr.length; s++) {
//			int sum = 0;//B
            for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
                int sum = 0;// C
                for (int i = s; i <= e; i++) {
//                    System.out.print(arr[i] + " ");
                    sum = sum + arr[i];
                    if (sum<ans) ans=sum;
                }
//                System.out.println("=>" + sum);
            }
        }
        return ans;
//        System.out.println(ans);
    }
    public static int totalsum(int[]a){
        int ttsum=0;
        for (int i=0;i< a.length;i++){
            ttsum+=a[i];
        }
        return ttsum;
//        System.out.println(ttsum);
    }
    public static boolean bl (int[]aaaa){
        boolean aa=true;
        for (int p=0;p<aaaa.length;p++){
            if (aaaa[p]>0) aa=true;
            else aa=false;
        }
        return aa;
    }

}
