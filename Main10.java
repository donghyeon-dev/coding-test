/**
 * @author : autocat
 * @created : 2022-11-17
 * 10. 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


예시 입력 1

teachermode e
예시 출력 1

1 0 1 2 1 0 1 2 2 1 0
**/
 import java.util.Scanner;
 public class Main10{

     public String solution(String word, char c){
             String answer = "";
             char[] charArr = word.toCharArray();
             int[] normalArr = new int[charArr.length];
             int temp = 1000;
             for(int i = 0; i < charArr.length; i++){
               if(charArr[i] == c){
                 temp = 0;
                 normalArr[i] = temp;
                
               } else {
                 temp++;
                 normalArr[i] = temp;
               }
             };

             temp = 1000;
             for(int i = charArr.length-1 ; i >= 0; i--){

               if(charArr[i] == c){
                 temp = 0;
               } else {
                 temp++;
                 //normalArr[i] = temp;
                 if(temp < normalArr[i]){                
                   normalArr[i] = temp;
                 };
               };
              };

             for(int x : normalArr){
               answer += String.valueOf(x) + " ";
            
             };

             return answer;
     } 
          
             
            


     public static void main(String[] args){
             Main10 main = new Main10();
             Scanner scn = new Scanner(System.in);

             String str = scn.next();
             char c = scn.next().charAt(0);
             String returnStr = main.solution(str, c);
             System.out.println(returnStr);
         };



 }


