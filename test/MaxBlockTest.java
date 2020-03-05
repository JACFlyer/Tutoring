import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxBlockTest {

  MaxBlock maxBlockTest = new MaxBlock();


  @Test
  void maxBlock() {

    String input = "hoopla";
    String input2 = "abbCCCddBBBxx";
    String input3 = "";

    int output = 2;
    int output2 = 3;
    int output3 = 0;

    assertEquals(output, maxBlockTest.maxBlock(input));
    assertEquals(output2, maxBlockTest.maxBlock(input2));
    assertEquals(output3, maxBlockTest.maxBlock(input3));

  }
}
