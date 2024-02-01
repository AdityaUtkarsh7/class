public class recursion {
    static int cnt=0;
    static int num=0;
    static StringBuilder stb=new StringBuilder();
    static boolean bl=true;
    public static void main(String[] args) {
//      PI(5);
//      Pd(1,4);
//        int []a={1,2,3,4};
////        print_arr_rec(0,2,a);
//        print_arr_rev(0,a);`
//        System.out.println(fact(4));
//        fact()
//        System.out.println(pow(2,7));
//        ways(3,3,3,"");
//        System.out.println();
//        System.out.println(cnt);
        stairs(0,4,"");
        System.out.println();
        System.out.println(cnt);
//        combination(2,3,"");
//        stars_triangle(3);
//        odd_even(5);
//        subsequence("ab");
//        System.out.println(arr_max(0,arr));
//        System.out.println(nth_triangle(2));
//        occurance(3,"shy","y");
//        int []arr={1,2,3,3};
//        System.out.println(arr_occ(0,arr,9));
//        String str="the sheep";
//        int n=str.length()-1;
//        rev_str(n,str);
//        System.out.println(climb(0,2));
//        ways(0,4);
//        System.out.println(cnt);
//        duplicate_char(0,0,"hello");
//        rec_twins(0,0,"axaxa");
//        rep_pi(0,"xpix");
//        obed_rec(0,"abba");
//        System.out.println(bl);
//        in_paran(0,"abc(gh)");
//        subseq(0,0,"ab");
//        climb(0,3);

    }
    public static void PI(int n){

        if (n==0){
//            PI(n+1);
            return;
        }
//        n=n+1;
        PI(n-1);
        System.out.println(n);
    }
    public static void Pd(int s,int e){
        if (s>e){
            return;
        }
        Pd(s+1,e);
        System.out.println(s);
    }
    public static void print_arr_rec(int s,int e,int []arr){
        if (s>e){
            return;
        }
        System.out.println(arr[s]);
        print_arr_rec(s+1,e,arr);
    }
    public static void print_arr_rev(int s,int[]arr){
        if (s== arr.length){
            return;
        }
        print_arr_rev(s+1,arr);
        System.out.println(arr[s]);
    }
//    public static int arr_max(int s,int []arr) {
//        arr_max(s + 1, arr);
//        if (arr[s + 1] < arr[s]) {
//            int j = arr[s + 1];
//            return j;
//        }
//    }
    public static int fact(int n){
        if (n==1){
            return n;
        }
        int ans=fact(n-1);
        return ans*n;
    }
    public static int pow(int a,int b){
        if (b==0){
            return 1;
        }
//        return a*b;
        int ans=pow(a,b-1);
        return a*ans;
    }
    public static void ways(int r,int d,String path){
        if (r==1 && d==1){
            cnt++;
            System.out.print(path+" ");
            return;
        }

        if (r>0){
        ways(r-1,d,path+"V");
        }
        if (d>0){
        ways(r,d-1,path+"H");}
//        if (r>0&&d>0){
//            ways(r-1,d-1,h,path+"D");
//        }

    }
    public static void stairs(int s,int end,String path){
        if (s==end){
            cnt++;
            System.out.print(path+" ");
            return;
        }
        if (s>end) return;
        int n=3;
        int j=1;
        while (j<=n){
        stairs(s+j,end,path+String.valueOf(j));
//        stairs(s+2,end,path+"2");
//        stairs(s+3,end,path+"3");
        j++;
        }
    }
   public static void combination(int put,int n,String path){
        if (put<=0){
            System.out.println(path);
            return;
        }
        combination(put-1,n,path+"b");
        combination(put-1,n,path+"c");
   }
    public static void stars_triangle(int n){
        int j=n;
        if (n==0) return;
        while (j>0){
            System.out.print("*");
            j--;
        }
        System.out.println();
            stars_triangle(n-1);
//            System.out.println();

    }
   public static void odd_even(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        if (n%2!=0){
            System.out.println(n);
        }
        odd_even(n-1);
        if (n%2==0){
            System.out.println(n);
        }
   }
   public static void subsequence(String a){
        int i=0;
        if (i==a.length()-1){
            return;
        }
       System.out.println(a.charAt(i));
        i=i+1;
        subsequence(a);
   }
   public static int arr_max(int n,int []arr){
//        if (n==arr.length) {
//            return 0;
//        }
//        if (arr[n]>cnt){
//            cnt =arr[n];
//        }
//       arr_max(n+1,arr);
//        return cnt;
       return 0;
   }
    public static int climb(int steps,int n){

        if(steps>n){
            return 0;
        }
        if(steps==n){
            return 1;
        }
        int sp1=  climb(steps + 1, n);
        int sp2= climb(steps + 2,  n);

        return sp1+sp2;
    }
    public static int nth_triangle(int n){
        if (n==0){
            return 1;
        }
//        int cnt=0;
        cnt=cnt+n;
        nth_triangle(n-1);
        return cnt;
    }
    public static void occurance(int n,String str,String a){
        if (n<=0) {
            return;
        }
//        int cnt=0;
        if (str.charAt(n-1)==a.charAt(0)){
            cnt++;
        }
        occurance(n-1,str,a);
    }
    public static int arr_occ(int n,int[]arr,int ali){
        if (n==arr.length) return -1;
        if (arr[n]==ali) {
            return n;
        }
        return arr_occ(n+1,arr,ali);
    }
    public static void rev_str(int n,String str){
        if(n<0){
            return;
        }
        System.out.print(str.charAt(n));
        rev_str(n-1,str);
    }
    public static void ways(int s,int e){
        if (s>e){
            return;
        }
        if (s==e) cnt++;
        ways(s+1,e);
        ways(s+2,e);
    }
    public static void duplicate_char(int i,int j,String str){
//        StringBuilder stb=new StringBuilder();
        if (i==str.length()-1||j==str.length()-1 ){
            stb.append(str.charAt(i));
            System.out.println(stb);
            return;
        }
//        i=0;
        j=i+1;
        if (str.charAt(i)==str.charAt(j)){
            stb.append(str.charAt(i));
            stb.append("*");
            stb.append(str.charAt(j));
        }
        else if (str.charAt(i)!=str.charAt(j)){
            stb.append(str.charAt(i));
//            stb.append("*");
            stb.append(str.charAt(j));
        }
        duplicate_char(i+2,j,str);
    }
    public static void rec_twins(int i,int j,String str){
        if (j==str.length()-1){
//            System.out.println(stb);
            return;
        }
//        i=0;
        j=i+2;
        if (str.charAt(i)==str.charAt(j)){
//            stb.append(str.charAt(i));
//            stb.append("*");
            cnt++;
//            stb.append(str.charAt(j));
        }
        rec_twins(i+1,j,str);
    }
    public static void rep_pi(int i,String str){
        StringBuilder  stb=new StringBuilder();
        if (i>=str.length()-1){
//            stb.append(str.charAt(i));
//            System.out.println(stb);
            return;
        }
//        i=0;
        int h=str.charAt(i);
        if (h==112){
            stb.append("3.14");
            i=i+2;
        }
        stb.append(str.charAt(i));
        System.out.print(stb);
        rep_pi(i+1,str);
//        System.out.print(stb);
    }
    public static void obed_rec(int i,String str){
        if (i==str.length()-1) return;
        if (str.charAt(0)!='a') {
            bl=false;
            return;
        }
        if (str.charAt(i)!='a'||str.charAt(i)!='b') return;
        if (str.charAt(i)=='b'){
            if (str.charAt(i+1)!='b'){
                bl=false;
                return;
            }
            i++;
        }
        obed_rec(i+1,str);
    }
    public static int str_int(String str){
        int ans=Integer.parseInt(str);
        return ans;
    }
    public static void in_paran(int i,String str){
        if (i==str.length()-1){
            return;
        }
        if (str.charAt(i)=='('){
            int j=i+1;
            while (str.charAt(j)!=')'){
                System.out.print(str.charAt(j));
                j++;
            }
        }
        in_paran(i+1,str);
    }

}