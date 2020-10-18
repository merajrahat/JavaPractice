package practice4.oop.inheritance;

public class CalculatorPolymorphism {

    //Polymorphism
    // two types:
    // method overloading -- same method name, different params, in the same class
    // static polymorphism or compile time polymorphism
    public static void main(String[] args) {


        int additionData = calculator(10, 20, 30);
        int multiplicationData = calculator(3, 10);

        System.out.println(additionData);
        System.out.println(multiplicationData);
    }
    // - create 2 canculators
    // - one of them  will do addition of given 3 int
    // - another will do multiplication of given 2 int

    public static int calculator(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    public static int calculator(int a, int b) {
        int c = a * b;
        return c;
    }


    //method overriding - examples at abstraction package
}