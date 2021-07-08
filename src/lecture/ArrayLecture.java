package lecture;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {

    public static void main(String[] args) {
        System.out.println("How many numbers would you like to choose?");

//        System.out.println(Arrays.toString(new int[scanner.nextInt()],));

    }

//    public static int[] setIntArrray(int [] intArray){
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println("Please enter an integer: ");
//            intArray[i] = scanner.nextInt();
//
//        }
//        return setIntArrray();
//    }

    public static int[] getIntArray(){

        return new int[]{1, 2, 3};
    }

    public static int[] getIntArray(int length){

        int[] intArray = new int[length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
        return intArray;
    }

//    public static String[] getNameArray(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many names do you want to enter? ");
//
//        String[] namesArray = new String[(int)scanner.tokens().count()];
//        return;
//    }


}






















