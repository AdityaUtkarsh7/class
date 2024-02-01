import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
//        int ali=sc.nextInt();
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int s=0;
        int e=arr.length-1;
        int cnt=-1;
        int ali=sc.nextInt();
        while (s<e){
             int mid=(s+e)/2;
            if (arr[mid]==ali){
                System.out.println(mid);
                cnt=mid;
                break;
            }
//            else {
//                System.out.println(-1);
//            }
            if (ali>arr[mid]){
                s=mid+1;
            }
            if (ali<arr[mid]){
                e=mid-1;
            }
//            else {
//                System.out.println(-1);
//            }
        }
        if (cnt==-1) System.out.println(-1);
    }
}