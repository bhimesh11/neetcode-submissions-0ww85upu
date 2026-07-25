class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] word = s.split("\\s+");
        String lastCharacter = word[word.length - 1];
        if (lastCharacter != null) {
            return lastCharacter.length();
        }
        return -1;
    }
}
