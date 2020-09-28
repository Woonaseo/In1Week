
import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

 

public class Baseball {

    

 

    static boolean adjust(int q, int r, int q1, int r1){

       

        boolean result = false;

       

        if(q==r && q1 ==r1){result=true;}

 

        return result;

 

    }

 

    static boolean adjust1(int q, int r, int q1, int r1){

 

        boolean result = false;

 

        if(q==r && q1 != r1){result=true;}

 

        return result;

    }

 

 

    public static void main(String[] args) {

        

 

        Scanner sc = new Scanner(System.in);

        Random rd = new Random();

 

        int a = rd.nextInt(9);

        int b = rd.nextInt(9);

        int c = rd.nextInt(9);

        int q = 0; int r = 0;

        int q1 = 0; int r1 = 0;

        int [] question = {a,b,c};

        

        int count = 0;

        int baseballcount = 0;

        int result = 0;

        int [] answer = new int [3];

        int strike = 0;

        int ball = 0;

        int diff = 0;

        boolean real = true;

        boolean real1 = true;

 

        System.out.println(a+","+b+","+c);

        System.out.println("숫자 야구 게임");

 

        do {

            

            System.out.println("카운트 : "+(++count));

            System.out.print("1번째 숫자 : "); int one = sc.nextInt();

            System.out.print("2번째 숫자 : "); int two = sc.nextInt();

            System.out.print("3번째 숫자 : "); int three = sc.nextInt();

            

            answer[0]=one;answer[1]=two;answer[2]=three;

            

 

            if(one==two && one==three && two==three){System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요."); count--;++diff;}

            else if(question[0]==one && question[1]==two && question[2]==three){System.out.println("Stike : 3 Ball : 0"); break;}

           

            if(diff==0)

                for (int i = 0; i < question.length; i++) {

                    for (int j = 0; j < answer.length; j++) {

                        q = question[i]; r=answer[j]; q1 = i; r1 = j;

                        real = adjust(q, r,q1,r1);

                        real1 = adjust1(q, r, q1, r1);

 

                        if (real==true) {++strike;}

                        if (real1==true){++ball;}

                    }

                }

 

            System.out.printf("Strike : %d Ball : %d",strike,ball);

        

 

            System.out.println();

 

 

        } while (result==0);

        

        System.out.println("잘했어요!");

     

    }

}
