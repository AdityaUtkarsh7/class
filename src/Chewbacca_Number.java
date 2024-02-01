public class Chewbacca_Number {
    public static void main(String[] args) {
        int n=12;
        int div=2;
        int cnt=0;
        while (n!=1){
            if (n%div==0){
                n=n/div;
                cnt++;
            }
            else {
                if (cnt>0){
                    System.out.println(div);
                }
                cnt=0;
                div++;
            }
        }
        if (cnt>0){
            System.out.println(div);
        }
    }
}