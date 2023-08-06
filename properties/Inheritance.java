
// Inheritance is the process of extending the members of parent class to child class , so that we
// can access the parent class members using child class object.

// extend keywrod is used to inherite in java.

// parent class cannot access child class members , but child class can access parent class members.
// child class cannot access private members of parent class.

// reference type determine which members are accessiable throught it.
// where object represent what member to access.

// super keyword is used to access the member of direct parent.

// the parent class of the root parent is Object class.

// In java Multiple and hybride inheritance is not supported , but can be achived using interfaces.
// java does'nt support because the child class does not know which member to access if both the parent class has that perticular member.


public class Inheritance{

    // below classes have access to above classes , but above classes have not access to below classes.
    // (i.e) parent class cannot access child class members , but child class can accress parent members who are not private.

    public static void main(String[] args){

        B obj = new B();
    }

}

class A{

    A(){
        System.out.println("Parent Class");
    }
}

class B extends A{ // this is called single Level inheretance.

    // First the parent class constructor is called.
    // after that only child class constructor is called.

    // note : since the child class is dependent on the parent , always use super first inside the constructor ,
    // if your using super.

    B(){
        super(); // this works
        
        System.out.println("Child Class" + prop);
        //super(); // this will not work .
    }
}

class C extends B{ // this is called multi-level inheritance.

    C(){
        System.out.println("Child C");
    }

}

class D extends A{ // this is called hiearchical inheritance.

    // A overloaded member should have different type of return or arugments or order of arguments.

    D(){

    }

    D(String message){ //  this is called constructor overloading.

    }

    D(String message , int value){

    }

    D(int value , String message){
        //this works because the order of arguments are different
    }
}