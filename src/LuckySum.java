/**
 public List<Integer> doubling(List<Integer> nums) {
 List<Integer> result = new ArrayList<>();
 for (Integer n:nums) {
 result.add(n * 2);
 }
 return result;
 }


 public List<Integer> doubling(List<Integer> nums) {
 return nums.stream()
 .map(n -> n * 2)
 .collect(Collectors.toList());
 }

 public List<Integer> noNeg(List<Integer> nums) {
 nums.removeIf(n -> n < 0);
 return nums;
 }


 Given 3 int values, a b c, return their sum. However, if one of the values is 13
 then it does not count towards the sum and values to its right do not count. So for example,
 if b is 13, then both b and c do not count.

 luckySum(1, 2, 3) → 6
 luckySum(1, 2, 13) → 3
 luckySum(1, 13, 3) → 1
 **/


import java.util.ArrayList;
import java.util.List;



public class LuckySum {

  public int luckySum(int a, int b, int c) {

    int sum = 0;

    List<Integer> list = new ArrayList<>();
    list.add(a);
    list.add(b);
    list.add(c);

    for (int n : list) {
      if (n < 13) {
        sum += n;
      } else if (n == 13) {
        break;
      }
    }
    return sum;
  }
}

/** int sum = 0;
 for (int val : new int[]{a, b, c}) {
 if (val == 13) {
 break;

 }
 sum += val;
 }
 return sum;
 }
 **/