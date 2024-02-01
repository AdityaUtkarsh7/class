import java.util.*;

public class painters_partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ptr= sc.nextInt();
        int cnt=0;
        int a= sc.nextInt();
        int[]boards=new int[a];
        for (int i = 0; i < a; i++) {
            boards[i] = sc.nextInt();
        }
        int totalsum=0;
        for (int i=0;i<boards.length;i++){
            totalsum+=boards[i];
        }
        for (int i=0;i<boards.length;i++){
            if (ptr==1){
                cnt=totalsum;
                break;
            }
            if (ptr>1){
                if (boards[i]>cnt) cnt=boards[i];
            }
        }
        System.out.println(cnt);
    }
}