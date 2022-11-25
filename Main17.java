/**
 * @author : autocat
 * @created : 2022-11-23
**/
import java.util.Scanner;
public class Main17{

  public int solution(int num){
      int answer = 0;
      int[] arr = new int[num];
      for(int i = 2; i < num; i++){
        if(arr[i] == 0){
          answer += 1;
          for(int j = 0; j < num; j = j+i){
            if(arr[j] == 0){
              arr[j] = 1;
            };

          }
  
        }
      };

              
      return answer;
    };


  public static void main(String[] args){

      Main17 main = new Main17();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int result = main.solution(num);
      System.out.println(result);
    };

     

}



