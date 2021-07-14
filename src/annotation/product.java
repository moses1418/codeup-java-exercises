package annotation;
//
//@NameofAnnotation // syntax
//
//@entity
//public class product {
//    //define property name
//    @persistent
//    protected String name = null;
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(name){
//        this.name = name;
//    }
//}

import java.util.ArrayList;

class AnnotationsMain{

    public static void main(String[] args) {
        //suppress warning - suppresses any warnings
        @SuppressWarnings("unused")
        int randomNum = (int) (Math.random()*10);
        System.out.println(randomNum);
    }
}

//@Override - checks to see if the parent class has the same method
// tells the compiler that the method will be override
// meet the specs of a particular class in which you're using the method
// catch any error - at compile






