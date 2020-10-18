package homework;

import practice3.Phone;

public class MyConstructor {  //parameterization of constructor
    String model;
    String year;

    public MyConstructor() {

    }

    public MyConstructor(String thePhone) {
        this.model = thePhone;
    }
    public MyConstructor(String thePhone, String year){
        this.model = thePhone;
        this.year = year;
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("Phone");
        phone1.printPhone();
        Phone phone2 = new Phone("LG Wing "+"2020");
        phone2.printPhone();
    }

    public void MyConstructor() {
        System.out.println(model);
        System.out.println(year);
    }
}