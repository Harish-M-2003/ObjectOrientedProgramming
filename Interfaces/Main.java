// Interfaces contains abstract functions.
// no body of the class is allowed.
// by default the functions are public and abstract in the interfaces
// and the variables are static and final by default in interfaces.
// interfaces specifies what the class is doing but not how it's doing.

// difference between class and interfaces.
// since we don't have constructors for interfaces how can we initialize values for variable
// in interfaces that's why the values are final in interfaces by default.

// abstract can provide the implementation of interface.
// but interface cannot provide the implmentation of abtract.

// interface is similar to abstract but has additional features.

// we cannot create an object for the interfaces.

// nested interfaces  are allowed.

public class Main{

    public static void main(String[] args){

        Car tesla = new Car();
        tesla.start();
        tesla.press();
        Engine.greeting(); // call the static method of interface using interface name.
    }

}



public interface Engine{


    // static interface method should always have a body.
    // because static method cannot be overidden we have to define the function body.
    // call via the interfac e name.

    static void greeting(){
        System.out.println("since static method cannot be overriden.");
    }



    int price = 100000; // static and final by default

    void start(); // public and abstract by default.
    void stop();
}

public interface Break{

    // interface abstract method cannot have body.
    /*void press(){
        System.out.println("asdasd");
    }*/ // this will not work.

    void press(); // this will work

}


public class Car implements Engine , Break { // Multiple inheritance.

    @Override
    public void start(){
        System.out.println("Engine");
    }

    @Override
    public void stop(){
        System.out.println("Stop Engine");
    }

    @Override
    public void press(){
        System.out.println("pressing break");
    }


}
