package practice4.oop.encapsulation;

public class Student {

    // oop -
    // Encapsulation : data hiding
    // Polymorphism
    // Inheritance
    // Abstraction

    String nameOfStudent;
    int idOfStudent;

  //setter method
    public void setNameofStudent(String nameOfStudent){
        this.nameOfStudent=nameOfStudent;
    }
    //getter method
    public String getNameofStudent(){
        return nameOfStudent;
    }

    //setter method
    public void setIdOfStudent(int idOfStudent){
        this.idOfStudent=idOfStudent;
    }
    //getter method
    public String getidofStudent(){
        return nameOfStudent;

    }
    public int getIdofStudent(){
        return idOfStudent;
    }
}