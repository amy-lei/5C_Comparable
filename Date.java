/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this date is closer, 
      equidistant, or farther to 0 A.D. than the Date referred to
      by the parameter.
     */
    public int compareTo(Object other){
        /** check distance from 0AD **/
        int thisDist  =  (double)(y * 365 + m * 30 + d); 
        int otherDist =  (double)(other.y * 365 + other.m * 30 + other.d);
        return - (thisDist - otherDist);
        
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}