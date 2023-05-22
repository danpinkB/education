package src.sliding_window;

public class PermutationInString {
    boolean hasOnlyZeros(int[] arr){
        for (int el:arr)if (el!=0)return false;
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        if(s1.length()==0)return true;
        int m = s1.length();
        int[] arr1 = new int[26];
        for (int i = 0; i < m; i++) {
            ++arr1[s1.charAt(i)-'a'];
            --arr1[s2.charAt(i)-'a'];
        }
        if(hasOnlyZeros(arr1)) return true;
        for (int i = m; i < s2.length(); i++) {
            arr1[s2.charAt(i)-'a']--;
            arr1[s2.charAt(i-m)-'a']++;
            if(hasOnlyZeros(arr1)) return true;
        }
        return false;

    }
}
