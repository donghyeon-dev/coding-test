/**
 * @author : autocat
 * @created : 2022-11-24
**/
import java.util.Scanner;
public class Main20{

  public int[] solution(int[] numList){
    int[] answer = new int[numList.length];
    
    int rank = 1;
    for(int i = 0; i < numList.length; i++){
      rank =1;
      for(int j = 0; j < numList.length; j++){
        if(numList[i] < numList[j]){
          rank++;
        }

      };
      answer[i] = rank;

    };

      return answer;
    };


  public static void main(String[] args){

      Main20 main = new Main20();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int[] numList = new int[num];
      for(int i = 0; i < numList.length; i++){
        numList[i] = scn.nextInt();
      };
      int[] returnArr = main.solution(numList);
      for(int a : returnArr){
        System.out.print(a + " ");
      };
    };

     

}



