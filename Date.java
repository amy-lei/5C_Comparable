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
    public int compareTo(Object otherObj){
        /* cast into Dated */
        Date other = (Date)otherObj;
        
        /** check distance from 0AD **/
        int thisDist  =  y * 365 + m * 30 + d; 
        int otherDist =  other.getY() * 365 + other.getM() * 30 + other.getD();
        return - (thisDist - otherDist);
        
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }
    
    public int getY(){
        return y;
    }
    public int getM(){
        return m;
    }
    public int getD(){
        return d;
    }

}