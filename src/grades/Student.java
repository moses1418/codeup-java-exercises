package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grade;

    public Student(String name) {
        this.name = name;
        this.grade = new ArrayList<>();
    }

    public static void main(String[] args) {

        Student student = new Student("Moses");
        System.out.println("Student Name: " + student.getName());

        student.addGrade(97);
        student.addGrade(80);
        student.addGrade(78);
        System.out.println("Grade's: " + student.grade);

        student.getGradeAverage();
        System.out.println("Grade Average: " + student.getGradeAverage());

        Student student1 = new Student("Erik");
        System.out.println("Student Name: " + student1.getName());

        student1.addGrade(69);
        student1.addGrade(35);
        student1.addGrade(50);
        System.out.println("Grade's: " + student1.grade);

        student1.getGradeAverage();
        System.out.println("Grade Average: " + student1.getGradeAverage());

        Student student2 = new Student("Nate");
        System.out.println("Student name: " + student2.getName());

        student2.addGrade(70);
        student2.addGrade(71);
        student2.addGrade(70);
        System.out.println("Grade's: " + student2.grade);

        student2.getGradeAverage();
        System.out.println("Grade Average: " + student2.getGradeAverage());

        Student student3 = new Student("Amado");
        System.out.println("Student Name: " + student3.getName());

        student3.addGrade(98);
        student3.addGrade(90);
        student3.addGrade(95);
        System.out.println("Grade's: " + student3.grade);

        student3.getGradeAverage();
        System.out.println("Grade Average: " + student3.getGradeAverage());

    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grade.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;

        for (int i = 0; i < grade.size(); i++) {
            sum = sum + grade.get(i);
        }
        return sum / grade.size();
    }
}
