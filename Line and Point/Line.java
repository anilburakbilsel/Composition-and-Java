/* 
 * A Line composes of two Points - a begin point and an end point.
 */
// Line class is the composition of Point class
// We design the Line class by re-using the Point class via composition.
// A Line is "composed" of two Points.
// Composition exhibits a "has-a" relationship.
public class Line {
    // The private instance variables
    private Point begin, end;   // Object members - instances of the Point class
    // a line is the result of two points
    // always try to make private data fields (encapsulation)

    // Constructors
    // Function overload, we have two constructors depending on the arguments given
    public Line(int x1, int y1, int x2, int y2) {
       begin = new Point(x1, y1);  // Construct the instances declared
       end   = new Point(x2, y2);
    }
    public Line(Point begin, Point end) {
       this.begin = begin;  // The caller constructed the instances
       this.end   = end;
    }
  
    // The public getter and setter for the private instance variables
    public Point getBegin() {
       return begin;
    }
    public Point getEnd() {
       return end;
    }
    public void setBegin(Point begin) {
       this.begin = begin;
    }
    public void setEnd(Point end) {
       this.end = end;
    }
  
    public int getBeginX() { // this function makes a call to Point class
       return begin.getX();  // Point's getX()
    }
    public void setBeginX(int x) {
       begin.setX(x);  // Point's setX()
    }
    public int getBeginY() {
       return begin.getY();  // Point's getY()
    }
    public void setBeginY(int y) {
       begin.setY(y);  // Point's setY()
    }
    public int[] getBeginXY() {
       return begin.getXY();  // Point's getXY()
    }
    public void setBeginXY(int x, int y) {
       begin.setXY(x, y);  // Point's setXY()
    }
    public int getEndX() {
       return end.getX();  // Point's getX()
    }
    public void setEndX(int x) {
       end.setX(x);  // Point's setX()
    }
    public int getEndY() {
       return end.getY();  // Point's getY()
    }
    public void setEndY(int y) {
       end.setY(y);  // Point's setY()
    }
    public int[] getEndXY() {
       return end.getXY();  // Point's getXY()
    }
    public void setEndXY(int x, int y) {
       end.setXY(x, y);  // Point's setXY()
    }
  
    // The toString() describe itself
    public String toString() {
       return "Line[begin=" + begin + ",end=" + end + "]";
             // Invoke begin.toString() and end.toString()
    }
  
    public double getLength() {
       return begin.distance(end);  // Point's distance()
    }
 }