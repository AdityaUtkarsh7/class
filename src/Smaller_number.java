import java.util.Arrays;

public class Smaller_number {
    public static void main(String[] args) {
        int[]arr={8,1,2,2,3};
        Arrays.sort(arr);
        int[]nums=new int[arr.length];
        int m=0;
        for (int a=0;a< arr.length;a++){
            int cnt=a;
            for (int k=0;k< arr.length;k++){
                if (arr[k]<arr[a]){
                    nums[m]++;
                    if (a!=cnt){
                        m++;
                    }
                }
            }
        }
        for (int q:nums){
            System.out.println(q);
        }
    }
}
