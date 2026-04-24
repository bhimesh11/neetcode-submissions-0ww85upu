class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<String,List<String>>();
        for(String s: strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            result.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
