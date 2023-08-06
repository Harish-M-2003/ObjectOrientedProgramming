
// static keyword is used to access the members of a class with out creating an object.

// we cannot access non static method inside a static method without explicitly creating an object.

public class Static{

    // public static void main(String[] args){

    //     Human harish = new Human("harish" , 20);
    //     Human shinchan = new Human("shinchan" , 23);

    //     // we can access the name propertie using the reference varibales as well.
    //     // but that's not the proper convention to use.

    //     //System.out.println(harish.name); // this is not the proper convention .
    //     //System.out.println(shinchan.name);

    //     System.out.println(Human.name); // this is the proper convetion. because name propertie is a class variable.
    //     System.out.println(harish.age);
    //     System.out.println(shinchan.age);
    //     //example(); // this will throw an error because this is a non static method.
    //     // inside a static method we cannot call a non static method.

    //     // we can call the non static method as follows
    //     //Static obj = new Static();
    //     //obj.example();

    //     //example1(); // this will work.

    //     //example2();// this won't work coz example2() is a non static method. we need it's object for it's execution.
    //     Static obj = new Static();
    //     obj.example2(); // now it will work.

    //     // the above snippet is for demonstrating example2() method . that is example  5 , let say.
    // }


    static void example(){
        // since this method is a non static method it cannot be accessed without an object.
        // so inorder to access this method we need to declear an object first.
        System.out.println("Example for accessing non static method");
    }


    static void example1(){
        //exmaple(); // cannot run this method because this method is a non static method.
        // as we have seen inorder to run we need to create the object first.

        Static obj = new Static();
        obj.example(); // now it works.
    }

    void example2(){
        // This is example 5 , let say.
        example(); // this works because the object created for example2() is used by example() method for it's execution.
        // this is a different case , here we do not have to create the object inorder to acess the example() method.
        // because since the example2() is also a non static method inorder to access example2() method.
        // definatly we need an object , this object is also used by the example() method inorder for it's exection.
    }

}


class Human{

    static String name; // this tells the name is not a instance variable .
    // this is a class variable.this varibale is not depende on object.
    int age; // this is a instance variable. this variable is depended on object.

    /*static { 
        // this block is called static block , it will execute only once when the object is created for the first time.
        Human.name = "harish";
    }*/

    Human(String name , int age){
        Human.name = name; // this is the proper convention.
        //this.name = name; // even this works , but this is not the proper convention to use.
        this.age = age; 
    }
}