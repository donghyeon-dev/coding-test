/**
 * @author : autocat
 * @created : 2022-12-01
 *
 * two pinters algorithm 을 사용해야한다!!!
 * O(nlogn) => O(n) 으로 효율성을 높여라
 1. 두 배열 합치기
설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


출력
오름차순으로 정렬된 배열을 출력합니다.


예시 입력 1

3
1 3 5
5
2 3 6 7 9
예시 출력 1

1 2 3 3 5 6 7 9
**/
import java.util.*;
public class Main25{

  public ArrayList<Integer> solution(int num, int[]numArr, int num2, int[] secondArr){
    ArrayList<Integer> answer = new ArrayList<Integer>();
    int index = 0;
    int firstIndex = 0;
    int secondIndex = 0;
     
      while(firstIndex < num && secondIndex < num2){
      if(numArr[firstIndex] <  secondArr[secondIndex]){
          answer.add(numArr[firstIndex++]);
        } 
        /**else if (numArr[firstIndex] == secondArr[secondIndex]){
          if(num < num2){
            answer.add(secondArr[secondIndex++]);
            firstIndex++;
          } else {
            answer.add(numArr[firstIndex++]);
            secondIndex++;
          }
        }
        */
        else {
          answer.add(secondArr[secondIndex++]);
        }

      }

      while(firstIndex < num){
        answer.add(numArr[firstIndex++]);
      }
      while(secondIndex < num2){
        answer.add(secondArr[secondIndex++]);
      }

      return answer;
    };


  public static void main(String[] args){

      Main25 main = new Main25();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int[] numArr = new int[num];
      for(int i = 0; i < num; i++){
        numArr[i] = scn.nextInt();
      }
      int num2 = scn.nextInt();
      int[] secondArr = new int[num2];
      for(int i = 0; i < num2; i++){
        secondArr[i] = scn.nextInt();
      }
      ArrayList<Integer> returnStr = main.solution(num, numArr, num2, secondArr);
      for(int i : returnStr){
        System.out.print(i+" ");
      }
    };

     

}



