import java.awt.Color;



public class Triangle {
    private double x;
    private double y;
    private double width;
    private double height;

    private Color newColor;



    Triangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

     public double calculatePerimeter() {      //Perimeter of Triangle
        return (this.width * this.height) / 2;
     }

     public double calculateArea () {           // Area of Triangle
         return (this.width * this.height) / 0.5;
     }

    public void setColor(Color color) {     // sets color of Triangle
        this.newColor = color;
    }


    public void setPos(double x, double y) {    // sets position of Triangle
        this.x = x;
        this.y = y;
    }

    public void setHeight(double height) {     // sets height of Triangle
        this.height = height;
    }

    public void setWidth(double width){         // sets width of Triangle
        this.width = width;
    }

    public Color getColor() {                    // gets color of Triangle
        return this.newColor;
    }

    public double getXPos() {                   // gets position of x coordinate of Triangle
        return this.x;
    }

    public double getYPos() {                    // gets position of y coordinate of Triangle
        return this.y;
    }

    public double getHeight() {                  // gets height of triangle
        return this.height;
    }

    public double getWidth() {                    // gets width of triangle
        return this.width;
    }



}
