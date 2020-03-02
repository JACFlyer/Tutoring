public class Problem4 {

/*
We want to make a row of bricks that is goal inches long. We have a number of small
bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to
make the goal by choosing from the given bricks. This is a little harder than it looks and can
be done without any loops. See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */

  public boolean makeBricks(int small, int big, int goal) {

    boolean possible = false;

    int i=0;
    int smallSize = 1;
    int bigSize = 5;

    int[] numSmall = new int[-small];
    int[] numBig = new int[-big];

    for (i=1; i < numSmall.length - 1 && i < numBig.length - 1; i++) {

    if ((smallSize * numSmall[i]) + (bigSize * numBig[i]) == goal) {
      possible = true;
    }
    }
    return possible;
  }
}
