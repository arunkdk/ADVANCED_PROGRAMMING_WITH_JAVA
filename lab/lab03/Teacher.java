package lab.lab03;

public class Teacher extends Person {

    String subject;
    int teacher_id;

    Teacher(String name, String address, int age, String subject, int teacher_id){
        super(name, address, age);
        this.teacher_id = teacher_id;
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: "+subject);
        System.out.println("Teacher id: "+ teacher_id);
    }
}
