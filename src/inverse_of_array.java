import java.util.Scanner;

public class inverse_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max= sc.nextInt();
        int min= sc.nextInt();
        int step= sc.nextInt();
        int j=min;
        while (min<=max){
            int c=(int)(5.0/9*(j-32));
            System.out.println(min+"-  "+c);
            min+=step;
            j+=20;
        }
    }
}