package homeWork;

import java.util.Scanner;

public class CalculateArea {
    public static double Side;
    public static double Length;
    public static double Width;
    public static double Base;
    public static double Height;
    public static double R;
    public static double PI = 3.14;
    public static String Shape;
    public static double AreaOfTheShape;
    public static String Square;
    public static String Rectangle;
    public static String Triangle;
    public static String Circle;

    public static void main(String[] args) {
        surface();
    }

    public static void surface() {
        System.out.println("Entre the Side: ");
        Scanner scanner = new Scanner(System.in);
        double Side = scanner.nextDouble();
        System.out.println("Entre the Length: ");
        double Length = scanner.nextInt();
        System.out.println("Entre the Height: ");
        double Height = scanner.nextInt();
        System.out.println("Entre the Base: ");
        double Base = scanner.nextDouble();
        System.out.println("Entre the R: ");
        double R = scanner.nextInt();
            if (Side <= 0 || Length <= 0) {
                System.out.println("please Enter a number greater than zero");
                return;
            } else if (Side > 0 && Length > 0) {

                if (Side == Length) {
                    Shape = "Square";
                }
                if (Side < Length) {
                    Shape = "Rectangle";
                }
                if (Base == Length) {
                    Shape = "Triangle";
                }
                if (R > 0) {
                    Shape = "Circle";
                }
                switch (Shape) {
                    case "Square": {
                        AreaOfTheShape = Math.pow(Side, 2);
                        System.out.printf("%.2f", AreaOfTheShape);
                        break;
                    }
                    case "Rectangle": {
                        AreaOfTheShape = Side * Length;
                        System.out.printf("%.2f", AreaOfTheShape);
                        break;
                    }
                    case "Triangle": {
                        AreaOfTheShape = Base / 2 * Height;
                        System.out.printf("%.2f", AreaOfTheShape);
                        break;
                    }
                    case "Circle": {
                        AreaOfTheShape = PI * (Math.pow(R, 2));
                        System.out.printf("%.2f", AreaOfTheShape);
                        break;
                    }

                }
            }
            System.out.println("\nthe shape is: " + Shape + " " + AreaOfTheShape);
        }
    }


