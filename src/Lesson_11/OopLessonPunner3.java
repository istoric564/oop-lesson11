package Lesson_11;

public class OopLessonPunner3 {
    public static void main(String[] args) {
        Printable laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new Mobile(new Ssd(125), new Ram(512));

        printWithRandom(laptop,mobile);
    }
    public static void print(Printable... objects){
//        iter
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }
    public static void printWithRandom(Printable... objects){
//        iter
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}
