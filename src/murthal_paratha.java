import java.util.Scanner;

public class murthal_paratha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prata= sc.nextInt();
        int a= sc.nextInt();
        int[]rank=new int[a];
        for (int i = 0; i < a; i++) {
            rank[i] = sc.nextInt();
        }
        int[]ans=new int[a];
        int e=a,cnt=0;
         for (int i=0;i<a;i++){
            int j=1;
            while (j<=e){
               ans[i]+=rank[i]*j;
                j++;
            }
//            System.out.println(ans[i]);
            e--;
        }
        int s=1,end=ans.length-1,mid=0;
        while (s<=e){
             mid=(s+e)/2;
            if (ans[mid-1]<ans[mid]&&ans[mid]<ans[mid+1]){
                s=mid;
            }
        }
        System.out.println(ans[mid+1]);
//        System.out.println(cnt);
//        for (int v=0;v<ans.length-1;v++){
//            if (ans[v+1]<ans[v]) {
//                cnt=ans[v-1];
//                break;
//            }
//        }
//        System.out.println(cnt);
        }
    }

