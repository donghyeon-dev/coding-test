/**
 * @author : autocat
 * @created : 2022-11-14
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
**/
import java.util.Scanner;

public class Main3{

  public String solution(String statement){
    String answer = "";
    String[] words = statement.split(" ");

    answer = words[0];

    int index = 0;
    while(index <= words.length-1){
      if(answer.length() < words[index].length()){
        answer = words[index];
      }
      index++;
    };

    return answer;
  }
  public static void main(String[] args){
    Main3 main = new Main3();
    Scanner scanner = new Scanner(System.in);

    String statement = scanner.nextLine();
    String answer = main.solution(statement);

    System.out.println(answer);
  }
}
