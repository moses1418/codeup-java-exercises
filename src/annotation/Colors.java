package annotation;

class Red {
    public void showFavRainbowColor(){
        System.out.println("I am red");
    }
}

class Orange extends Red {
    @Override // comments for the compiler // it checks to see if that
    // comment is doing what it's supposed to

    // hey this method should be overriding the method in its parent
    //class of red
    public void showFavRainbowColor(){
        System.out.println("I am orange");
    }
}


public class Colors {

    public static void main(String[] args) {
        Red redobj = new Red();
        Orange orangeobj = new Orange();
        redobj.showFavRainbowColor();
        orangeobj.showFavRainbowColor();
    }
}
