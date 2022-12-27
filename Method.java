public class Method {

    int a;
    int b;
    int c;

    void add(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("the val of a +a + b +c  : " + (a + b + c));

    }

    public static void main(String[] args) {

        Method m = new Method();
        m.add(3, 33, 88);

        Method m1 = new Method();
        m1.add(44, 3, 3838);

    }

}
