package com.company;

public class Rectangle {
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x) {
        y = x;
        this.x = x;
        this.y = x;
    }

    double calculateArea() {
        return x * y;
    }

    double printArea() {
        return calculateArea();
    }

    void printRectangleKind() {
        if (x == y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }


    boolean isTheSameRectangle(Rectangle rectangle) {
        if (this.x == rectangle.x & this.y == rectangle.y) {
            return true;
        } else {
            return false;
        }
    }
}


