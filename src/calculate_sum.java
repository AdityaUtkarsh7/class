import java.util.*;
public class calculate_sum {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++) {
            a[i]=scn.nextInt();
        }

        int Q=scn.nextInt();

        while(Q>0){
            int X=scn.nextInt();

            int[] temp=new int[N];

            for (int i = 0; i < N; i++)
            {
                // a[i] = temp[i];
                temp[i] = a[i];
            }

            for (int i = 0; i < N; i++)
            {
                temp[i] = a[i] + a[(i-X+N)%N];
            }

            for (int i = 0; i < N; i++)
            {
                a[i] = temp[i];
            }
            Q--;
        }

        int sum = 0;
        for(int i = 0 ; i<N; i++){
            sum = (sum + a[i])%1000000007; // missed modulo of sum
        }
        System.out.println(sum);
    }
}