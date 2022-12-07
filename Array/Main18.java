/**
 * @author : autocat
 * @created : 2022-11-24
**/

import java.util.*;
public class Main18{

  public ArrayList<Integer> solution(int[] numList){
      ArrayList<Integer> answer = new ArrayList<>();
      
      for(int i = 0; i < numList.length; i++){
        int target = Integer.parseInt(new StringBuilder(String.valueOf(numList[i])).reverse().toString());
        if(isPrime(target)){
          answer.add(target);
        }
        
      };
              
      return answer;
    };

  public boolean isPrime(int number){
    if(number == 1){
      return false;
    }
    for(int i = 2; i < number; i++){
      if(number % i == 0){
        return false;
      };
    };

    return true;

  };


  public static void main(String[] args){

      Main18 main = new Main18();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int[] numList = new int[num];

      for(int i = 0; i < numList.length; i++){
        numList[i] = scn.nextInt();
      };
      
      ArrayList<Integer> returnArr = main.solution(numList);
      for(int a : returnArr){
        System.out.print(a + " ");
      }
    };

     

}



