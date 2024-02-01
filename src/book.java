import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (;t>0;t--){
        int a = sc.nextInt();
        int j= sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println(minimumpages(arr,j));
    }
    }
    public static int minimumpages(int[]a,int k){
        int min=Integer.MAX_VALUE;
        int max=0,res=0;
        for (int h:a){
            if (h<min) min=h;
            max+=h;
        }
//        System.out.println(max);
//        System.out.println(min);
        while (min<=max){
            int mid=(min+max)/2;
            if(isfeasible(a,k,mid)){
                res=mid;
                max=mid-1;
            }else {
                min=mid+1;
            }
        }
        return res;
    }
    static boolean isfeasible(int[] a,int k,int res){
        int students=1,sum=0;
        for (int i=0;i<a.length;i++){
            if(sum+a[i]>res){
                students++;
                sum=a[i];
            }else sum+=a[i];
        }
//        System.out.println(students<=k);
        return students<=k;
    }
}
