public class Arrays {
    public static void main(String[] args) {
        int[]arr1={10,20,30,40,50};
        int[]arr2={1,2,3,4};
//        System.out.println(arr1[0]+" "+arr2[0]);
////        swap(arr1,arr2,2);
//        System.out.println(arr1[0]+" "+arr2[0]);
//        System.out.println(find(arr1,30));
//        System.out.println(reverse(arr1));
//        reverse(arr1);
        rotate(arr1);
        for (int r:arr1){
            System.out.println(r);
        }
    }
    public static void swap(int[]a,int[]b,int c){
        int temp=a[c];
        a[c]=b[c];
        b[c]=temp;
    }
    public static int find(int[] arr1,int ali){
        int cnt=0;
        for (int i:arr1){
            if (i==ali){
//                System.out.println(i);
                cnt=i;
            }
            else cnt=-1;
        }
        return cnt;
//        else System.out.println("-1");
    }
    public static void reverse(int[]n){
       int i=0;
       int j=n.length-1;
       while (i<=j){
           int temp=n[i];
           n[i]=n[j];
           n[j]=temp;
           i++;
           j--;
       }
    }
    public static void rotate(int[]arr){
        int a=arr[arr.length-1];
//        arr[0]=a;
        int i=arr.length-2;
        while (i<= 0){
//            int temp=arr[i+1];
            arr[i+1]=arr[i];
            i--;
        }
    }
}