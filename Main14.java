/**
 * @author : autocat
 * @created : 2022-11-22
**/

 import java.util.Scanner;
 public class Main14{

     public int solution(int[] numList){
             int answer = 1;
             int max = numList[0];
             for(int i = 1; i < numList.length; i++){
               if(max < numList[i]){
                 answer++;
                 max = numList[i];
               };
             };

             
             
             return answer;
         };


     public static void main(String[] args){
             Main14 main = new Main14();
             Scanner scn = new Scanner(System.in);
             
             int num = scn.nextInt();
             int[] numList = new int[num + 1];
             for(int i = 0; i < numList.length-1; i++){
               numList[i] = scn.nextInt();
             };

             int returnStr = main.solution(numList);
             System.out.println(returnStr);
         };

      

 }


