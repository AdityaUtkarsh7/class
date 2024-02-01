public class Ugly_Num {
    public static void main(String[] args) {
        int num=6;

        boolean bl=true;
//        if(num<Integer.MAX_VALUE)
//        if (num>Integer.MIN_VALUE)
        for (int i=2;i<num;i++){
            int cnt=0;
            for (int j=1;j<num;j++){
                if (i%j==0) cnt++;
            }
            if (cnt<3){
                if (num%i==0 && i>5){
                    bl=false;
                }
//                else {
//                    System.out.println("good num");
//                    break;
//                }
            }
        }
        System.out.println(bl);
    }
}