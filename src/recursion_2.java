import java.util.Scanner;

public class recursion_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        while (n>0){
            String str= sc.next();
//        System.out.println(str.charAt(0));
            subseq(0,str.length(),str);
            System.out.println(" ");
            n--;
        }
    }
    public static void subseq(int i,int j,String str){
        if (i==str.length()){
            return;
        }
        if (i!=str.length()-1){
            System.out.println(str.charAt(i));
        }
        subseq(i+1,j,str);
        System.out.println(str.substring(i,j));
    }
}