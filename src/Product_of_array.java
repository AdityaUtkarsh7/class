//import java.util.Arrays;
import java.util.Scanner;

public class Product_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[]arr=new int[10000000];
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int[]ans=new int[a];
        long cnt=1;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (j!=i) cnt=cnt*arr[j];
            }
            ans[i]=(int)cnt;
            System.out.print(cnt+" ");
            cnt=1;
        }
//        Arrays.sort(ans);
//        int[]ans1=new int[a];
//        int o=ans.length-1;
//        for (int s=0;s<ans1.length;s++){
//            ans1[s]=ans[o];
//            o--;
//        }
//        for (int h:ans){
//            System.out.print(h+" ");
//        }
    }
}