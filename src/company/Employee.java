package company;


//abstract classes cannot be instantiated
//instantiation - to create an instance (an object) of that class
//create a subclass from the abstract and then instantiate the subclass

abstract class Employee {
    //define properties
    private String salary;
    public String nameOfEmployee;
    public String department;

    //if you dont define method in abstract class, ypu must mark it abstract

    //public abstract String doWork()

    public String doWork(){
        return "I am working";
    }

}
