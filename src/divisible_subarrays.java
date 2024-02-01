public class divisible_subarrays {
    public static void main(String[] args) {
        int[]arr={6,4,2,3,7};
        int target=5,cnt=0,j=0;
        int[]ans=new int[target];
        for (int i=0;i<arr.length;i++){
            int rem=arr[i]%target;
//            System.out.println(rem);
            cnt=rem;
            if (rem==cnt){
            j++;
            }
            ans[rem]=ans[rem]+j;
        }
        for (int k:ans){
            System.out.print(k+" ");
        }
    }
}
