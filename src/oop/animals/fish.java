package oop.animals;

public class fish extends MarineAnimals{

    private boolean hasScales;


    public fish(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, boolean hasScales) {
        super(canSwim, length, finCount, isSaltWater, name);
        this.hasScales = hasScales;
    }

    public fish(String name){
        super(name);
    }

    public fish(){}

    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
}

