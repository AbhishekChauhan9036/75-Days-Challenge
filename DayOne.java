public class DayOne{
    public static void main(String...args) {
        int a,b;
        float c,d;
        c=20f;
        d=40f;
        a=10;
        b=20;
        System.out.println(TSRS(a,b));
        TSRN(c,d);
        System.out.println(TNRS());
        TNRN();

    }

    public static int TSRS(int n,int m){
        return n+m;
    }

    public static void TSRN(float a,float b){
        System.out.println(a-b);
    }

    public static double TNRS(){
        return 10.008;
    }

    public static void TNRN(){
        System.out.println(TNRS());
    }


}


/**
 * FUNCTION NATURE
 * TSRS - Takes Something Return Something
 * TSRN - Takes Something Return Nothing
 * TNRS - Takes Nothing Return Something
 * TNRN - Takes Nothing Return Nothing
 */