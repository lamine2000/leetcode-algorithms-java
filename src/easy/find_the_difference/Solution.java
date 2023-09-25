package easy.find_the_difference;

public class Solution {  
  public static char findTheDifference(String s, String t) {
    int sum = 0;
    
    for(byte b : s.getBytes())
      sum += b;
    
    for(byte b : t.getBytes())
      sum -= b;
    
    return (char)(-sum);
  }
  
  public static void main(String[] args){
    String s = "abcd";
    String t = "aibcd";
    
    char result = findTheDifference(s, t);
    System.out.println(result);
  }
}