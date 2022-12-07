/**
 * @author : autocat
 * @created : 2022-11-14
**/
import java.util.Scanner;

public class Main2{
  public String solution(String word){
    String answer= "";
    for(char c : word.toCharArray()){
      if(isUpper(c)){
        c = Character.toLowerCase(c);
      } else {
        c = Character.toUpperCase(c);
      }
      answer += c;
    }

    
    return answer;
  }
  // Character.isUpperCase() 를 사용해도 된다.
  public boolean isUpper(char c){
    int asci = (int)c;
    boolean isUpper = false;
    if(c >= 97 && c <= 122){
      isUpper = false;
    } else if (c >= 65 && c <= 90){
      isUpper = true;
    };

    return isUpper;

  };
  public static void main(String[] args){

    Main2 main = new Main2();
    Scanner scanner = new Scanner(System.in);
    String word = scanner.next();
    String answer = main.solution(word);
    System.out.println(answer);
  };
}
