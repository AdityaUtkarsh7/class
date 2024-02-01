import java.util.Scanner;

public class buy_n_sell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int cnt=arr[0];
        int rep=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]<cnt) {
                cnt=arr[i];
                rep=i+1;
            }
        }
        System.out.println(rep);
//        System.out.println(cnt);
    }
//    public static int dessert(int[]arr){
//
//    }
}