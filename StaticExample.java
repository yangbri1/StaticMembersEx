class StaticExample {

    // initialize static variable
    static int a = 10;
      
    // create instance variable
    int b = 20;
      
    // given static method (of void type -- no return)
    static void m1(){
        // 'static' variable 'a' as its within static method
        a = 20;
        System.out.println("from m1");
          
        // Cannot make a static reference to the non-static field 'b' ...
        // b = 10;  // compilation error

        /* create a instance of class to access non-static instance variable 'b' ... */
        StaticExample statInstance = new StaticExample();

        // now we have access to non-static field 'b' ... & can re-assign to value 10
        statInstance.b = 10;

        // Cannot make a static reference to the 
                // non-static method m2() from the type Test
        // m2();  // compilation error
        
        // also have access to non-static method 'm2()' ... call m2()
        statInstance.m2();
        
        /* Sadly accessing referring to "this" and "super" keyword is disallowed for static members --- Sorry! :'( */
        //  Cannot use super in a static context
        // System.out.println(super.a); // compiler error 
    }
      
    // instance method
    void m2(){    
        System.out.println("from m2");
    }

    // check it out --- main() method in Java is also static by default   
    public static void main(String[] args) {
        // invoke 'm1()' method is possible as it's a static method
        m1();
    }
}