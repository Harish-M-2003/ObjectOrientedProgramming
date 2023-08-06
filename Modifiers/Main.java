// Give direct access to data is not a good convention in security point of view.

// member decleared as public is accessiable from anywhere.

//when we don't specify any access modifier , by default it will take 'default'.

// 'default' is accessiable anywhere within the package.
// 'default' cannot be accessed outside the package.,

// when to use.
//private : use for sensitive data.
// default : use if you don't want to access outside the package.
// protected : use if you want to access outside the package but only for subclass.
// public : use if you want to access from anywhere.

// the following table exaplains in much more detail.
/*
          | class | Package | SubClass (SP) | SubClass (DP)| World (DP And Not SubClass) |

 Public      yes     yes        yes                 yes           yes
 Protected   yes     yes        yes                 yes           yes
 Default     yes     yes        yes
 Private     yes     
 */

class Main{
    public static void main(String[] args){

        A obj = new A(5 , "harish");
        System.out.println(obj.name);

        // this kind of direct access should be avoided.
        obj.name = "shinchan";
        System.out.println(obj.name);

        //System.out.println(obj.num); // this will not work because num is a private member.
        // but we can access it using getters and setters.
        System.out.println(obj.getter());
        obj.setter(100);
        System.out.println(obj.getter());
    }
}

class A{
    // properties decleared as private is accessiable only with in the class.
    //int num; // this accessiable by anyone out the world.
    // inorder to hide it in the real world we'll use private.
    private int num; // accessiable only within this class.
    String name;
    int[] arr;

    public A(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    // we can access the private variable data using getters and setters.

    // example for getters and setters

    public void setter(int value){
        this.num = value;
    }

    public int getter(){
        return this.num;
    }
}