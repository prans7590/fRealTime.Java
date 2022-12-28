
public class Method {

    int a;
    int b;
    int c;

    public int sub(int a, int b) {

        this.a = a;
        this.b = b;

        return this.a - this.b;

    }

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

            int c = m.sub(22, 333);
            System.out.println(c);

        }

}
