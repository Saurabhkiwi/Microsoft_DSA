import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to group anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        // Loop through each word in the input
        for (String word : strs) {
            // Convert the word to a char array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);  // Sorting the characters
            String key = new String(chars);  // Sorted word becomes the key

            // If the key doesn't exist in the map, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original word to the correct group
            map.get(key).add(word);
        }

        // Return all the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
