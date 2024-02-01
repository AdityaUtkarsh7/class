//package rec;

public class combination {
    public static void main(String[] args) {
        PT(4,3,-1,"");
    }
    public static void PT(int total,int pick,int prev,String path) {
        if(pick==0) {
            System.out.println(path);
            return;
        }
        for(int curr=prev+1;curr<total;curr++) {
            PT(total,pick-1,curr,path+"b"+curr);
        }
    }

}