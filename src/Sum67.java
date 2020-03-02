import java.util.ArrayList;
import java.util.List;

/**
Return the sum of the numbers in the array, except ignore sections of numbers starting with
    a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
    Return 0 for no numbers.

    sum67([1, 2, 2]) → 5
    sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    sum67([1, 1, 6, 7, 2]) → 4
**/


public class Sum67 {

  public int sum67(int[] nums) {

    int sum = 0;
    boolean flag = false;

    for (int i=0; i < nums.length; i++) {

      if (i > 0 && nums[i-1] == 7 && flag == true) {
        flag = false;
      }
      if (nums[i] == 6) {
        flag = true;
      }
      if (flag == false) {
        sum += nums[i];
      }

    }
    return sum;
  }
  }
