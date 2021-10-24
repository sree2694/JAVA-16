package FunctionalInterfaces;

//A functional interface can extends another interface only when it does not have any abstract method.

interface sayable2{  
    void say(String msg);   // abstract method  
}  
@FunctionalInterface  
interface Doable extends sayable2{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  