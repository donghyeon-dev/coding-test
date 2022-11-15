/**
 * @author : autocat
 * @created : 2022-11-14
**/



import java.util.Scanner;

public class Main {

    public int solution(String word, char c){
        int answer = 0;
        word = word.toLowerCase();
        c = Character.toLowerCase(c);
        char[] characeterArray = word.toCharArray();
        for(char targetChar : characeterArray){
            if(targetChar == c){
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main findCharacter = new Main();
        System.out.println("String 입력 후 Character 입력");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char character = scanner.next().charAt(0);

        System.out.println(findCharacter.solution(word,character));


    }
}

