public class Boston_Number {
    public static void main(String[] args) {
        int num=378;
        int cnt=0;
        int j=0;
        int i=1;
        int newnum=num;
        while (newnum>=2){
            if (num%i==0){
                cnt=i;
                System.out.println(i);
               newnum=num%i;
            }
        }
    }
}