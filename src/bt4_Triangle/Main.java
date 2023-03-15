package bt4_Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a của tam giác : ");
        double side1 =scanner.nextDouble();
        System.out.println("Nhập vào cạnh b của tam giác : ");
        double side2 =scanner.nextDouble();
        System.out.println("Nhập vào cạnh c của tam giác : ");
        double side3 =scanner.nextDouble();
        System.out.println("Nhập vào màu muốn in của tam giác : ");
        String color =scanner.next();

        Triangle triangle = new Triangle(side1,side2,side3,color);
        System.out.println("Diện tích hình tam giác là : " + triangle.getArea());
        System.out.println("Chu vi hình tam giác là : " + triangle.getPerimeter());
    }
}
