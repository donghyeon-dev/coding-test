/**
 * @author : autocat
 * @created : 2022-11-14
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
**/
import java.util.Scanner;
public class Main4{

    public String solution(String word){
        String answer = "";
        int length = word.length();
        for(int i = length; i > 0; i--){
            answer += word.substring(i-1, i);

        }
        // 혹은 StringBuilder 사용
        answer = new StringBuilder(word).reverse().toString();
        return answer;
    };

     public String[] solution2(String[] words){
        for(int i = 0; i < words.length; i++){

            char[] charArr = words[i].toCharArray();
            int lt= 0;
            int rt = charArr.length - 1;
            while(lt < rt){
                if(!Character.isAlphabetic(charArr[lt])){
                    lt++;
                } else if (!Character.isAlphabetic(charArr[rt])){
                    rt++;
                } else {
                    char temp = charArr[lt];
                    charArr[lt] = charArr[rt];
                    charArr[rt] = temp;
                    lt++;
                    rt--;

                }
            };
            words[i] = String.valueOf(charArr);

        };

        return words;
    }

    public static void main(String[] args){
        Main4 main = new Main4();
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        for(int i = 0; i < num; i++){
            String str = scn.next();
            String reversedStr = main.solution(str);
            System.out.println(reversedStr);
        };

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        num = scn.nextInt();
        String[] strArr = new String[num];
        for(int i = 0; i < num; i ++){
          strArr[i] = scn.next();
        };

        strArr = main.solution2(strArr);
        for(String str : strArr){
          System.out.println(str);
        };
    }

}
