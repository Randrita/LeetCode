class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        
        if(words.length != pattern.length()) return false; 
        
        Map<Character, String> map1 = new HashMap<>(); 
        Map<String, Boolean> map2 = new HashMap<>(); 
        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            
            if(map1.containsKey(ch) == false){ 
                if(map2.containsKey(words[i]) == true){ 
                    return false; 
                }
                else{
                    map2.put(words[i], true); // now mark it as used
                    map1.put(ch, words[i]); // and put that word infront of character
                }
            }
            else{ 
                // if that character has already been mapped, now check with whom it has been mapped
                String mwith = map1.get(ch);
                // if mwith word is not equals to words[i], means already mapped with someone, then return false; 
                // eg :- a = dog & now a = cat
                if(mwith.equals(words[i]) == false) return false;
            }
        }
        return true;
    }
}