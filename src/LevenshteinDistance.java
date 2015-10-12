/**
 * Created by paulo on 10/11/15.
 *
 * LevenshteinDistance checks the distance required to convert one word to match another
 */
public class LevenshteinDistance {
    /**
     * If returns 0, the two strings are same
     * If returns 1, that means either a character is added, removed or replaced
     */
    public static int calcDist(String word1, String word2) {

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int[] costs = new int[word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            int lastValue = i;
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0)
                    costs[j] = j;
                else {
                    if (j > 0) {
                        int newValue = costs[j - 1];
                        if (word1.charAt(i - 1) != word2.charAt(j - 1))
                            newValue = Math.min(Math.min(newValue, lastValue), costs[j]) + 1;
                        costs[j - 1] = lastValue;
                        lastValue = newValue;
                    }
                }
            }
            if (i > 0)
                costs[word2.length()] = lastValue;
        }
        return costs[word2.length()];
    }
}
