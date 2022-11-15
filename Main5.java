/**
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
*/
import java.util.Scanner;
public class Main5{

    public String[] solution(String[] words){
        for(int i = 0; i < words.length; i++){

            char[] charArr = words[i].toCharArray();
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
            words[i] = String.valueOf(charArr);

        };

        return words;
    }


    public static void main(String[] args){
        Main5 main = new Main5();
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String[] strArr = new String[num];
        for(int i = 0; i < num; i ++){
            strArr[i] = scn.next();
        };

        String[] newArr = main.solution(strArr);
        for(String str : newArr){
            System.out.println(str);
        };
    }

}

