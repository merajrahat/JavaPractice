package homework;

public class MyLoop {
    public static void main(String[] args) {


        //increment ++
        System.out.println("Example of increment");
        for (int a=1; a<6; a++){
            System.out.println("Robot "+a);
        }
        System.out.println("");
        for (int a=2; a<6; a++){
            System.out.println("Robot "+a);
        }

        //decrement --
        System.out.println("");
        System.out.println("Example of decrement");
        for (int a=1; a>-6; a--){
            System.out.println("Robot "+a);
        }
    }
}
