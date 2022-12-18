public class Question {
    public static void main(String[] args) {

        // Arithmetic operators

        int a = 39;
        int b = 37;

        System.out.println("the value of a and b is " + (a + b));
        System.out.println("the value of a and b is " + (a - b));
        System.out.println("the value of a and b is " + (a * b));
        System.out.println("the value of a and b is " + (a / b));
        System.out.println("the value of a and b is " + (a % b));

        // Logical operators

        // for and operators it will rep as &&
        System.out.println("the x and x combination :" + (true && true));
        System.out.println("the x and y combination :" + (true && false));
        System.out.println("the y and x combination :" + (false && false));
        System.out.println("the y and y combination :" + (false && true));

        // for or operators ||
        System.out.println("the x and x combination :" + (true || true));
        System.out.println("the x and y combination :" + (true || false));
        System.out.println("the y and x combination :" + (false || false));
        System.out.println("the y and y combination :" + (false || true));

        // for not operators sym is !
        System.out.println("the not of true is : " + (!true));
        System.out.println("the not of true is : " + (!false));

        // for Relational op
        // > ,< ,<= ,>=, !=, ==
        int x = 33;
        int y = 45;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x != y);

        // assigment op:
        int m = 94; // single assigment
        System.out.println(m);
        a = b;
        System.out.println(b);
        x = y;
        System.out.println(x);
        a = b = x = y = 33; // chain assigment
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);

        // compound assigment

        a += 4;
        b *= 4;
        x /= 4;
        y %= 4;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);

        // i and d operator
        // in which we are performming operation operent
        a = 0;
        b = 0;
        b = a++ + ++a + a++ + ++a;
        System.out.println("===========");
        System.out.println(b);

    }
}