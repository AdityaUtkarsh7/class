public class max_subarray_sum {
    public static void main(String[] args) {
        int[]arr={8 ,-8, 9 ,-9 ,10 ,-11 ,12};
        int k=totalsum(arr)-MinSubarraySum(arr);
//        System.out.println(k);
        System.out.println(MinSubarraySum(arr));
        maxSubarraySum1(arr);
    }
    public static int MinSubarraySum(int[] arr) {
        int sum = 0;
        int ans =Integer.MAX_VALUE;
        for (int ali : arr) {
            sum = sum + ali;
//            if (sum < 0) {
////                m,.
//                sum = 0;
//            }
            if(sum < ans) {
                ans = sum;
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
    public static void maxSubarraySum1(int[] arr) {
//		int sum =0;//A
        for (int s = 0; s < arr.length; s++) {
			int sum = Integer.MAX_VALUE;//B
            for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
//                int sum = 0;// C
                for (int i = s+1; i >= e; i++) {
//                    System.out.print(arr[i] + " ");
                    sum = sum + arr[i];
                }
//                System.out.println("=>" + sum);
            }
            System.out.println(sum);
        }
    }

}
