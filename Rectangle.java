import org.w3c.dom.css.Rect;

import java.awt.Color;




public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;

    private Color newColor;



    Rectangle(double x, double y, double width, double height) {      // Rectangle Constuctor
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return (this.height * this.width) * 2;
    }

    public double calculateArea() {
        return (this.height * this.width);
    }

    public void setColor(Color shapeColor ) {
        this.newColor = shapeColor;
    }

    public void setPos(double x , double y) {
        this.x = x;
        this.y = y;
    }

    public void setHeight(double height) {     // sets height of Triangle
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public Color getColor() {                    // gets color of rectangle
        return this.newColor;
    }

    public double getXPos() {                   // gets position of x coordinate of rectangle
        return this.x;
    }

    public double getYPos() {                    // gets position of y coordinate of rectangle
        return this.y;
    }

    public double getHeight() {                  // gets height of rectangle
        return this.height;
    }

    public double getWidth() {                    // gets width of rectangle
        return this.width;
    }




}
