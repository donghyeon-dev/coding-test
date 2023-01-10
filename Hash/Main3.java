/**
 * @author : autocat
 * @created : 2022-12-20
**/
import java.util.Scanner;
import java.util.HashMap;
public class Main3{

  public int[] solution(int num, int days, int[] arr){
      int[] answer = new int[days];

      HashMap<Integer, Integer> map = new HashMap<>();

      int answerIndex = 0;
      int count = 0;
      int pl = 0;
      int pr = days - 1;
      int index = 0;

      // 선작업으로 해시맵에 우측포인터 길이까지 넣어놓기
      for(int i = 0; i < days-1; i++){ // 0, 1, 2
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      }

      for(int i = days-1 ; i < num; i++){ // 3번 인덱스부터 시작
        // answr에 HashMap갯수 넣기
        //answer[answerIndex] = map.keySet().size();
        //answerIndex++;
        
        //r 포인터 증가 
        map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        pr++;

        answer[answerIndex] = map.keySet().size();
        answerIndex++;

        // l 포인터 증가 및 삭제
        if(map.get(arr[pl]) == 1){
          map.remove(arr[pl]);
        } else {
          map.put(arr[pl], map.get(arr[pl]) -1);
        }
        pl++;


      }
      


              
      return answer;
    };


  public static void main(String[] args){

      Main3 main = new Main3();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int days = scn.nextInt();
      int[] arr = new int[num];

      for(int i = 0; i < num; i++){
        arr[i] = scn.nextInt();
      }

      int[] rtn = main.solution(num, days, arr);
      for(int a : rtn){
        System.out.print(a + " ");
      }
    };

     

}



