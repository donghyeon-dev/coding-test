/**
 * @author : autocat
 * @created : 2022-12-07
**/
import java.util.Scanner;
public class Main30{

  public int solution(int num, int count, int[] arr){
     int answer = 0;
     int index = 0;
     int zeroCount = 0;
     int sum = 1;
     for(int i = 0; i < num; i++){
       if(arr[i] == 0){
         zeroCount++;
       }
       while(zeroCount == count && index > num-1){ 
         if(arr[index] == 1 && arr[index+1] == 1){
           sum++;
           index++;
         }
       }
     }
              
    return answer;
  };


  public static void main(String[] args){

      Main30 main = new Main30();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int[] arr = new int[num];
      int count = scn.nextInt();
      for(int i = 0; i < num; i++){
        arr[i] = scn.nextInt();
      }

      System.out.println(main.solution(num, count, arr));

    };

     

}



