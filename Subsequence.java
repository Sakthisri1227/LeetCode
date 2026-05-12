public class Subsequence {
     public boolean isSubsequence(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        int ind=0;
        int count=0;
        for(int i=0;i<s1.length;i++){
           for(int j=ind;j<t1.length;j++){
            if(s1[i]==t1[j]){
                ind=j+1;
                count++;
                break;
            }
           }
       }
       if(s1.length!=count){
        return false;
       }
       return true;
    }
}
