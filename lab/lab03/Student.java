package lab.lab03;

public class Student extends Person {

    String grade;
    int student_id;

    Student(String name, String address, int age, String grade, int student_id) {
        super(name, address, age);
        this.grade = grade;
        this.student_id = student_id;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: "+grade);
        System.out.println("Student id: "+student_id);
    }

}
