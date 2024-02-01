import java.util.Scanner;

public class buy_n_sell_real {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int min=arr[0];
        int maxprofit=Integer.MIN_VALUE;
        for (int i=1;i< arr.length;i++){
            if (arr[i]-min>maxprofit) maxprofit=arr[i]-min;
            if (arr[i]<min) min=arr[i];
        }
        System.out.println(maxprofit);
        System.out.println(min);
    }
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    odd_even(n);
}
