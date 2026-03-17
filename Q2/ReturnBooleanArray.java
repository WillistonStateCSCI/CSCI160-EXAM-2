/* Method that accepts an int array and
*  returns a boolean array indicating which elements are >= 100
*  Anderson, Franceschi
*/

public class ReturnBooleanArray
{
  public static void main( String [] args )
  {
    int [] array = new int[args.length];

    for(int i=0;i<args.length;i++){
      array[i]=Integer.parseInt(args[i]);
    }

    System.out.print( "The elements of the int array are " );
    for ( int i = 0; i < array.length; i++ )
       System.out.print( array[i] + " " );
    System.out.println( );

    boolean [] oneHundreds = intToBoolean( array );

    System.out.print( "The elements of the boolean array are " );
    for ( int i = 0; i < oneHundreds.length; i++ )
       System.out.print( oneHundreds[i] + " " );
    System.out.println( );
  }

  public static boolean [] intToBoolean( int [] intArray )
  {
    // Add code here to create the array of booleans
    return new boolean[3];
  }

}