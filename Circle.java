// Mohamed Farah, farah266
import java.awt.Color;


public class Circle {
    private double x;
    private double y;
    private double radius;
    private Color newcolor;

    Circle(double x, double y, double radius) {   //Contructor
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public double calculatePerimeter() {      // calculate perimater method
        return 2 * 3.14 * this.radius;
    }


    public double calculateArea() {           // calculate area of a Circle
        return 3.14 * Math.pow(this.radius, 2);

    }


    public void setColor(Color newColor) {     // set color method
        this.newcolor = newColor;

    }


    public void setPos(double x, double y) {  // sets position
        this.x = x;
        this.y = y;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public Color getColor() {
        return this.newcolor;
    }

    public  double getXPos() {
        return this.x;
    }

    public double getYPos() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }



}
