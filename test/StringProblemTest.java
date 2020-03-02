import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringProblemTest {

  String input1 = "Dolly";
  String input2 = "Marcus";

  String out1 = "Hello Dolly!";
  String out2 = "Hello Marcus!";

  StringProblem stringProblem = new StringProblem();

  @Test
  void helloName() {
    assertEquals(out1, stringProblem.helloName(input1));
    assertEquals(out2, stringProblem.helloName(input2));

  }
}

/*  Given an "out" string length 4, such as "<<>>", and a word, return a new string
 where the word is in the middle of the out string, e.g. "<<word>>". Note: use
 str.substring(i, j) to extract the String starting at index i and going up to but
 not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */
  public String makeOutWord(String out, String word) {

    String quote = new String();





  }


