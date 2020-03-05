/**
 * Given a string, if one or both of the first 2 chars is 'x', return the string without
 * those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
 *
 *withoutX2("xHi") → "Hi"
 * withoutX2("Hxi") → "Hi"
 * withoutX2("Hi") → "Hi"
 *
 *
 */




public class WithoutX2 {

  public String withoutX2(String str) {

    char[] chars = str.toCharArray();
    char[] newStr = {};
    char[] edit = {};

    String snip = "";
    String snipped = "";

    for (int i = 0; i < str.length(); i++) {

      if (chars[i] == 'x' && (chars[i + 1] == 'x')) {
        newStr = str.substring(i + 2, str.length() - 1).toCharArray();
      }

      if (chars[i] == 'x' && (chars[i + 1] != 'x')) {
        newStr = str.substring(i + 1, str.length() - 1).toCharArray();
      }


    }
    return newStr.toString();
  }
}


