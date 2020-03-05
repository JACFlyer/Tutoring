import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxSpanTest {
MaxSpan maxSpan = new MaxSpan();

  @Test
  void maxSpan() {

    int[] input = {1, 2, 1, 1, 3};
    int[] input2 = {1, 4, 2, 1, 4, 1, 4};
    int[] input3 = {1, 4, 2, 1, 4, 4, 4};

    int output = 4;
    int output2 = 6;
    int output3 = 6;


    assertEquals(output, maxSpan.maxSpan(input));
    assertEquals(output2, maxSpan.maxSpan(input2));
    assertEquals(output3, maxSpan.maxSpan(input3));
    }
}