// 1.  Write a program in Java to calculate the area of a rectangle using single inheritance.  
class Rectangle {

    int length = 10;
    int width = 5;
}

class Area extends Rectangle {

    void calculate() {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String args[]) {

        Area obj = new Area();
        obj.calculate();
    }
}