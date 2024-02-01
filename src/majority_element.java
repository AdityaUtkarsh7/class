import java.util.Scanner;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
     int maj=arr[0],cnt=0;
     for (int i=1;i< arr.length;i++){
         if (arr[i]==maj) cnt++;
         if (arr[i]!=maj) cnt--;
         if (cnt==-1) maj=arr[i+1];
     }
        System.out.println(maj);
    }
}
