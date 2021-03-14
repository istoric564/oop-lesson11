package Lesson_11;

public class Laptop extends Computer {

    private int weight;


    public Laptop(Ssd ssd, Ram ram, int weight) {
//        Обязательно использовать эту строку при наследовании, для обращения к классу.
        super(ssd, ram);
        this.weight = weight;
//        У каждого класса есть две ссылки, this на поля конкретного класса, super на все то,что было наследовано.
    }
    public void open(){
        System.out.println("Открыл крышку.");
    }

    public int getWeight() {
        return weight;
    }
}
