import java.util.Scanner;

public class minimum_sum_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int test= sc.nextInt();
//        while (test>0){
//            int a = sc.nextInt();
//            int b= sc.nextInt();
//            int[] arr = new int[a];
//            for (int i = 0; i < a; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int[] arr1 = new int[b];
//            for (int i = 0; i < b; i++) {
//                arr1[i] = sc.nextInt();
//            }
        int[]arr={2 ,3 ,7 ,10, 12, 15 ,30 ,34};
        int[]arr1={1, 5, 7, 8,10,15,16,19};
        int i=0,i1=0,totalsum=0,sum=0,sum1=0;
        while (i<arr.length && i1< arr1.length){
            if (arr[i]==arr1[i1]) {
                if (sum>sum1) {
                    totalsum+=sum+arr[i];
                    sum=0;
                    sum1=0;
                } else if (sum1>sum) {
                    totalsum+=sum1+arr1[i1];
                    sum=0;
                    sum1=0;
                }
                i++;
                i1++;
            }
            else if(arr[i]>arr1[i1]){
                sum1+=arr1[i1];
                i1++;
            } else if (arr1[i1]>arr[i]) {
                sum+=arr[i];
                i++;
            }
            if (i1==arr1.length){
                while (i< arr.length){
                    totalsum+=arr[i];
                    i++;
                }
            } else if (i==arr.length) {
                while (i1<arr1.length){
                    totalsum+=arr[i1];
                    i1++;
                }
            }
        }
        System.out.println(totalsum);
//        test--;
    }
//    }
}
