package company;

//extends keyword to create a subclass to employee

public class Manager extends Employee {


    public static void main(String[] args) {
        Manager Susy = new Manager();
        Susy.nameOfEmployee = "Susy";
        Susy.department = "marketing";
        System.out.println(Susy.nameOfEmployee + " works as a manager in the: " + Susy.department);


    }
}
