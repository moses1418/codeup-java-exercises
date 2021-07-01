package oop;

public class warmUp {

    private String name;
    private int time;
    private int people;
    private String graduation;
    private String learning;
    private String currently;

    public warmUp(String name, int time, int people, String graduation, String learning, String currently){
        // take 4 values and inject them into fields
        this.name = name;
        this.time = time;
        this.people = people;
        this.graduation = graduation;
        this.learning = learning;
        this.currently = currently;


    }
    public warmUp(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getLearning() {
        return learning;
    }

    public void setLearning(String learning) {
        this.learning = learning;
    }

    public String getCurrently() {
        return currently;
    }

    public void setCurrently(String currently) {
        this.currently = currently;
    }

    public static void main(String[] args) {
        warmUp oberon = new warmUp("oberon", 3, 24, "october", "code","java");
    }
}
