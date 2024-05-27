public class MyLine {
    private  MyPoint begin;
    private  MyPoint end;
    
    
    public MyLine (int x1, int y1, int x2, int y2){
       this.begin = new MyPoint(x1, y1);
        this.end  = new MyPoint(x2, y2);
    }

    public MyLine (MyPoint begin, MyPoint end) {
    this.begin = begin;
    this.end = end;
    }   
    
    public MyPoint getBegin(){
    return begin;
    }

    public void setBegin (MyPoint begin){
        this.begin = begin;
    }
    
    public MyPoint getEnd ()
    {return end;}
    
    
    public void setEnd (MyPoint end){
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }
    
    public void setBeginX (int x){
        begin.setX(x);
    }

    public int getBeginY(){
        return begin.getY();
    }
        
    public void setBeginY (int Y){
        begin.setY(Y);
    }

    public int getEndX() {
        return end.getX();
    }
    
    public void setEndX (int x) {
        end.setX(x);
    }
        
    public int getEndY(){
        return end.getY();
    }
            
    public void setEndY (int Y){
         end.setY(Y);
    }

    public int [] getBeginXY() {
        return new int [] {getBeginX() +  getBeginY()};
     }
    
    public void setBeginXY (int x, int y){
        begin.setX(x);
        begin.setY(y);
    }

    public double getLength(){
        int xDiff = end.getX() - begin.getY();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt (xDiff *xDiff) + (yDiff * yDiff);
    }

@Override
public String toString(){
    return "MyLine[begin = " + begin + ", end = " + end + "]";
}

public double getGradient(){
    int xDiff = end.getX() - begin.getX();
    int yDiff = end.getY() - begin.getY();
    return Math.atan2(yDiff, xDiff);
}
}