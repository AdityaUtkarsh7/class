public class prime {
    public static void main(String[] args) {
        int num=0;
        int ttstar=1;
        int ttspace=7;
        while (num<5){
           int star=0;
           while (star<ttstar){
               System.out.print("* ");
               star++;
           }
           int space=0;
           while (space<ttspace){
               System.out.print("  ");
               space++;
           }
           star=0;
           while (star<ttstar){
               System.out.print("* ");
               star++;
           }
           ttstar++;
           ttspace=ttspace-2;
           num++;
            System.out.println();
        }
    }
}