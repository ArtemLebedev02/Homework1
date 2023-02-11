public class Student {
    String name;
    String surname;
    private int age;
    public int getAge() {
        return age;
    }
    public static void relax() {
        System.out.println("I'm Relaxing!");
    }
    public static void study() {
        System.out.println("I'm Studying!");
    }
    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
