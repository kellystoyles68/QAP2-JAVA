public class TestMyLine {

public  static void main (String[] args){
    MyPoint p1 = new MyPoint (10,12);
    System.out.println();
    System.out.println();
    System.out.println ("P1: " + p1);
    
    MyPoint p2 = new MyPoint (15,132);
    System.out.println ("P2: " + p2);
    
    //TEST MY LINE
    System.out.println();
    MyLine line1= new MyLine (p1,p2);
    System.out.println ("Line 1: " + line1);

    MyLine line2 = new MyLine(3,5,21,23);
    System.out.println("Line 2: "+ line2);

    //test get methods
    System.out.println();
    System.out.println("Line 1 begin: "+ line1.getBegin());
    System.out.println("Line 1 ends: " + line1.getEnd());

    //test methods
    System.out.println();
    System.out.println ("Length: " + line1.getLength());
    System.out.println ("Gradient: " + line1.getGradient());
    System.out.println();
}}