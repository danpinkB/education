package src.sliding_window;

public class MinimumWindowSubstring {
    static int arrSum(int[] arr){
        int sum = 0;
        for (int el:arr)sum+=el;
        return sum;
    }
    static boolean hasSameCharacters(int[] arr1,int[] arr2){
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]!=0&&arr1[i]<arr2[i])return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.equals(s))return t;
        if (t.length()>s.length()) return "";
        if (t.length()==1) return s.contains(t)?t:"";
        int m = t.length();
        int[] arr = new int[58];
        int[] arr1 = new int[58];
        int first = 0;
        for (int i = 0; i < m; i++) {
            arr[t.charAt(i)-'A']++;
            first=Math.min(first,s.indexOf(t.charAt(i)));
        }
        int imax =0;
        int jmax = 0;

        for (int i = 0; i < s.length(); i++) {
            int el = s.charAt(i)-'A';
            arr1[el]++;
            if(arr[el]!=0) {
                while (hasSameCharacters(arr1, arr)){
                    int sum = arrSum(arr1);
                    if ((imax+jmax==0)||(sum <= jmax - imax)) {
                        imax = i - (sum-1);
                        jmax = i+1;
                    }
                    arr1[s.charAt(first)-'A']--;
                    first++;
                    while (arr[s.charAt(first)-'A']==0) {
                        arr1[s.charAt(first) - 'A']--;
                        first++;
                    }
                }
            }
        }
        return s.substring(imax,jmax);
    }
}
