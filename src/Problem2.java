/*  For each multiple of 10 in the given array, change all the values following it to be that
multiple of 10, until encountering another multiple of 10.
So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
*/
public class Problem2 {

  public int[] tenRun(int[] nums) {
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length - 1; i++) {
      while (nums[i] >= 10) {
        if (nums[i] == 10) {
          nums[i+1] = nums[i];
        }else if (nums[i] / 10 >= 2) {
          nums[i+1] = nums[i];
        }
      }result[i] = nums[i];

    }
    return result;
  }
}
