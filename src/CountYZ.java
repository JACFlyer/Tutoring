import java.util.ArrayList;
import java.util.List;

/** Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
 * and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that
 * a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

 countYZ("fez day") → 2
 countYZ("day fez") → 2
 countYZ("day fyyyz") → 2


 / Example using indexOf() to find all the instances of "OOP" in a string
 void findOOP(String str) {
 int start = 0;
 while (true) {
 int found = str.indexOf("OOP", start);
 if (found != -1) {
 // Found one -- do whatever here
 }
 if (found == -1) break;
 start = found + 2;  // move start up for next iteration
 }
 }


 Suppose you have a string like this:"Once there was a woman name:angelina: and a man
 name:tony: and their friend name:jane: and ...". Inside of a long text there are little "name:"
 sections. Write code to find and print all the names. Demonstrates a more complex use of indexOf()
 and substring() in a loop to parse a string:
 public void printNames(String string) {
 int i = 0;
 while (true) {
 int found = string.indexOf("name:", i);
 if (found == -1) break;
 int start = found + 5; // start of actual name
 int end = string.indexOf(":", start);
 System.out.println(string.substring(start, end));
 i = end + 1;  // advance i to start the next iteration
 }
 }
 **/


public class CountYZ {

  public int countYZ(String str) {

    int i = 0;
    int count = 0;

    for (i = 0; i < str.length(); ) {
      int space = toString().indexOf(" ", i);

      if (space == -1) {
        int letterZ = toString().lastIndexOf("z", str.length() - 1);
        if (letterZ > 0) {
          count++;
        }
        int letterY = toString().lastIndexOf("y", str.length() - 1);
        if (letterY > 0) {
          count++;
        }
        break;
      }

      if (space >= 0) {
        int letterZ = toString().indexOf("z", i - 1);
        if (letterZ > 0) {
          count++;

          int letterY = toString().indexOf("y", i - 1);
          if (letterY >= 0) {
            count++;
          }
        }
        i = space++;
      }
    }
    return count;
  }
}
