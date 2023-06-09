package JavaCore.Seminar1.main;

import JavaCore.Seminar1.mechanisms.Decorator;
import JavaCore.Seminar1.mechanisms.OtherClass;

/**
 * Основной класс приложения.
 **/

public class Main {

    /**
     * Точка входа в программу.
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.sum(3, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(3, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(3, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(3, 5);
        System.out.println(Decorator.decorate(result));
    }
}
