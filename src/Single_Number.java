import java.util.Arrays;

public class Single_Number {
    public static void main(String[] args) {
        int[]nums={1,2,3,2,3,50};
        Arrays.sort(nums);
        int len=nums[nums.length-1];
//        System.out.println(len);
        int[]arr=new int[len*len];
        for (int i=0;i< nums.length;i++){
            arr[nums[i]]++;
        }
        for (int j=0;j< arr.length;j++){
            if (arr[j]==1) System.out.println(j);
        }
    }
}