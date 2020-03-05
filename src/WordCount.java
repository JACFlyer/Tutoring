import java.util.HashMap;
import java.util.Map;

/** The classic word-count algorithm: given an array of strings, return a Map<String,
 * Integer> with a key for each different string, with the value the number of times that
 * string appears in the array.

 wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
 wordCount(["c", "c", "c", "c"]) → {"c": 4}

 **/


public class WordCount {
  public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> count = new HashMap<>(); // Fill in types from the declared type
    for (String word : strings) {
     count.put(word, 1 + count.getOrDefault(word, 0));
    }
    return count;
  }
}
