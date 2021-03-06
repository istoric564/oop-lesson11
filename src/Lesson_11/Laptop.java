package Lesson_11;

/**
 * Laptop <- Computer <- Object
 * final - запрет наследования.
 */
public final class Laptop extends Computer {

    private int weight;
//    Блоки инициализации
//    {
//        System.out.println("init block laptop");
//    }
//    static {
//        System.out.println("static block laptop");
//    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
//        Обязательно использовать эту строку при наследовании, для обращения к классу.
        super(ssd, ram);
        this.weight = weight;
//        У каждого класса есть две ссылки, this на поля конкретного класса, super на все то,что было наследовано.
    }
    public Laptop() {
        System.out.println("Constructor laptop ");
    }

    @Override
    public void print() {
//        super.print();
        System.out.println("Weight: " + getWeight());
        
    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");
    }

    public void open(){
        System.out.println("Открыл крышку.");
    }

    public int getWeight() {
        return weight;
    }
}
