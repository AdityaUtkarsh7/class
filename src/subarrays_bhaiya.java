public class subarrays_bhaiya {
    public static void main(String[] args) {
        int[]arr={10,20,30,40};

        for (int s=0;s< arr.length;s++){

            for (int e=s;e< arr.length;e++){
//                System.out.println(s+" "+e);
                int cnt=0;
                for (int i=s;i<=e;i++){
                    System.out.print(arr[i]+" ");
                     cnt=arr[i]+cnt;
                }
                System.out.println("=>"+cnt);
            }
//            System.out.println(cnt);
        }
//        System.out.println(cnt);
    }
}
