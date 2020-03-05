import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WithoutEndTest {

  WithoutEnd noEnd = new WithoutEnd();

  @Test
  void withoutEnd() {

    String input1 = "Hello";
    String input2 = "java";
    String input3 = "coding";


    String output1 = "ell";
    String output2 = "av";
    String output3 = "odin";

    assertEquals(output1, noEnd.withoutEnd(input1));
    assertEquals(output2, noEnd.withoutEnd(input2));
    assertEquals(output3, noEnd.withoutEnd(input3));

  }
}