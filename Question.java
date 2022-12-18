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

    }
}