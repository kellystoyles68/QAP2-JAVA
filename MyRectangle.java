public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;


public  MyRectangle() {
    this.topLeft = new MyPoint(0,0);
    this.bottomRight = new MyPoint(1,1);}

public MyRectangle (MyPoint topLeft, MyPoint bottomRight) {
    this.topLeft = topLeft;
    this.bottomRight = bottomRight;
}

//getter topLeft and BottomRight

public MyPoint getTopLeft(){
    return topLeft;
}

public MyPoint getBottomRight(){
    return bottomRight;
}

//setter topLeft and BottomRight

public void setTopLeft(MyPoint topLeft){
    this.topLeft = topLeft;
}

public void setBottomRight (MyPoint bottomRight){
    this.bottomRight = bottomRight;
}


public  int getWidth(){
    return Math.abs (bottomRight.getX() - topLeft.getX());
}

public int getHeight(){
    return Math.abs (bottomRight.getY() - topLeft.getY());
}

public  int getArea(){
    return getWidth() * getHeight();
}

public int getParimeter() {
    return 2 * (getWidth() + getHeight());
}

@Override
public String toString() {
    return "My Rectangle - The topLeft coordinates are: " + topLeft + " and the bottomRight coordinates are: " + bottomRight ;}};


