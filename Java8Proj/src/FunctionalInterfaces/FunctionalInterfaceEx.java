package FunctionalInterfaces;

@FunctionalInterface  
interface sayable3{  
    void say(String msg);  
}  
public class FunctionalInterfaceEx implements sayable3{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceEx fie = new FunctionalInterfaceEx();  
        fie.say("Hello there");  
    }  
}  