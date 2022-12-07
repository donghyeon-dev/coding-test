/**
 * @author : autocat
 * @created : 2022-11-24
**/
import java.util.Scanner;
public class Main19{

  public int solution(int[] numList){
      int answer = 0;
      int advantage = 0;
      for(int i = 0; i < numList.length; i++){
        if(numList[i] == 1){
            advantage++;
            answer += advantage;
        } else {
          advantage = 0;
        }

      }
              
      return answer;
    };


  public static void main(String[] args){

      Main19 main = new Main19();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int[] numList = new int[num];
      for(int i = 0; i < numList.length; i++){
        numList[i] = scn.nextInt();
      };
      int returnStr = main.solution(numList);
      System.out.println(returnStr);
    };

     

}



