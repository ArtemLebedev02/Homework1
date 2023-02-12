
public class Tutor {
    Student[] students = new Student[6];
    static String Tutorname;
    static String Tutorsurname;
    static int Tutorage;
    public void SetStudents(Student[] students) {
        this.students = students;
    }
    public void printStudentsInfo() {
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

