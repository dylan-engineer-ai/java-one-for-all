package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter studentPrinter = new StudentPrinter();
        student01.name = "jhon";
        student01.gender = 'M';
        student01.age = 24;

        student02.name = "sak";
        student02.gender = 'F';
        student02.age = 20;

        studentPrinter.print(student01);
        studentPrinter.print(student02);

        System.out.println(student01.age);
        System.out.println(student01.name);
        System.out.println(student01.gender);

        System.out.println(student02.age);
        System.out.println(student02.name);
        System.out.println(student02.gender);

    }
}
