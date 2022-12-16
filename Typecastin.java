public class Typecastin {

    public static void main(String[] args) {

        int a = 0;
        int b = 44; // in this we will get truncation
                    // value (means to chop off the decimal portion
                    // of a number.)
        float f = a + b;
        System.out.println(f);

        // example of implicit type casting
        int value = 33;
        double d;
        d = value;
        System.out.println(d);

        // exampe 2
        byte $b = 33;
        int $i = 33;
        byte ce = (byte) ($b + $i);
        System.out.println(ce);

        // example of explicit type casting
        double dd = (byte) 44.94949; // loose of data or precision

        System.out.println(dd);
    }

}
