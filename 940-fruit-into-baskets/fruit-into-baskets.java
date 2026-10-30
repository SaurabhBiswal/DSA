import java.util.HashMap;
class Solution {
    public int totalFruit(int[] fruits) {
        int low=0,high=0,maxlen=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(high<fruits.length){
            int currentfruit=fruits[high];
            map.put(currentfruit,map.getOrDefault(currentfruit,0)+1);
            while(map.size()>2){
                int leftfruit=fruits[low];
                map.put(leftfruit,map.get(leftfruit)-1);
                if(map.get(leftfruit)==0){
                    map.remove(leftfruit);
                }
                low++;
            }
            if(map.size()<=2){
                maxlen=Math.max(maxlen,high-low+1);
            }
            high++;
        }
        return maxlen;
    }
}