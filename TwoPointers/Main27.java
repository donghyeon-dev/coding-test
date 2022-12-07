/**
 * @author : autocat
 * @created : 2022-12-06
 * Sliding Window algorith을 사용해 시간복잡도 완화
**/
import java.util.Scanner;
public class Main27{

  public int solution(int days, int count, int[] price){
    
    int answer = 0;
    int max = 0;
    for(int i = 0; i < count; i++){
      answer += price[i];
    }
    max = answer;
    for(int i = count; i < days; i++){
      max += price[i] - price[i - count];
      answer = Math.max(max, answer);
    }

    return answer;
    };
  public static void main(String[] args){

      Main27 main = new Main27();
      Scanner scn = new Scanner(System.in);

      int days = scn.nextInt();
      int count = scn.nextInt();
      int[] price = new int [days];

      for(int i = 0; i < days; i++){
        price[i] = scn.nextInt();
      }

      System.out.println(main.solution(days, count, price));
    };

     

}
