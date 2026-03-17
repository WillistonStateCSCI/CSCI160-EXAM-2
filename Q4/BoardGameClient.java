/* BoardGameClient class
   Anderson, Franceschi
*/

public class BoardGameClient
{
  public static void main( String [] args )
  {
    BoardGame bg1 = new BoardGame( "Chess", 2, 2, true );
    BoardGame bg2 = new BoardGame( "Monopoly", 2, 6, false );

    System.out.println("Board Game 1:");
    System.out.println( bg1 );
    System.out.println("Board Game 2:");
    System.out.println( bg2 );

    System.out.println();

    System.out.println("Setting BG2 number of players to 2 and adding a time limit:");
    bg2.setMaxNumberOfPlayers( 2);
    bg2.setTimeLimited( true );

    System.out.println("New Board Game 2:");
    System.out.println( bg2 );

    if ( bg1.equals( bg2 ) )
      System.out.println( "bg1 and bg2 are equal" );
    else
      System.out.println( "bg1 and bg2 are not equal" );

    System.out.println();

    System.out.println("Setting BG2 description to Chess:");
    bg2.setDescription( "Chess" );

    System.out.println("New Board Game 2:");
    System.out.println( bg2 );

    if ( bg1.equals( bg2 ) )
      System.out.println( "bg1 and bg2 are now equal" );
    else
      System.out.println( "bg1 and bg2 are still not equal" );
  }
}