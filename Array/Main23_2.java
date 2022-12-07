/**
 * @author : autocat
 * @created : 2022-11-29
**/
import java.util.Scanner;
public class Main23_2{

  public int solution(int num, int[][] arr){
  
      int answer = 0;
      int max = 0;

      for(int i = 1; i <= num; i++){
        int cnt = 0;
        for(int j =1 ; j <= num; j++){
          for(int m = 1; m <= 5; m++){
            if(arr[i][m] == arr[j][m]){
            cnt++;
            break;
            }
          }
        }
      
      if(cnt > max){
        max = cnt;
        answer = i;
      }
      
     }
              
      return answer;
    };


  public static void main(String[] args){

      Main23_2 main = new Main23_2();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int[][] arr = new int[num+1][6];
      for(int i = 1 ; i <=num; i++){
        for(int j =1 ; j <=5; j++){
          arr[i][j] = scn.nextInt();
        }
      }
      int returnStr = main.solution(num, arr);
      System.out.println(returnStr);
    };

     

}



