// 1. Write a program in Java to create a class and access all data members and methods using the object and compute the area and perimeter of a circle.                                                                              

class Circle {

    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double perimeter() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {

        Circle c = new Circle(5);

        System.out.println("Area = " + c.area());
        System.out.println("Perimeter = " + c.perimeter());
    }
}