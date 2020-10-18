package practice4;

import java.sql.SQLOutput;

public class Conditions {
    public static void main(String[] args) {

        //soccer - sunday
        //class - monday
        //guitar - friday
        //shill at my home - other days

        String today = "Tuesdy";

        //if(conditions)--ends

        if(today.equalsIgnoreCase("sunday")){
            System.out.println("i'll go to soccer");
        }else if(today.equalsIgnoreCase("monday")) {
            System.out.println("i'll go to class");
        }else if(today.equalsIgnoreCase("Friday")){
            System.out.println("i'll play guiter");
        }else{
            System.out.println("sitting at my home and watch netflix");
        }


        int year = 2021;

        if (year==2020){
            System.out.println("horrible year for all of us");
        }else{
            System.out.println("as usual");
        }

        boolean isTodaySunny = false;
        // ! is sign for not, if you don't use ! the answer will be switched.
        if(!isTodaySunny){
            System.out.println("lets go fishing");
        }else{
            System.out.println("lets play badminton");
        }

        // || - or

        int a=5;

        if (a==5 || a>6){
            System.out.println(a);
        }

        // && - and

        if (a==5 && a>4){
            System.out.println("today is the day "+a);
        }

        // !=  - not equals

        if(a!=4){
            System.out.println("a is not equal: "+a);
        }
        // ==  - equals

        if(a==5){
            System.out.println("today a matched : "+a);
        }

    }
}
