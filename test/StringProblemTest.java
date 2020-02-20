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