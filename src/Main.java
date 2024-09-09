/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int sum = add(2,5);
        int sum2 = add2(2,5,8,3);
        String triples = triple("hello");
        double half = half(17);
        double round = roundPositiveValueToNearestInteger(8.5);
        double roundNegative = roundNegativeValueToNearestInteger(-8.7);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(morningGreeting("Izzy"));
        System.out.println(afternoonGreeting("Izzy"));
        System.out.println(triples);
        System.out.println(half);
        System.out.println(round);
        System.out.println(roundNegative);

    }
    public static int add(int a, int b){
        return a+b;
    }

    // 2. add
    public static int add2(int a, int b, int c, int d){
        return add(add(a,b),add(c,d));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name2){
        return "下午好, " + name2;
    }
    // 5. triple
    public static String triple(String triples){
        return triples + triples + triples;
    }
    // 6. half
    public static double half(int a){
        return (double) a/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) (a+0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        return (int) (a-0.5);
    }
}
