/**
 * @author : autocat
 * @created : 2022-12-05
**/
import java.util.*;
public class Main26{

  public ArrayList<Integer> solution(int num, int[] arr, int num2, int[]secondArr){
    
    ArrayList<Integer> answer = new ArrayList<Integer>();

    Arrays.sort(arr);
    Arrays.sort(secondArr);

    int firstIndex = 0;
    int secondIndex = 0;
    while(firstIndex < num && secondIndex < num2){
      if(arr[firstIndex] < secondArr[secondIndex]){
        firstIndex++;
      } else if(arr[firstIndex] == secondArr[secondIndex]){
        answer.add(arr[firstIndex++]);
        secondIndex++;
      } else {
        secondIndex++;
      }

    }


    return answer;
    };


  public static void main(String[] args){

      Main26 main = new Main26();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int[] arr = new int[num];
      for(int i = 0; i < num; i++){
        arr[i] = scn.nextInt();
      }

      int num2 = scn.nextInt();
      int[] secondArr = new int[num2];
      for(int i = 0; i < num2; i++){
        secondArr[i] = scn.nextInt();
      }
    ArrayList<Integer> answer = main.solution(num,arr, num2, secondArr);
    for(int i = 0; i < answer.size(); i++){
      System.out.print(answer.get(i) + " ");
    }
  };

     

}



