// Introduction :

// Java is a static type language.
// Java is pass by value , but when reference is passed means we actully passing th address.
// In java primitives , reference variable are all stored in stack memory becouse they are not Object.

// final only works for primitive , but not for reference.
// that is the refernce cannot be changed but the value of the object can be changed.
// we cannot destroy objects manually.


public class Main{

    // A class is a named group of properties and methods.
    // in other words , a class is a template of an object.
    // object is the instance of the class.

    // Class -> Logical contruct.
    // Object -> Physical reality , this is the one that occupies memory.

    // Object -> has state , identity and behavior.

    // dot operator -> links the object reference with instance variable.
    // in java dot operator is catogaried as separator.

    // inorder to create a object we need to use new keyword.

    // new keyword dynamically allocates memory and returns a reference ( adrress of the allocated space).

    // objects are stored in heap memory.(heap memory is used for dynamic allocation).
    // references are stored in stack.

    //we can'nt access or mainpulate address in java.

    public static void main(String[] args){

        // Student harish; this line actully not creating an object , it's just creating a refence.

        // Student harish =  new Student() ; // this is called declaration.
        //lefthandside Compile time = righthandside run time;
        // The process of creating an object is called object instatiation.

        // in the above statement : Student harish executed at compile time and after (=) executed at run time.

        // harish.name = "harish"; // this line is talking about the name inside the object harish.
        // harish.age = 20; // this line changes the default value 18 to 20;
        //harish.marks = 5.5f;

        // Student harish = new Student(); this consturctor without any parameter is called default constructor.

        final Student harish = new Student("harish" , 20 , 5.5f); // this constructor with parameters is called parameterized contructor.
        //harish = new Student("shinchan" , 20 , 5.5); // this cannot happen since the variable harish is final.
        // example();
        // even though the reference variable harish is final we can change the value's of it's data members because they are final.
        harish.name = "chaning"; // we are changing the object using harish refernece variable.

        Student shinchan = harish; // here shinchan and harish are pointing to same object.
        // so any change done to reference variable harish will affect reference variable shinchan as well.

        System.out.println(harish == shinchan);
        System.out.println(shinchan.name);
    
        System.out.println(shinchan.name); // due to the change using harish variable , it affected shinchan variable.
        
    }

    // objects that have'nt pointed by any pointer is automatically remove from heap memory by the java garbage collector.
}

// create a class inside the main class as static class.
// or create it outside the class but keep that class below the main class.
// default values of objects when not initialized is null.
// default values of primitives when not initialized is depends on the type.
// example : int a ; has default value 0; and float value; has default value 0.0;


class Student{

        // int  age = 18 ; this line tells that age property will have value 18.
        // it uses this value if the age property of the newly created object is not provided.
        
        int age = 18;
        String name ;
        float marks ;
        // if final keyword is used while declaring a propertie , don't forget to initialize during decalration.
        
        // the above three are the properties of the student class.

        Student (String name , int age , float marks){ // in this line the Student word is the return type and constructor has no name.

            // constructor is a special function.
            // constructor basically defines what happend the object is created.
            // no void or any other return should be used for constructor.
            this.name = name; // 'this' keypword automatically it replace with the object , in otherwords it's the reference of the object.
            this.age = age;
            this.marks = marks;

            // the above three lines internally converted to.
            // harish.name = name;
            //harish.age = age;
            //harish.marks = marks;
            //this happens because of this keyword.
        }

        @Override // this just indicates whether method is overridden or not. nothing else. 
        // even if we are not using @Override ,  the method will be overridden.
        protected void finalize() throws Throwable{ // finalize method is the destructor of the object, this is called when the object is remove from heap.
            System.out.println("Object remove from heap");
        }
        
}

/*class ExampleForFinal{

    //final int a; // this line will not work because once the propertie is decleared as final , we cannot assign values to it in future.
}
*/


