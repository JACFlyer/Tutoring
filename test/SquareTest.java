import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

  Square isSquare = new Square();

  @Test
  void nextPerfectSquare() {

    double input1 = 225.0;
    double input2 = 256.0;

    double output1 = 15.0;
    double output2 = 16.0;

    assertEquals(output1, isSquare.nextPerfectSquare((long) input1));
  }
}