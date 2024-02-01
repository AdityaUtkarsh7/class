public class arraylist {
    public static void main(String[] args) {
        int[] arr = {9, 9, 1};
        int[] arr1 = {1, 1, 2, 34, 3};
        int [] ww=new int[arr1.length];
        int i=arr.length-1,j=arr1.length-1;
        while (j>=0 && i>=0){
            int q=arr[i]+arr1[j];
            ww[j]=(q)%10;
            arr1[j-1]=arr1[j-1]+q;
            System.out.println(ww[j]);
            i--;
            j--;
//            System.out.println();
        }
    }
}
