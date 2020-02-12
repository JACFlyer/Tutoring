public class Problems {

  private int number = 3;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }


  public boolean firstLast6(int[] nums) {
    boolean result = false;

    if (nums[0] == 6 || nums[nums.length - 1] == 6) {
        return result = true;
      }

    return result;
  }
}
