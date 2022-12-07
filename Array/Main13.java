/**
 * @author : autocat
 * @created : 2022-11-21
 * 설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


예시 입력 1

6
7 3 9 5 6 12
예시 출력 1

7 9 6 12
**/
 import java.util.*;
 public class Main13{

     public ArrayList<Integer>  solution(int[] num){
       ArrayList<Integer> answerList = new ArrayList<>();
       for(int i = 1; i < num.length; i++){
         if(num[i] > num[i - 1]){
          answerList.add(num[i]);
         };

       };
             
             
             return answerList;
         };


     public static void main(String[] args){
             Main13 main = new Main13();
             Scanner scn = new Scanner(System.in);

             int num = scn.nextInt();
             int[] numList = new int[num+1];
             for(int i = 1; i < numList.length; i++){
                numList[i] = scn.nextInt();
             };
    
             ArrayList<Integer> resultList = main.solution(numList);
             for(int a : resultList){
               System.out.print(a + " ");
             };
         };

      

 }


