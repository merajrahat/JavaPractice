package homework;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
   // MyScanner myScanner = new MyScanner();
        //myScanner.newScaner();
        companyAge();
    }

    public void newScaner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter company: ");
        String company = scanner.next();
        System.out.println("The new name of your company is: "+company);
    }

    public static void companyAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old is the company: ");
        int num1 = scanner.nextInt();
        System.out.println("How many more yeas will thing company be here? ");
        int num2 = scanner.nextInt();
        int total = num1 + num2;
        System.out.println("Total life span of your company will be: "+total);
    }

  }
