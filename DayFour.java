class A {
    protected int a, b, c, d;

    public void setData(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}

class B extends A {

    public int sum() {
        return a + b + c + d;
    }

}



class C extends B{
    
}

public class DayFour {
    public static void main(String[] args) {
        C b1 = new C();
        b1.setData(10, 20, 30, 40);
        int ans = b1.sum();
        System.out.println(ans);
    }

}
