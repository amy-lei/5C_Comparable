/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* cast into Point */
        Point other = (Point)otherObj;
        
        /* compare the distance squared of the two */
        int thisDist = (int)(xcor * xcor + ycor * ycor);
        int otherDist = (int)(other.getXcor() * other.getXcor() + other.getYcor() * other.getYcor());
        return thisDist - otherDist;
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }
    
    public double getXcor(){
        return xcor;
    }
    
    public double getYcor(){
        return ycor;
    }

}