class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> res = new HashMap<>();

        for(String str : strs) {
            int freq[] = new int[26];
            for(int i=0 ; i<str.length() ; i++) {
                freq[str.charAt(i) - 'a']++;
            }
            String freqString = Arrays.toString(freq);
            res.putIfAbsent(freqString, new ArrayList<>());
            res.get(freqString).add(str);
        }

        return new ArrayList<>(res.values());
        
    }
}
