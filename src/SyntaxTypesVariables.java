public class SyntaxTypesVariables {
    public static void main(String[] args) {

        int myFavoriteNumber = 14;
        System.out.println(myFavoriteNumber);

        String myString = "3.1234";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

//        var class = 5;

        String theNumberThree = "Three";
        Object o =theNumberThree;
        int three = (int)o;
        System.out.println(three);

        int x = 4;
        x += 5;
        System.out.println(x);

        int a = Integer.MAX_VALUE;
        System.out.println(++a);


    }
}
