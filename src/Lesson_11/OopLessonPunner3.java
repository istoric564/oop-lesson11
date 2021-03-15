package Lesson_11;

public class OopLessonPunner3 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        print(laptop,mobile);
    }
    public static void print(Printable... objects){
        for (Printable object : objects) {
            object.print();
        }
    }
}
