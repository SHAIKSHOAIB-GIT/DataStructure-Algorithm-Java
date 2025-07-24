package partices;

import java.util.*;

abstract class Shape {
    abstract void area(int a, int b);
}

class Circle extends Shape {
    void area(int a, int b) {
        double area = 3.14 * a * a;
        System.out.println("Circle area: " + area);
    }
}

class Rectangle extends Shape {
    void area(int a, int b) {
        int area = a * b;
        System.out.println("Rectangle area: " + area);
    }
}
class Triangle extends Shape {
    void area(int a, int b) {
        double area = 0.5 * a * b;
        System.out.println("Triangle area: " + area);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many shapes do you want to process? ");
        int n = sc.nextInt();
        

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("\nChoose shape (Circle, Rectangle, Triangle):");
            String str = sc.nextLine();
            
            int a = 0, b = 0;
             switch (str) {
                case "Cricle":
                    System.out.print("Enter radius: ");
                    a = sc.nextInt();
                    new Circle().area(a, 0);
                    break;

                case "Rectangle":
                    System.out.print("Enter length: ");
                    a = sc.nextInt();
                    System.out.print("Enter breadth: ");
                    b = sc.nextInt();
                    new Rectangle().area(a, b);
                    break;

                case "Triangle":
                    System.out.print("Enter base: ");
                    a = sc.nextInt();
                    System.out.print("Enter height: ");
                    b = sc.nextInt();
                    new Triangle().area(a, b);
                      break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    i--;
                    
            }
        }
    }
}
