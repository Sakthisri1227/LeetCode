public class AppendCharactets {
     public int appendCharacters(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        int ind=0;
        int sum=0;
        for(int i=0;i<t1.length;i++){
            int count=0;
            for(int j=ind;j<s1.length;j++){
               if(t1[i]==s1[j]){
                 ind=j+1;
                 count++;
                 break;
               }
            }
            if(count==0){
                break;
            }
            else{
                sum+=count;
            }
        }
        return t1.length-sum;
    }
}
