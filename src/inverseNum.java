public class inverseNum {
    public static void main(String[] args) {
        int num=12;
        int i=num;
        int cnt=0;
        while (num>1){
            int j=num;
            while (j>1){
            if (i%j==0) cnt++;
            if (cnt<3){
                num=num/i;
                System.out.println(i);
            }
            j--;
            }
            i--;
        }
    }
}