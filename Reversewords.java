class Solution {
    public String reverseWords(String s) 
    {
       
        StringBuilder a=new StringBuilder();
        String[] b=s.trim().split("\\s+");
        for(int i=b.length-1;i>=0;i--)
        {
             a.append(b[i]);
             if(i>0)
             a.append(" ");
        }

        return a.toString();
    }
}
