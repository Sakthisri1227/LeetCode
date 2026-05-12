public class LengthOfLastWord {
     public int lengthOfLastWord(String s) {
      String[] arr=s.trim().split(" ");
      String p=arr[arr.length-1];
      return p.length();  
    }
}
