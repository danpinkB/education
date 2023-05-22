package src.arrays_hashing;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] store = new int[26];

        for (int i = 0; i < s.length(); ++store[s.charAt(i)-'a'],i++) {}
        for (int i = 0; i < t.length(); --store[t.charAt(i)-'a'],i++) {}

        for (int n: store) if(n!=0)return false;
        return true;
    }
}
