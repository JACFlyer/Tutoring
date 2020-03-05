/**
 * Given a string, return the length of the largest "block" in the string. A block is a run
 *     of adjacent chars that are the same.
 *
 *     maxBlock("hoopla") → 2
 *     maxBlock("abbCCCddBBBxx") → 3
 *     maxBlock("") → 0
 */




public class MaxBlock {
  public int maxBlock(String str) {
    int longestBlock = 0;

    char previousChar = 0;
    int currentBlock = 0;

    for (char c : str.toCharArray()) {
      if (c == previousChar) {
        currentBlock++;
      } else {
        if (currentBlock > longestBlock) {
          longestBlock = currentBlock;
        }
        currentBlock = 1;
        previousChar = c;
      }
    }
    if (currentBlock > longestBlock) {
      longestBlock = currentBlock;
    }
    return longestBlock;
  }
  }
