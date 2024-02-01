import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class rec_submission_format {
    static int cnt=0;
    static StringBuilder stb=new StringBuilder();
    static boolean bl=true;
    public static void main(String[] args) {
        ArrayList <Character> strList=new ArrayList<>();
//        int a= sc.nextInt();
//        int ali=sc.nextInt();
//        int[]arr=new int[a];
//        for (int i=0;i<a;i++){
//            arr[i]= sc.nextInt();
//        }
//        int n=sc.nextInt();
//        int []arr={1,3,2,3,5};
        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
        String str="the sky is blue";
        int i=str.length()-1;
        int j=str.length()-2;
        while (j>-1){
            if (str.charAt(j)==' '||j==0){
                if (j==0) System.out.print(" ");
                int k=j;
                while (k<=i){
//                    System.out.print(str.charAt(k));
                    strList.add(str.charAt(k));
                    k++;
                }
                i=j-1;
            }
            j--;
        }
//        System.out.println(strList.size());
//        System.out.println(strList);
//        Collections.sort(strList);
        int g=1;
        while (g< 15){
//            System.out.print(strList.get(g));
//            strList.get(g);
            g++;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                strList.add(str.substring(j, i+1));
//                while (str.charAt(i) == ' ') {
//                    i++;
//                }
//                j = i;
//            }
//        }
//        System.out.println();
//        System.out.println(i);
//        System.out.println(j);
        }


}
