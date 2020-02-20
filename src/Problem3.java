/*  Return the sum of the numbers in the array, returning 0 for an empty array.
 Except the number 13 is very unlucky, so it does not count and numbers that
 come immediately after a 13 also do not count.
    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6

 */


import java.util.stream.IntStream;

public class Problem3 {
    int total;
  public int sum13(int[] nums) {

    int[] result = new int[1];

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 13) {
        nums[i] = 0;
        if (nums == null)
          nums[i] = 0;
      }
      total = IntStream.of(nums).sum();
    }
    return total;
  }
}
