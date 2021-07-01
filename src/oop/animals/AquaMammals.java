package oop.animals;

public class AquaMammals extends MarineAnimals{

    private int maxTimeSubmerged;

    public AquaMammals(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, int maxTimeSubmerged) {
        super(canSwim, length, finCount, isSaltWater, name);
        this.maxTimeSubmerged = maxTimeSubmerged;
    }

    public AquaMammals(String name){
        super(name);
    }

    public AquaMammals(){}

    public int getMaxTimeSubmerged(){
        return maxTimeSubmerged;
    }

    public void setMaxTimeSubmerged(int maxTimeSubmerged){
        this.maxTimeSubmerged = maxTimeSubmerged;
    }

}


