public class next_permutation {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,7,8};
        int i= arr.length-2,cnt=arr[arr.length-1],temp=0;
        while (i>=0){
            if (arr[i]>arr[i+1]){
                temp=i;
            }
            i--;
        }
        System.out.println(cnt);
        System.out.println(temp);
//        for (int k:arr){
//            System.out.print(k+" ");
//        }
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
