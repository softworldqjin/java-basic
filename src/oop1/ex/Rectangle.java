package oop1.ex;

public class Rectangle {

    int area;
    int perimeter;
    boolean square = false;

    void calculateArea(int width, int height) {
        area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter(int width, int height) {
        perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
    }

    void isSquare(int width, int height) {
        square = width == height;
        System.out.println("정사각형 여부: " + square);
    }
}
