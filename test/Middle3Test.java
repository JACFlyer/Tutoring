import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Middle3Test {

  Middle3 mid3Tester = new Middle3();

  @Test
  void middleThree() {

    String input1 = "Candy";
    String input2 = "and";
    String input3 = "solving";

    String output1 = "and";
    String output2 = "and";
    String output3 = "lvi";

    assertEquals(output1, mid3Tester.middleThree(input1));
    assertEquals(output2, mid3Tester.middleThree(input2));
    assertEquals(output3, mid3Tester.middleThree(input3));

    }
}