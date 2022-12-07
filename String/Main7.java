/**
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
**/

import java.util.Scanner;
public class Main7{

    public String solution(String word){
            String answer = "YES";
            //word = word.toUpperCase();
            //int lt = 0;
            //int rt = word.length() - 1;

            /**
            for(int i = 0; i < word.length() / 2; i++){
              if(word.charAt(lt) == word.charAt(rt)){
                answer = "YES";
                lt++;
                rt--;
              } else {
                answer =  "NO";
                break;
              }
            
            }*/

            /**
            for(int i = 0; i < word.length() / 2; i++){
              if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return  "NO";
              };
            }
            */
            String tmp = new StringBuilder(word).reverse().toString();
            if(!word.equalsIgnoreCase(tmp)){
              return "NO";
            };
            
            
            

            
            return answer;
        };


    public static void main(String[] args){
            Main7 main = new Main7();
            Scanner scn = new Scanner(System.in);

            String str = scn.next();
            String returnStr = main.solution(str);
            System.out.println(returnStr);
        };

     

}


