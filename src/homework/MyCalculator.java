package homework;

public class MyCalculator {
    public static void main(String[] args) {


        int aa = calculator(10, -10, 30);
        int ab = calculator(30, 10);

        System.out.println("10+(-10)+30 is = "+aa);
        System.out.println("30 divided by 10 is = "+ab);
    }

    public static int calculator(int a, int b, int c){
        int d = a+b+c;
        return d;
    }

    public static int calculator(int a, int b){
        int c = a/b;
        return c;
    }

}