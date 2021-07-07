package fruits;

public class FruitSub extends Fruit {

    public static void main(String[] args) {

        FruitSub Apple = new FruitSub();
        Apple.fruitName = "Apple";
        Apple.fruitColor = "red";
        Apple.fruitSize = "small";

        System.out.println(Apple.fruitName + " is the color " + Apple.fruitColor + " and is a " + Apple.fruitSize + " fruit!");

    }
}
