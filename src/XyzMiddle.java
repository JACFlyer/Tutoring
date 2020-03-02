import org.jetbrains.annotations.NotNull;

/** Given a string, does "xyz" appear in the middle of the string? To define middle,
    we'll say that the number of chars to the left and right of the "xyz" must differ
    by at most one. This problem is harder than it looks.
    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false
 **/

public class XyzMiddle {

  public boolean xyzMiddle(String str) {

    boolean result;
    if (str.length() < 3) {
      return false;
    }
    String snip = "xyz";

    int midStr = str.length() / 2;
    if (str.length() % 2 != 0) {

      if (snip.equals(str.substring(midStr - 1, midStr + 2))) {

        result = true;
      } else
        return false;

    } else if (snip.equals(str.substring(midStr - 1, midStr + 2)) ||
        (snip.equals(str.substring(midStr - 2, midStr + 1)))) {
      result = true;

    } else
      result = false;
    return result;
  }
}

/**

    for (int i = midStr ; i < (str.length() - 1); i++) {
      if (str.substring(midStr - 1).equals(snip.substring(0))) {
        return result = true;
      }
      if (str.substring(midStr + 1).equals(snip.substring(0))) {
        return result = true;
      }
      if (str.substring(midStr).equals(snip.substring(0))) {
        return result = true;
      }
    }
    return result = false;
  }
  }
**/