/**
 * @author : autocat
 * @created : 2022-12-20
**/
import java.util.Scanner;
import java.util.HashMap;
public class Main2{

  public String solution(String str1, String str2){
    
      String answer = "YES";

      HashMap<Character, Integer> map1 = new HashMap<>();

      for(char c : str1.toCharArray()){
        map1.put(c, map1.getOrDefault(c, 0) + 1);
      }
      for(char c : str2.toCharArray()){
        map1.put(c, map1.getOrDefault(c,0) -1);
      }

      for(char c : str1.toCharArray()){
        if(map1.get(c) == 0 || !map1.containsKey(c)){
          return "NO";
        }
      }
              
      return answer;
    };


  public static void main(String[] args){

      Main2 main = new Main2();
      Scanner scn = new Scanner(System.in);

      String str1 = scn.next();
      String str2 = scn.next();
      System.out.println(main.solution(str1, str2));
    };

     

}



