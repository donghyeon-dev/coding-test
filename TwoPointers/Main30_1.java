/**
 * @author : autocat
 * @created : 2022-12-19
**/
import java.util.Scanner;
public class Main30_1{

  public int solution(int num, int count, int[] arr){
      int answer = 0;
      int lt = 0;
      int replaceCount = 0;

      for(int rt = 0; rt < num; rt++){
        if(arr[rt] == 0){
          arr[rt] = 2;
          replaceCount++;
        }
        while(replaceCount > count){
          if(arr[lt] == 2){
            arr[lt] = 0;
            replaceCount--;
          }
          lt++;
        }
        answer = Math.max(answer, rt - lt + 1);



      }
              
      return answer;
    };


  public static void main(String[] args){

      Main30_1 main = new Main30_1();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int count = scn.nextInt();
      int[] arr = new int[num];
      for(int i = 0; i < num; i++){
        arr[i] = scn.nextInt();
      }
      int returnStr = main.solution(num, count, arr);
      System.out.println(returnStr);
    };

     

}



