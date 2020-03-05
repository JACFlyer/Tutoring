/**
 * Given three ints, a b c, one of them is small, one is medium and one is large.
 * Return true if the three values are evenly spaced, so the difference between small
 * and medium is the same as the difference between medium and large.
 *
 * evenlySpaced(2, 4, 6) → true
 * evenlySpaced(4, 6, 2) → true
 * evenlySpaced(4, 6, 3) → false
 */
public class EvenlySpaced {

  public boolean evenlySpaced(int a, int b, int c) {
    int sm = 0;
    int med = 0;
    int lg = 0;

    int diff1 = (med - sm);
    int diff2 = (lg - med);

    boolean result = false;

    /*

    a < b < c
    a < c < b
    b < a < c
    b < c < a
    c < b < a
    c < a < b

     */
    if ((a < b) && (b < c)) {
      sm = a;
      med = b;
      lg = c;
    }
    if ((a < c) && (c < b)) {
      sm = a;
      med = c;
      lg = b;
    }
    if ((b < a) && (a < c)) {
      sm = b;
      med = a;
      lg = c;
    }
    if ((b < c) && (c < a)) {
      sm = b;
      med = c;
      lg = a;
    }

    if ((c < b) && (b < a)) {
      sm = c;
      med = b;
      lg = a;
    }

    if ((c < b) && (a < b)) {
      sm = c;
      med = a;
      lg = b;
    }

    if (diff1 == diff2) {
      result = true;
    }
    return result;
  }

}

/**
  public boolean evenlySpaced(int a, int b, int c) {
    return (a - b == b - c)
        || (b - a == c - a)
        || (a - c == c - b);
  }
**/


