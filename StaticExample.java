/* Overview for Static Members:
- Static members consists of blocks, variables, methods, classes
- instance variables have multiple copies, static members only have 1 copy
- instance variables/methods are accessed via objects, static members are accessed via class itself (not thru objs)

 */
class StaticExample {

    // initialize static variable
    static int a = 10;
      
    // create instance variable --- will be prevalent in each instance of class 'StaticExample' (aka obj) in some sense as properties/states
    int b = 20;
      
    // given static method (of void type -- no return)
    static void m1(){
        // 'static' variable 'a' as its within static method
        /* Note: Static type variables are of only 1 copy ------- I repeat: 1 copy ------- while instance type variables have multiple copies */
        a = 20;
        System.out.println("from m1");
          
        // Cannot make a static reference to the non-static field 'b' ...
        // b = 10;  // compilation error

        /* create a instance of class to access non-static instance variable 'b' ... */
        StaticExample statInstance = new StaticExample();

        // now we have access to non-static field 'b' ... & can re-assign to value 10
        /* Note: You access an instance variable through an obj  --- hence dot notation here */
        statInstance.b = 10;

        // Cannot make a static reference to the 
                // non-static method m2() from the type Test
        // m2();  // compilation error
        
        // also have access to non-static method 'm2()' ... call m2()
        /* Note: Similarly to access an instance method -- use dot notation to access obj -- as instance methods below to obj */
        statInstance.m2();
        
        /* Sadly accessing referring to "this" and "super" keyword is disallowed for static members --- Sorry! :'( */
        //  Cannot use super in a static context
        // System.out.println(super.a); // compiler error 
    }
      
    // instance method
    // a behavior specific to 'StaticExample' (will be within each individual obj)
    void m2(){    
        System.out.println("from m2");
        // instance methods could call static variables inside --- but static methods can NOT call instance variables within
        // in addition do NOT need to explicitly reference to class (i.e. StaticExample.b) as this INSTANCE method is inside the 'StaticExample' class already so JDM will assume so
    }

    // check it out --- main() method in Java is also static by default   
    public static void main(String[] args) {
        // invoke 'm1()' method is possible as it's a static method
        m1();
    }
}