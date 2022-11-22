/**
 * @author : autocat
 * @created : 2022-11-22
**/

 import java.util.Scanner;
 public class Main15{

     public String[] solution(int count, int[] entryA, int[] entryB){
       
       String[] answer = new String[count];
             for(int i = 0; i < count; i++){
               if(entryA[i] == entryB[i]){
                 answer[i] = "D";
               } else if (entryA[i]== 1){
                 if(entryB[i] == 2){
                  answer[i] = "B";
                 } else {
                   answer[i] = "A";
                 }
               } else if (entryA[i] ==2){
                 if(entryB[i] == 1){
                   answer[i] = "A";
                 } else {
                   answer[i] = "B";
                 }
               } else if(entryA[i] == 3){
                 if(entryB[i] == 1){
                   answer[i] = "B";
                 } else {
                   answer[i] = "A";
                 }
               }
             };
             
             return answer;
         };


     public static void main(String[] args){
       
             Main15 main = new Main15();
             Scanner scn = new Scanner(System.in);

             int count = scn.nextInt();
             int[] entryA = new int[count];
             int[] entryB = new int[count];
             for(int i = 0; i < count; i++){
               entryA[i] = scn.nextInt();
             };
             for(int i = 0; i < count; i++){
               entryB[i] = scn.nextInt();
             }
             String[] returnEntry = main.solution(count, entryA, entryB);

             for(String a : returnEntry){

              System.out.print(a +" ");
             }
         };

      

 }


