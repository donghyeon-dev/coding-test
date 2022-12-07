/**
 * @author : autocat
 * @created : 2022-11-23
**/
import java.util.Scanner;
public class Main16{

  public int[] solution(int num){
      int[] answer = new int[num];

      for(int i = 0; i < num; i++){
        if(i == 0 || i == 1 ){
          answer[i] = 1;
        } else {
          answer[i] = answer[i-1] + answer[i-2];
        };
      };
      return answer;
    };


  public static void main(String[] args){

      Main16 main = new Main16();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int[] returnStr = main.solution(num);
      for(int a : returnStr){
        System.out.print(a+" ");
        
      };

    };

     

}



