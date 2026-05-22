/*
Teacher and student record system using concept of inheritance.
 */

package lab.lab03;

import  java.util.Scanner;

public class Record {
    public static void main(String[] args) {

        String sname, saddress, sgrade, tname, taddress, tsubject;
        int sage, tage, sid, tid;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter record for teacher: ");
        System.out.println("Name: ");
        tname = scn.nextLine();
        System.out.println("Id:");
        tid = scn.nextInt();
        scn.nextLine();
        //after using next___(), it leaves a extra line in buffer(\n),/
        // so before taking nextLine() must flush them
        System.out.println("Address: ");
        taddress = scn.nextLine();
        System.out.println("Age: ");
        tage = scn.nextInt();
        scn.nextLine(); //flush /n
        System.out.println("Subject:");
        tsubject = scn.nextLine();

        Teacher t = new Teacher(tname, taddress, tage, tsubject, tid);

        System.out.println("Enter record for student: ");
        System.out.println("Name: ");
        sname = scn.nextLine();
        System.out.println("Address: ");
        saddress = scn.nextLine();
        System.out.println("Grade: ");
        sgrade = scn.nextLine();
        System.out.println("Age: ");
        sage = scn.nextInt();
        System.out.println("Id: ");
        sid = scn.nextInt();

        Student s = new Student(sname, saddress, sage, sgrade, sid);

        System.out.println("------Record of Teacher------");
        t.displayInfo();

        System.out.println("------Record of Student------");
        s.displayInfo();

        scn.close();
    }
}
