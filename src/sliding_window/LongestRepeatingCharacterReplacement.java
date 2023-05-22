package src.sliding_window;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        if(s.length() == k) return k;

        int[] freq = new int[91];
        byte[] bytes = s.getBytes();
        int max = 0, start = 0;

        for (int end = 0; end < bytes.length; end++) {
            max = Math.max(max, ++freq[bytes[end]]);
            while (end - start - max >= k)
                freq[bytes[start++]]--;
        }
        return bytes.length - start;
    }
}
