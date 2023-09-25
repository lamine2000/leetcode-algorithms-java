package easy.find_the_difference;

public class Solution {  
  public static char findTheDifference(String s, String t) {
    int sum1 = 0;
    int sum2 = 0;
    
    for(byte b : s.getBytes())
      sum1 += b;
    
    for(byte b : t.getBytes())
      sum2 += b;
    
    return (char)(sum2 - sum1);
  }
  
  public static void main(String[] args){
    String s = "abcd";
    String t = "aibcd";
    
    char result = findTheDifference(s, t);
    System.out.println(result);
  }
}