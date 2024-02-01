public class subarrays {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int c=0;
        int j=0;
        while (j<4){
            int i=0;
            while (i<c){
                System.out.println(arr[j]+arr[i]);
                i++;
            }
            j++;
            c++;

        }
    }
}
