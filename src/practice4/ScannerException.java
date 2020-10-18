package practice4;

import java.util.Scanner;

public class ScannerException {

    //to be confirmed
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int b = scanner.nextInt();
        System.out.println("insert second number : ");

        int c = a+b;
        System.out.println("inser final number : " +c);
    }
}
