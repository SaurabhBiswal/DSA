import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0,high=0,maxlen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(high<s.length()){
            char c=s.charAt(high);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()<high-low+1){
                char leftchar=s.charAt(low);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                low++;
            }
            if(map.size()==high-low+1){
                maxlen=Math.max(maxlen,high-low+1);
            }
            high++;
        }
        return maxlen;
    }
}