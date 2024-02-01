public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int target=2;
        boolean bl=true;
        for (int j=0;j< nums.length;j++){
            if (nums[j]==target) bl=false;
        }
        int cnt=0;
        int i=0;
        while (i< nums.length){
            if (nums[i]<=target){
                if (bl==true){
                cnt=(i+1);
                } else if (bl==false) {
                    cnt=i;
                }
            }
            i++;
        }
        System.out.println(cnt);
    }
}
