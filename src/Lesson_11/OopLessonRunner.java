package Lesson_11;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
//        loadComputers(laptop,mobile);
        printInformation(new Computer[]{laptop,mobile});

    }
    public static void printInformation(Computer[] computers){
        for (Computer computer : computers){
            computer.print();
            if (computer instanceof Laptop){
                ((Laptop) computer).open();
            }
        }
    }
    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers){
         computer.load();
            System.out.println();
        }
    }
}
