import java.lang.Math;

public class Triangle extends GeometricObject {
   private double side1 = 1.0;
   public double side2 = 1.0;
   public double side3 = 1.0;
    

   Triangle(){

   }

   Triangle(double newSide1, double newSide2, double newSide3){
    side1= newSide1;
    side2 = newSide2;
    side3 = newSide3;
   }

   public double getSide1(){
    return side1;
   }

   public double getSide2(){
    return side2;
   }
   public double getSide3(){
    return side3;
   }

   public double getArea(){
    double s = (side1 + side2 + side3)/2;
    return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
   }

   public double getPerimeter(){
    return side1 + side2 + side3;
   }

   public String toString(){
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
   }
}
