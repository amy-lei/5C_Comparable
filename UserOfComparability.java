/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");
        
        System.out.println( System.lineSeparator()
                          + "Date comparisons");

        // Date vs itself
        Date d0 = new Date(2001,5,12);
        reportRelationship( "Date vs. itself", d0, d0, "0");
        // Date vs closer date
        reportRelationship( "Date vs. closer", d0, new Date(1990, 5, 12), "negative int");
        // Date vs further date
        reportRelationship( "Date vs. further", d0, new Date(2020, 10, 11), "negative int");

        // // Dog vs dog?
        // IncomparableDog doggo = new IncomparableDogDog();
        // reportRelationship( "Dog vs. dog?", doggo, doggo, "negative int");
        
        // // Date vs point?
        // reportRelationship( "Date vs. Point?", d0, p0, "negative int");
    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}