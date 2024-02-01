import java.util.Scanner;

public class rec_sub_form {
    static boolean bl=true;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        obed_str(1,"abba");
        String str= sc.next();
        obed_str(1,str);
//        System.out.println();
        System.out.println(bl);
    }
    public static void obed_str (int i,String str){
        if (i==str.length()){
            return;
        }
        if (str.charAt(i)!='a'&&str.charAt(i)!='b') {
            bl=false;
            return;
        }
        if (str.charAt(i)=='b'&&str.charAt(i+1)!='b'){
            bl=false;
            return;
        }
        if (str.charAt(i)=='b'&&i==str.length()-1){
           bl=false;
//            bl=true;
            return;
        }
        if (str.charAt(i)=='b'&&str.charAt(i+1)=='b'){
            i=i+1;
        }
//        if (i<str.length()&&str.charAt(i)!='a'){
//            bl=false;
//            return;
//        }
        obed_str(i+1,str);
    }
}