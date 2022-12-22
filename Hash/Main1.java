/**
 * @author : autocat
 * @created : 2022-12-19
**/
import java.util.Scanner;
import java.util.HashMap;
public class Main1{

  public char solution(int num, String str){
      char answer = ' ';
      
      HashMap<Character, Integer> map = new HashMap<>();
      for(char c : str.toCharArray()){
        map.put(c, map.getOrDefault(c, 0) + 1);
      };
      int max = 0;
      for(char c : map.keySet()){
        if(max < map.get(c)){
        max = map.get(c);
        answer = c;
        }
        
      }


              
      return answer;
    };


  public static void main(String[] args){

      Main1 main = new Main1();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      String str = scn.next();
      char ret = main.solution(num, str);
      System.out.println(ret);
    };

     

}



