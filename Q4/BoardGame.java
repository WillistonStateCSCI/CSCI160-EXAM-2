/* BoardGame Class
   Anderson, Franceschi
*/

public class BoardGame extends Game {
  private int minNumberOfPlayers;
  private int maxNumberOfPlayers;
  private boolean timeLimited;

  /**
   * Constructor:<BR>
   * Allows client to set beginning value for minNumberOfPlayers,
   * maxNumberOfPlayers and timeLimited
   * This constructor takes four parameters<BR>
   * Calls super constructor
   * Calls mutator methods
   * 
   * @param description        the new description for the game
   * @param minNumberOfPlayers the minimum number of players
   * @param maxNumberOfPlayers the maximum number of players
   * @param timeLimited        whether the game is time limited
   */
  public BoardGame(String description, int minNumberOfPlayers,
      int maxNumberOfPlayers, boolean timeLimited) {
    // Add code here to complete this method
  }

  /**
   * getMinNumberOfPlayers method
   * 
   * @return an int, the minimum number of players
   */
  public int getMinNumberOfPlayers() {
    // Add code here to complete this method
  }

  /**
   * getMaxNumberOfPlayers method
   * 
   * @return an int, the maximum number of players
   */
  public int getMaxNumberOfPlayers() {
    // Add code here to complete this method
  }

  /**
   * getTimeLimited method
   * 
   * @return a boolean, whether the game is time limited
   */
  public boolean getTimeLimited() {
    // Add code here to complete this method
  }

  /**
   * Mutator method:<BR>
   * Allows client to set value of minNumberOfPlayers
   * 
   * @param minNumberOfPlayers the new minimum number players
   *                           if minNumberOfPlayers is negative
   *                           or if minNumberOfPlayers is greater than
   *                           maxNumberOfPlayers,
   *                           minNumberOfPlayers is not changed
   */
  public void setMinNumberOfPlayers(int minNumberOfPlayers) {
    // Add code here to complete this method
  }

  /**
   * Mutator method:<BR>
   * Allows client to set value of maxNumberOfPlayers
   * 
   * @param maxNumberOfPlayers the new minimum number players
   *                           if maxNumberOfPlayers is negative
   *                           ior f maxNumberOfPlayers is less than
   *                           minNumberOfPlayers,
   *                           maxNumberOfPlayers is not changed
   */
  public void setMaxNumberOfPlayers(int maxNumberOfPlayers) {
    // Add code here to complete this method
  }

  /**
   * Mutator method:<BR>
   * Allows client to set value of timeLimited
   * 
   * @param timeLimited the new value whether the game is time limited
   */
  public void setTimeLimited(boolean timeLimited) {
    // Add code here to complete this method
  }

  /**
   * @return a string representation of the pc based game
   */
  public String toString() {
    // Add code here to complete this method
  }

  /**
   * equals method
   * Compares two BoardGame objects for the same field value
   * 
   * @param o another BoardGame object
   * @return a boolean, true if this object
   *         has the same field values as the parameter bg
   */
  public boolean equals(Object o) {
    // Add code here to complete this method
  }
}