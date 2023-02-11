
public class Tutor {
    static Student[] students = new Student[6];
    public void SetStudent(Student[] students) {
        Tutor.students = students;
    }
    static String Tutorname;
    static String Tutorsurname;
    static int Tutorage;
    public static void printStudentsInfo() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].name);
            System.out.println("Surname: " + students[i].surname);
            System.out.println("Age: " + students[i].getAge());
    }
}
    public static void Class() {
        Student.study();
        Student.relax();
    }
    public Tutor(String Tutorname, String Tutorsurname, int Tutorage) {
        Tutor.Tutorname = Tutorname;
        Tutor.Tutorsurname = Tutorsurname;
        Tutor.Tutorage = Tutorage;
    }

}

