import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WithoutX2Test {

  WithoutX2 withOut = new WithoutX2();

  @Test
  void withoutX2() {

    String input1 = "xHi";
    String input2 = "Hxi";
    String input3 = "Hi";

    String output1 = "Hi";
    String output2 = "Hi";
    String output3 = "Hi";

    assertEquals(output1, withOut.withoutX2(input1));
    assertEquals(output2, withOut.withoutX2(input2));
    assertEquals(output3, withOut.withoutX2(input3));

  }
}