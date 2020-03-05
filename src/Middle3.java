/** Given a string of odd length, return the string length 3 from its middle, so
 *"Candy" yields "and". The string length will be at least 3.


    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"

**/

public class Middle3 {

  public String middleThree(String str) {

    String mid3;

    mid3 = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

    return mid3;
  }
}