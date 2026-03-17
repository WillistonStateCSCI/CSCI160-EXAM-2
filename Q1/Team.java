/* Team Class
   Anderson, Franceschi
*/

public class Team {
  private String name;
  private String hometown;

  /**
   * Constructor:<BR>
   * Allows client to set beginning value for name
   * This constructor takes one parameter<BR>
   * Calls mutator method to validate new value
   * 
   * @param newName the name of the team
   */
  public Team(String newName, String newHometown) {
    // Add code here to complete the method
  }

  /**
   * getName method
   * 
   * @return the name
   */
  public String getName() {
    // Add code here to complete the method
    return "name";
  }

  public String getHometown() {
    // Add code here to complete the method
    return "hometown";
  }

  /**
   * Mutator method:<BR>
   * Allows client to set value of name
   * 
   * @param name the new name
   * @return a reference to this object
   */
  public Team setName(String name) {
    // Add code here to complete the method
    return this;
  }

  public Team setHometown(String hometown) {
    // Add code here to complete the method
    return this;
  }

  /**
   * @return the name of the team
   */
  public String toString() {
    // Add code here to complete the method
    return "teamname";
  }

  /**
   * equals method
   * Compares two Team objects for the same field value
   * 
   * @param o another Team object
   * @return a boolean, true if this object
   *         has the same field value as the parameter t
   */
  public boolean equals(Object o) {
    // Add code here to complete the method
    return false;
  }
}