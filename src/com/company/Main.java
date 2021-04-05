package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(7, 8);
        Rectangle rectangle2 = new Rectangle(7, 8);
        Rectangle rectangle3 = new Rectangle(4, 4);

        System.out.println("Площадь прямоугольник " + rectangle1.calculateArea());
        System.out.println("Площадь прямоугольник " + rectangle2.calculateArea());
        System.out.println("Площадь прямоугольник " + rectangle3.calculateArea());

        System.out.println("Площадь прямоугольник " + rectangle1.printArea());
        System.out.println("Площадь прямоугольник " + rectangle2.printArea());
        System.out.println("Площадь прямоугольник " + rectangle3.printArea());

        rectangle1.printRectangleKind();
        rectangle2.printRectangleKind();
        rectangle3.printRectangleKind();

        System.out.println("Результат сравнения " + rectangle1.isTheSameRectangle(rectangle2));

    }
}
