import java.util.Scanner;

public class Tutor {
    Scanner sc;
    String name;
    int age;
    private int height;
    protected Student[] students;
    public Tutor(Student[] students) {
        Tutor.students = students;
    }
    public void Tutor() {
        name = sc.nextLine();
        age = (int) (Math.random() * 5 + 22);
        height = (int) (Math.random() * 50 + 110);
        Student.Student();
    }
    public int getHeight() {
        return height;
    }
    public Student[] getStud() {
        return students;
    }
    public void printStudentsInfo() {
        for (Student student : students) {
            System.out.println("Name: " + Student.name + ", Age: " + Student.age + ", Height: " + Student.getHeight());
        }
    }
    public void Class() {
        for (Student student : students) {
            Student.learning();
            Student.rest();
        }
    }
}

