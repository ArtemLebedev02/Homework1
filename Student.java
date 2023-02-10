import java.util.Scanner;

public class Student {
    Scanner sc;
    String name;
    int age;
    int xp;
    private int height;
    void rest() {
        xp+=20;
    }
    void learning() {
        xp+=100;
    }
    public int getHeight() {
        return height;
    }
    void Student() {
        name = sc.nextLine();
        age = (int) (Math.random()*5+16);
        height = (int) (Math.random()*50+110);
        xp = 0;
    }
}