/* Method that converts integer grades of an ArrayList to letter grades
*  Anderson, Franceschi
*/

import java.util.ArrayList;

public class LetterGrades
{
  public static void main( String [] args )
  {
    ArrayList<Integer> grades = new ArrayList<Integer>( );
    for (int i=0;i<args.length;i++){
      grades.add(Integer.parseInt(args[i]));
    }

    ArrayList<Character> letterGrades = convertToLetterGrades( grades );

    System.out.println( "The integer grades are:" );
    displayArrayListOfInts( grades );

    System.out.println( "\nThe letter grades are:" );
    displayArrayListOfChars( letterGrades );
  }

  public static ArrayList<Character> convertToLetterGrades( ArrayList<Integer> intGrades )
  {
    // Add code here to complete the method
    return new ArrayList<Character>();
  }

  public static void displayArrayListOfInts( ArrayList<Integer> intArrayList )
  {
    for ( Integer i : intArrayList )
    {
      System.out.print( i + " " );
      System.out.println( );
    }
  }

  public static void displayArrayListOfChars( ArrayList<Character> charArrayList )
  {
    for ( Character c : charArrayList )
    {
      System.out.print( c + " " );
      System.out.println( );
    }
  }
}