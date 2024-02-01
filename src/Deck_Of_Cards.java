import java.util.Arrays;

public class Deck_Of_Cards {
    public static void main(String[] args) {
        int []arr={1,1,1,2,1,3,3,2,2,2,3,3};
        Arrays.sort(arr);
        int j= arr.length;
        int[]nums=new int[j+5];
        int m=0;
        for (int a=0;a< arr.length;a++){
            for (int k=a+1;k< arr.length;k++){
                if (arr[k]==arr[a]){
                    nums[m]=arr[k];
                    m++;
                }
            }
        }
        for (int q:nums){
            System.out.println(nums);
        }
    }
}
