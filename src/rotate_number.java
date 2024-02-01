public class rotate_number {
    public static void main(String[] args) {
        int num=12345;
        int backup=num;
        int cnt=0;
        while (num>0){
            cnt++;
            num=num/10;
        }
        int rot=7;
        int netrot=rot%5;
//        System.out.println(netrot);
        int sum=0;
        while (netrot>0){
            int q=(int)Math.pow(10,netrot);
            int rem=backup%q;
            int resnum=backup/q;
            int r=(int)Math.pow(10,cnt-1);
            int j=(rem*r)+resnum;
            sum=j;
            backup=sum;
            netrot--;
        }
//        System.out.println(sum);
    }
}
