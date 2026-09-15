import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert string to character array and sort it
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            // Sorted string is the key
            String key = new String(chars);

            // Add original string to its anagram group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
