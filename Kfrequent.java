class Solution {
    public List<String> topKFrequent(String[] words, int k) 
    {
        List<String> list = new ArrayList<>();
        Map<String ,Integer>map=new TreeMap<>();
        for(String i:words)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<k;i++)
        {
            int max=Integer.MIN_VALUE;
            String key="";
            for(Map.Entry<String,Integer> entry:map.entrySet())
            {
                if(entry.getValue()>max)
                {
                    max=entry.getValue();
                    key=entry.getKey();
                }
               
            } 
            list.add(key);
            map.put(key,-1);
        }
        
        return list;

        
    }
}
