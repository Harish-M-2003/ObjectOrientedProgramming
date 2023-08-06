
// abstract : hides the internal details and shows only the essentials.
// abstract only contains the format of the definition.
// A class that has one or more abstract member should also be abstract.

// Object of an abstract class cannot be created.

// abstract resolve the collision problem that occurs during the multiple inheritance.
// still we cannot use multiple inheritence , for that we need interfaces.


// when to use abstraction : if you know that the members are need to be overriden in future then use abstraction.
// abstract and interface both may seem to be the same but they are not.

// In Abstraction the parent class tells what to do but not how to do.
// child class can implements it's own rule for how to do it.

class Main{

    public static void main(String[] args){

        // Parent son = new Son(); // this is also possiable.
        Son son = new Son();
        Doughter doughter = new Doughter();
        //son.num = 100;
        //System.out.println(son.num);
        System.out.println(son.getter());
        son.career();
        doughter.career();
    }
}

abstract class Parent{

    // since this class contains the abstract memebers in it , it must also be abstract.
    // we cannot create a abstract constructor.
    // we cannot create static abstract member , because static member cannot be overriden.
    // we cannot create  an object for abstract class without overriding the members.

    // abstract class can contain non-abstract members also.

    // abstract methods cannot have body.

    // abstract int num = 10; // modifier abstract not allowed here.

    private int num = 10; // this is allowed in abstract class.

    /*
    abstract void example(){
        // this is not possiable.
        System.out.println("Example");
    }
    */

    int getter(){
        return this.num; 
        // even though we cannot create the object of abstract class , we can use 'this' keyword.
    }

    void example(){ 
        System.out.println("Example");
    }

    // abstract Parent(); // this is not possiable. we cannot create a object of abstract class.
    // so how can we call the contructor.

    Parent(){
        // this is allowed in abstract class.
        System.out.println("Constructor inside parent.");
    }
    
    abstract void career();
    abstract void partner();
}

class Son extends Parent{

    // abstract int num = 20;

    // the methods that are overriden should have exactly the same format as in abstract base class.

    Son(){
        System.out.println("Constructor inside son.");
    }

    @Override
    public void career(){
        System.out.println("I am a developer.");
    }

    @Override
    public void partner(){
        System.out.println("I Love shinchan");
    }
}

class Doughter extends Parent{

    
    Doughter(){
        System.out.println("Constructor inside Daughter.");
    }
    
    @Override
    public void career(){
        System.out.println("I am a doctor.");
    }

    @Override
    public void partner(){
        System.out.println("I Love dr.Romatic .");
    }
}