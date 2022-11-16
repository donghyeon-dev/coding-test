/**
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
*/
import java.util.Scanner;
public class Main5{

    public String solution(String word){

            char[] charArr = word.toCharArray();
            int lt= 0;
            int rt = charArr.length - 1;
            while(lt < rt){
                if(!Character.isAlphabetic(charArr[lt])){
                    lt++;
                } else if (!Character.isAlphabetic(charArr[rt])){
                    rt--;
                } else {
                    char temp = charArr[lt];
                    charArr[lt] = charArr[rt];
                    charArr[rt] = temp;
                    lt++;
                    rt--;

                }
            };
            word = String.valueOf(charArr);


        return word;
    }


    public static void main(String[] args){
        Main5 main = new Main5();
        Scanner scn = new Scanner(System.in);

        String str = scn.next();;

        String answer = main.solution(str);
        System.out.println(answer);
    }

}

