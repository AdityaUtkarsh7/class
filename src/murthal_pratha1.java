import java.util.Scanner;

public class murthal_pratha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parathas= sc.nextInt();
        int A = sc.nextInt();
        int[] arr = new int[A];
        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>cnt) cnt=arr[i];
        }
//        System.out.println(cnt);
        int j=1;
        int totTime=0;
        for (int i=0;i< parathas;i++){
            totTime+=j*cnt;
            j++;
        }
//        System.out.println(totTime);
        int start=0;
        int end=totTime;
        while (start<=end){
            int mid=(start+end)/2;
            int temppratha=0;
            for (int a=0;a<arr.length;a++){
//                int time=1;
                int iterator=arr[a]*1;
                while (iterator<=mid){
                    int y=arr[a]*iterator;
//                    iterator++;
                    iterator=iterator*2;
                    temppratha++;
//                    System.out.println(a);
//                    System.out.print(y+" ");
//                    time=time*(arr[a]*iterator);
//                    if (iterator==mid)break;
                }
            }
            temppratha=temppratha-2;
            if (temppratha>parathas) end=mid-1;
            if (temppratha<parathas) start=mid+1;
            if (temppratha==parathas){
                System.out.println(mid);
                break;
            }
//            System.out.println("temppratha"+" "+temppratha);
//            System.out.println("mid"+" "+mid);
        }
    }
}
