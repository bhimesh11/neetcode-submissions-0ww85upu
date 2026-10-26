class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
    Map<String,List<String>> hash = new HashMap<>();
    for(String s: strs)
    {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String key = new String(c);
        hash.computeIfAbsent(key,k-> new ArrayList<>()).add(s);
    }
    return new ArrayList<>(hash.values());
    }
}
