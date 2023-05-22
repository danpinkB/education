package src.arrays_hashing;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> patterns = new HashMap<>();

        return new AbstractList<List<String>>() {
            List<List<String>> res;
            @Override
            public List<String> get(int index) {
                if(res==null)init();
                return res.get(index);
            }

            @Override
            public int size() {
                if(res==null)init();
                return res.size();
            }
            void init(){
                String key;
                char[] characters;
                for (String str:strs){
                    characters = str.toCharArray();
                    Arrays.sort(characters);
                    key = new String(characters);
                    if(patterns.containsKey(key))patterns.get(key).add(str);
                    else patterns.put(key,new ArrayList<>(List.of(str)));
                }
                res = new ArrayList<>(patterns.values());
            }
        };
    }
}
