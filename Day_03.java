//Constructors in Java :
//
//        Constructors are similar to methods,, but they are used to initialize an object.
//        Constructors do not have any return type(not even void).
//        Every time we create an object by using the new() keyword, a constructor is called.
//        If we do not create a constructor by ourself, then the default constructor(created by Java compiler) is called.
//
//        Rules for creating a Constructor :
//
//        The class name and constructor name should be the same.
//        It must have no explicit return type.
//        It can not be abstract, static, final, and synchronized.
//
//        Types of Constructors in Java :
//
//        There are two types of constructors in Java :
//
//        Defaut constructor : A constructor with 0 parameters is known as default constructor.
//        Paramerterized constructor : A constructor with some specified number of parameters is known as a parameterized constructor.

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){          // This is constructor
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Day_03 {
    public static void main(String[] args) {
        // MyMainEmployee parvez = new MyMainEmployee("Constructor", 12);
        MyMainEmployee parvez = new MyMainEmployee();
        parvez.setName("Constructor");
        parvez.setId(34);
        System.out.println(parvez.getId());
        System.out.println(parvez.getName());
    }
}
