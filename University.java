import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Продолжайте вводить параметры студентов через enter");
        System.out.println("Имя");
        System.out.println("Фамилия");
        System.out.println("Возраст");
        String name = "fer";
        String surname = "rer";
        int age = 123;
        Student student = new Student(name, surname, age);
        name = "6";
        surname = "s";
        age = 44;
        Student student1 = new Student(name, surname, age);
        name = "56";
        surname = "65";
        age = 56;
        Student student2 = new Student(name, surname, age);
        name = "465";
        surname = "3457";
        age = 43;
        Student student3 = new Student(name, surname, age);
        name = "34";
        surname = "356";
        age = 645;
        Student student4 = new Student(name, surname, age);
        name = sc.nextLine();
        surname = sc.nextLine();
        age = sc.nextInt();
        Student student5 = new Student(name, surname, age);
        System.out.println("Продолжайте вводить параметры преподавателей через enter");
        System.out.println("Имя Преподавателя");
        System.out.println("Фамилия Преподавателя");
        System.out.println("Возраст Преподавателя");
        String Tutorname = sc.nextLine();
        String Tutorsurname = sc.nextLine();
        int Tutorage = sc.nextInt();
        Tutor tutor = new Tutor(Tutorname, Tutorsurname, Tutorage);
        Tutorname = sc.nextLine();
        Tutorsurname = sc.nextLine();
        Tutorage = sc.nextInt();
        Tutor tutor1 = new Tutor(Tutorname, Tutorsurname, Tutorage);
        Tutor.Class();

        tutor.SetStudent(new Student[]{student, student1, student2});
        tutor1.SetStudent(new Student[]{student3, student4, student5});
        Tutor.printStudentsInfo();

    }
}
