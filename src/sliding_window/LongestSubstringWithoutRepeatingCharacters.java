package src.sliding_window;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)return s.length();
        char[] arr = s.toCharArray();
        int max = 1;
        int i;
        int j;
        for (i = 1,j=0; i < arr.length; i++) {
            for (int l = j; l < i; l++) {
                if(arr[i]==arr[l]){
                    if(max<i-j){max=i-j;}
                    j=l+1;
                }
            }
        }
        return max>i-j?max:i-j;
    }
}
