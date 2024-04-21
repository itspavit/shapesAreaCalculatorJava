import java.util.*;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuLoop();
    }

    private static void menuLoop(){
        boolean continueLoop = true;
        while(continueLoop){
            System.out.println("Menu options: ");
            System.out.println("1: Find area of Circle");
            System.out.println("2: Find area of Triangle");
            System.out.println("3: Find area of Rectangle");
            System.out.println("4: Find area of Parallelogram");
            System.out.println("5: Find area of Rhombus");
            System.out.println("6: Find area of Equilateral Triangle");
            System.out.println("7: Exit");
            System.out.println("\nPlease enter your number for your choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); //consumes newline
            switch (choice){
                case 1:
                    areaOfCircle();
                    break;
                case 2:
                    areaOfTriangle();
                    break;
                case 3:
                    areaOfRectangle();
                    break;
                case 4:
                    areaOfParallelogram();
                    break;
                case 5:
                    areaOfRhombus();
                    break;
                case 6:
                    areaOfEquilateralTriangle();
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice from the List");
                    break;
            }
        }
    }

    private static double areaOfCircle(){
        System.out.println("Please enter the radius of the circle to calculate its area ");
        double radius = scanner.nextDouble();
        double area = Math.PI*(radius*radius);
        System.out.println("Area of the circle is: " + area+ "\n");
        return area;
    }

    private static double areaOfTriangle(){
        System.out.println("Please enter the length of the base of triangle ");
        double base = scanner.nextDouble();
        System.out.println("Please enter the height of the triangle ");
        double height = scanner.nextDouble();
        double area = (base*height)/2;
        System.out.println("Area of the triangle is: " + area+ "\n");
        return area;
    }

    private static double areaOfRectangle(){
        System.out.println("Please enter width of rectangle ");
        double width = scanner.nextDouble();
        System.out.println("Please enter length of rectangle ");
        double length = scanner.nextDouble();
        double area = width*length;
        System.out.println("Area of rectangle is: " + area+ "\n");
        return area;
    }

    private static double areaOfParallelogram(){
        System.out.println("Please enter base of parallelogram ");
        double base = scanner.nextDouble();
        System.out.println("Please enter height of parallelogram ");
        double height = scanner.nextDouble();
        double area = base*height;
        System.out.println("Area of parallelogram is: " + area + "\n");
        return area;
    }

    private static double areaOfRhombus(){
        System.out.println("Please enter the length of p diagonal ");
        double pDiagonal = scanner.nextDouble();
        System.out.println("Please enter the length of q diagonal ");
        double qDiagonal = scanner.nextDouble();
        double area = (pDiagonal*qDiagonal)/2;
        System.out.println("Area of the Rhombus is: " + area + "\n");
        return area;
    }

    private static double areaOfEquilateralTriangle(){
        System.out.println("Please enter the length of the side of triangle ");
        double side = scanner.nextDouble();
        double area = (Math.sqrt(3)/4)*(side*side);
        System.out.println("Area of equilateral triangle is: " + area+ "\n");
        return area;
    }
}