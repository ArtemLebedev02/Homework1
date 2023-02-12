import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Продолжайте вводить параметры студентов через enter");
        System.out.println("Имя");
        System.out.println("Фамилия");
        System.out.println("Возраст");
        String name = sc.nextLine();
        String surname = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        Student stud = new Student(name, surname, age);
        name = sc.nextLine();
        surname = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        Student stud1 = new Student(name, surname, age);
        name = sc.nextLine();
        surname = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        Student stud2 = new Student(name, surname, age);
        name = sc.nextLine();
        surname = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        Student stud3 = new Student(name, surname, age);
        name = sc.nextLine();
        surname = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        Student stud4 = new Student(name, surname, age);
        name = sc.nextLine();
        surname = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        Student stud5 = new Student(name, surname, age);
        System.out.println("Продолжайте вводить параметры преподавателей через enter");
        System.out.println("Имя Преподавателя");
        System.out.println("Фамилия Преподавателя");
        System.out.println("Возраст Преподавателя");
        String Tutorname = sc.nextLine();
        String Tutorsurname = sc.nextLine();
        int Tutorage = sc.nextInt();
        sc.nextLine();
        Tutor tutor = new Tutor(Tutorname, Tutorsurname, Tutorage);
        Tutorname = sc.nextLine();
        Tutorsurname = sc.nextLine();
        Tutorage = sc.nextInt();
        Tutor tutor1 = new Tutor(Tutorname, Tutorsurname, Tutorage);
        Tutor.Class();
        tutor.SetStudents(new Student[]{stud, stud1, stud2});
        tutor1.SetStudents(new Student[]{stud3, stud4, stud5});
        tutor.printStudentsInfo();
        tutor1.printStudentsInfo();

    }
}
