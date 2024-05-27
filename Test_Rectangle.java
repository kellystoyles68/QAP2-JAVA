public class Test_Rectangle {
    
    public static void main (String[] args) {

        //create instances
        MyPoint p1 = new MyPoint (4,6);
        MyPoint p2 = new MyPoint (14,16);

        MyRectangle rectangle =  new MyRectangle(p1,p2);

        //Print details
        System.out.println ();
        System.out.println ();
        System.out.println (rectangle);
        System.out.println ();
        System.out.println ("The width of my rectangle is: " + rectangle.getWidth());
        System.out.println ();
        System.out.println ("The height of my rectangle is: " + rectangle.getHeight());
        System.out.println ();
        System.out.println ("The area of my rectangle is: " + rectangle.getArea());
        System.out.println ();
        System.out.println ("The perimeter of my rectangle is: " + rectangle.getParimeter());
        System.out.println();
    }
}
