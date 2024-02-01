import java.util.Scanner;

public class help_ramu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test= sc.nextInt();
        for (;test>0;test--){
        int[]cost=new int[4];
            for (int i = 0; i < 4; i++) {
                cost[i] = sc.nextInt();
            }
            int n_R_l= sc.nextInt();
            int m_C_l= sc.nextInt();
        int[]n_R=new int[n_R_l];
            for (int a = 0; a < n_R_l; a++) {
                n_R[a] = sc.nextInt();
            }
        int[]m_C=new int[m_C_l];
            for (int o = 0; o < m_C_l; o++) {
                m_C[o] = sc.nextInt();
            }
        int k=0,l=0;
        for (int i=0;i<n_R.length;i++){
            k+=Math.min(Math.min(n_R[i]*cost[0],cost[1]),cost[2]);
            if (k>cost[2]) k=cost[2];
        }
        for (int j=0;j<m_C.length;j++){
            l+=Math.min(Math.min(m_C[j]*cost[0],cost[1]),cost[2]);
            if (l>cost[2]) l=cost[2];
        }
        System.out.println(Math.min(k+l,cost[3]));
    }
    }
}
