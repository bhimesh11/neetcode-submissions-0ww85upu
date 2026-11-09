class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
     Map<String,List<String>> hash = new HashMap<>();
     for(String s: strs)
     {
        char[] tochar = s.toCharArray();
        Arrays.sort(tochar);
        String key = new String(tochar);
        hash.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
     }
     return new ArrayList<>(hash.values());
    }
}
