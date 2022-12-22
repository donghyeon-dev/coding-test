/**
 * @author : autocat
 * @created : 2022-12-20
**/
import java.util.Scanner;
public class Main3{

  public String solution(String word){
    

      String answer = "";
              
      return answer;
    };


  public static void main(String[] args){

      Main3 main = new Main3();
      Scanner scn = new Scanner(System.in);

      int num = scn.nextInt();
      int days = scn.nextInt();
      int[] arr = new int[num];

      int[] rtn = main.solution(num, days, arr);
      for(int a : rtn){
        System.out.print(a + " ");
      }
    };

     

}



