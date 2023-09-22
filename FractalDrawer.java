// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;
import java.util.Random;

public class FractalDrawer {
    private double totalArea = 0; // member variable for tracking the total area
    public FractalDrawer() {} // contructor
//TODO:
// drawFractal creates a new Canvas object
// and determines which shapes to draw a fractal by calling appropriate helper function

    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas obj = new Canvas();

        if (type.equals("rectangle")) {
            drawRectangleFractal(200,200, 200,200, Color.GREEN ,obj,0) ;
        }
        else if (type.equals("circle")) {
            //drawCircleFractal(200,200, 200,200);

        } else if (type.equals("triangle")) {
            drawTriangleFractal(50,40, 400,400, Color.GREEN ,obj,0);
        }
        else {
         System.out.println("Incorrect output");
        }

        return  totalArea;
    }
    //TODO:
// drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double
            y, Color c, Canvas can, int level){
        //Canvas newCanvas = new Canvas();

        Triangle tri = new Triangle(x, y, width, height);
        tri.setColor(Color.RED);


        if (level > 8) {
            can.drawShape(tri);
            drawTriangleFractal(width / 2, height / 2, x -width/2, y-height/2  , c , can, level + 1);
            drawTriangleFractal(width / 2, height / 2, x +width, y  , c , can, level + 1);
            drawTriangleFractal(width / 2, height / 2, x , y+(height/2) , c , can, level + 1);




        }

    }
    // TODO:
// drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c,
                                  Canvas can, int level) {
    }
    //TODO:
// drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double
            y, Color c, Canvas can, int level) {

    }
//TODO:
// main should ask user for shape input, and then draw the corresponding
    //should print area of fractal
    public static void main(String[] args){
        Scanner shape = new Scanner(System.in);
        System.out.println("Please enter shape: ");
        String input = shape.nextLine();

        FractalDrawer drawer = new FractalDrawer();
        drawer.drawFractal(input);




        System.out.println("Area: " + drawer.totalArea);

    }
}
