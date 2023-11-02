import java.util.Scanner;
public class Test{
public static void main(String[] args) throws Exception {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter the color of the triangle: ");
    String color = myObj.nextLine();
    System.out.println("Please enter side 1 of the triangle: ");
    Double side1 = myObj.nextDouble();
    System.out.println("Please enter side 2 of the triangle: ");
    Double side2 = myObj.nextDouble();
    System.out.println("Please enter side 3 of the triangle: ");
    Double side3 = myObj.nextDouble();

    System.out.println("Please enter True if triangle is filled and False if triangle is not: ");
    Boolean filled = myObj.nextBoolean();

    Triangle triangleObj = new Triangle(side1 ,side2 , side3);
    triangleObj.setColor(color);
    triangleObj.setFilled(filled);
    myObj.close();

    System.out.println("The color is " + triangleObj.getColor());
    System.out.println("The area is " + triangleObj.getArea());
    System.out.println("The perimeter is " + triangleObj.getPerimeter());
    System.out.println("It is "+ triangleObj.isFilled() + " that the triangle is filled. ");12
}
}