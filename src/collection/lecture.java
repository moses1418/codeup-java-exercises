package collection;

import java.util.ArrayList;

public class lecture {
    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>(), stringArrCopy = new ArrayList<>();


        //add first element
        stringArr.add("moses");
        System.out.println(stringArr);
        System.out.printf("current ArrayList size %s" , stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());



        //add second element
        stringArr.add("mawcus");

        System.out.println(stringArr);
        System.out.printf("current ArrayList size %s" , stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());


        System.out.println("Array list copy: ");
        System.out.println(stringArrCopy);
        System.out.println("Copied list hashcode: ");
        System.out.println(System.identityHashCode(stringArrCopy));
    }
}
