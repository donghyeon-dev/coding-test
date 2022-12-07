import java.util.Scanner;
public class Main6{

    public String solution(String word){
        String answer = "";
        for(int i = 0; i < word.length(); i++){
          char position = word.charAt(i);
          if(i == word.indexOf(position)){
            answer += position;
          }

        };
        return answer;
    };


    public static void main(String[] args){
        Main6 main = new Main6();
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        String returnStr = main.solution(str);
        System.out.println(returnStr);
    };

     

}

