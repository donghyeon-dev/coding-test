/**
 * @author : autocat
 * @created : 2022-11-25
**/
import java.util.*;
public class Main21{

  public int solution(int num, int[][] arr){
      int answer = 0;
      int sumI = 0;
      int sumJ = 0;
      for(int i = 0; i < num; i++){
        sumI=sumJ=0;
        for(int j = 0; j < num; j++){
          sumJ += arr[i][j];
          sumI += arr[j][i];
        }
        answer = Math.max(answer, sumI);
        answer = Math.max(answer, sumJ);
      }

      sumI = sumJ = 0;
      //answer에 행/열 중 최대값이 들어온 상태
      for(int i = 0; i < num; i++){
          sumI += arr[i][i];
      }
      for(int i = 0; i < num; i++){
        sumJ += arr[num -1 -i][i];
      }
      answer = Math.max(answer, sumI);
      answer = Math.max(answer, sumJ);

              
      return answer;
    };


  public static void main(String[] args){

      Main21 main = new Main21();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int arr[][] = new int [num][num];
      for(int i = 0; i < num; i++){
        for(int j = 0; j < num; j++){
          arr[i][j] = scn.nextInt();
        }
      }
      int max = main.solution(num, arr);
      System.out.println(max);


    };

     

}



