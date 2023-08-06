package learning_java.packages.a; // this works even if the path is wrong.
// example package learning_javaharish; even though the path does'nt exists it works.
// packages are containers for class , it is used to keep the classes in compartment like.
// in simple terms a package is a folder.

// we have to mention the package that's it nothing special. it's like a convention.
//import static learning_java.packages.Message.message;
//import static learning_java.packages.b.Message.message;
// import not worked for me.

// actually package keyword displays the location of the file which caused the error.
// so it's easy for the developer to fix the bug.

public class Main{

    // static - Helps us to access the members of the class without creating their object.

    public static void main(String[] args){
        Human harish = new Human("harish" , 20);
    }
}
