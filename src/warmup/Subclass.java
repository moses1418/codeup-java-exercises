package warmup;

public class Subclass extends Parent {

    public static String imTheSubclass(){
        System.out.println("I am the sub class");
        return imTheSubclass();
    }
}
