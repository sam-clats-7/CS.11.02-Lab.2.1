/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sumOfTwo = add(5,7);
        System.out.println("The sum of 5 and 7 is: " + sumOfTwo);

        int sumOfFour = add(5,7,6,6);
        System.out.println("The sum of 5,7,6 and 6 is: " + sumOfFour);

        String morningGreeting = morningGreeting("Hubert Pong");
        System.out.println(morningGreeting);

        String afternoonGreeting = afternoonGreeting("Arthur Wong");
        System.out.println(afternoonGreeting);

        String triple = triple("oohbaby");
        System.out.println(triple);

        double halfValue = half(19);
        System.out.println(halfValue);

        int roundedPositiveValue = roundPositiveValueToNearestInteger(69.9);
        System.out.println(roundedPositiveValue);

        int roundedPositiveValue1 = roundPositiveValueToNearestInteger(7.47);
        System.out.println(roundedPositiveValue1);

        int roundedNegativeValue2 = roundNegativeValueToNearestInteger(-3.5);
        System.out.println(roundedNegativeValue2);

        int roundedNegativeValue3 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedNegativeValue3);
    }

    public static int add(int a, int b) {
        return a + b;
    }
    // 1. add


    public static int add (int a, int b, int c, int d){
        return add(a, b) + add(c, d);
    }
    // 2. add


    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 3. morningGreeting


    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    // 4. afternoonGreeting


    public static String triple(String s){
        return s + s + s;
    }
    // 5. triple

    public static double half(int n){
        return n/2.0;
    }
    // 6. half


    public static int roundPositiveValueToNearestInteger(double d) {
        return (int) (d + 0.5);
    }
    // 7. roundPositiveValueToNearestInteger

    public static int roundNegativeValueToNearestInteger(double d) {
        return (int) (d - 0.5);
    }

}

    // 1. add
    
    // 2. add

    // 3. morningGreeting

    // 4. afternoonGreeting

    // 5. triple

    // 6. half

    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger


