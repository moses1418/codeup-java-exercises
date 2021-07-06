package warmup;

public class Parent {
    public static String imTheParent(){
        System.out.println("I am the parent");
        return imTheParent();
    }
}
