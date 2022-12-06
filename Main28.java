/**
 * @author : autocat
 * @created : 2022-12-06
**/
import java.util.Scanner;
public class Main28{

  public int solution(int num, int target, int[] arr){
    int answer = 0;

    for(int i = 0; i < num; i++){
      int index = 0;
      int sum = 0;
      while(sum < target && i+index < num){
        sum+= arr[i + index++];
      }
      if(sum == target){
        answer++;
      }
      
    }
              
    return answer;
    };


  public static void main(String[] args){
    Main28 main = new Main28();
    Scanner scn = new Scanner(System.in);
    
    int num = scn.nextInt();
    int target = scn.nextInt();

    int[] arr = new int[num];

    for(int i = 0; i < num; i++){
      arr[i] = scn.nextInt();
    }

    System.out.println(main.solution(num, target, arr));
    
  };

     

}



