class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        		Map<String,List<String>> hash = new LinkedHashMap();
		for(String str : strs)
		{
		String sortedkey =	str.chars()
			.mapToObj(c -> String.valueOf((char) c)
					.toUpperCase()).sorted()
			.collect(Collectors.joining());
			
			hash.computeIfAbsent(sortedkey, k -> new ArrayList<>()).add(str);
		}
       // List<String> m = new ArrayList<>(hash.values());
		return  new ArrayList<>(hash.values());
    }
}
