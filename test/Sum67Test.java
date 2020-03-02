import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sum67Test {

  Sum67 sum67 = new Sum67();

  int[] input = {1, 2, 3, 4, 6, 7};

  int output = 10;

  @Test
  void sum67() {
    assertEquals(output, sum67.sum67(input));
  }
}