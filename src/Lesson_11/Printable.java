package Lesson_11;

import java.util.Random;

public interface Printable {
//    Модификатор доступа, тип, по умолчанию public static final
        String SOME_VALUE = "Example";
        Random RANDOM = new Random();
        default void printWithRandom(){
                System.out.println(RANDOM.nextInt());
                print();
        }
        void print();

        private int generateRandom(){
                return RANDOM.nextInt();
        }
}
