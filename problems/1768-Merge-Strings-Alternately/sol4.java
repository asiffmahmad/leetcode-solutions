// ==========================================================
// 1768. Merge Strings Alternately
// Difficulty : Easy
// Language   : Java
// Solution   : #4
// Runtime    : 1 ms (Beats 97%)
// Memory     : 42.4 MB (Beats 88%)
// Link       : https://leetcode.com/problems/merge-strings-alternately/
// ==========================================================

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                result.append(word1.charAt(i));
                i++;
            }

            if (j < word2.length()) {
                result.append(word2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}