 public class MyPoint{
    private int x;
    private int y;

    //parameterized constructor
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    //get methods

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

     //set methods
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
 
 @Override
 public String toString(){
    return  "(" + x + ", " + y + ")";
}
}

