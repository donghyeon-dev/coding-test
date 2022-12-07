/**
 * @author : autocat
 * @created : 2022-11-16
 * 유효한 팰린드롬
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
  문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
  단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
  알파벳 이외의 문자들의 무시합니다
  found7, time: study; Yduts; emit, 7Dnuof => YES
**/

import java.util.Scanner;
public class Main8{

    public String solution(String word){
            String answer = "NO";
            word = word.toLowerCase();
            String replacedWord = word.replaceAll("[^a-z]", ""); // 알파벳을 제외한 모든 특수문자를 빈칸으로
            System.out.println(replacedWord);                                                                 
            String reversedWord = new StringBuilder(replacedWord).reverse().toString();
            System.out.println(reversedWord);
            if(replacedWord.equalsIgnoreCase(reversedWord)){
              answer = "YES";
            };
            
            return answer;
        }; 


    public static void main(String[] args){
            Main8 main = new Main8();
            Scanner scn = new Scanner(System.in);

            String str = scn.nextLine();
            String returnStr = main.solution(str);
            System.out.println(returnStr);
        };

     

}


