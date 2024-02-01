import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array_intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int[]arr1=new int[a];
        for (int i=0;i<a;i++){
            arr1[i]= sc.nextInt();
        }
//        int[]arr={1, 2, 3, 1, 2, 4, 1};
//        int[]arr1={2, 1, 3, 1, 5, 2, 2};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr1.length;j++){
                if (arr[i]==arr1[j]){
                    list.add(arr[i]);
                    arr[i]=0;
                    arr1[j]=0;
                }
            }
        }
        System.out.println(list);
    }
}