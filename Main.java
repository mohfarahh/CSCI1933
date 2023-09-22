import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Functions of Circle Class
        Circle one = new Circle(2.3,3.4, 4);
        System.out.println(one.getXPos());
        System.out.println(one.getYPos());
        System.out.println(one.getRadius());
        System.out.println(one.calculatePerimeter());
        System.out.println(one.calculateArea());
        one.setColor(Color.BLUE);
        System.out.println(one.getColor());

        //functions of triangle  class
        Triangle two = new Triangle(2.3,3.4,4,5);
        System.out.println(two.getXPos());
        System.out.println(two.getYPos());
        System.out.println(two.getHeight());
        System.out.println(two.getWidth());
        System.out.println(two.calculatePerimeter());
        System.out.println(two.calculateArea());
        two.setColor(Color.RED);
        System.out.println(two.getColor());

        // Functions of Rectangle class
        Rectangle three = new Rectangle(2.3,3.4,4,5);
        System.out.println(three.getXPos());
        System.out.println(three.getYPos());
        System.out.println(three.getHeight());
        System.out.println(three.getWidth());
        System.out.println(three.calculatePerimeter());
        System.out.println(three.calculateArea());
        three.setColor(Color.GREEN);
        System.out.println(three.getColor());

    }
    
    
}





// Mohamed Farah, farah266


