import java.util.Arrays;
import java.util.Scanner;

public class binary_search_by_me {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        int start=0;
        int index=-1;
        int end=a-1;
        int mid=(start+end)/2;
        while (start<end){
            if (arr[mid]>target) {
                end=mid;

            } else if (arr[mid]<target) {
                start=mid+1;
//                mid=(start+end)/2;
            }
            mid=(start+end)/2;
            if (arr[mid]==target) {
//                System.out.println(arr[mid]);
                index=mid;
                break;
            }
        }
        System.out.println(index);
    }
}
