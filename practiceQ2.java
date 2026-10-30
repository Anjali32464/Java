//Febonacci series

import java.util.Scanner;

/* public class practiceQ2 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = i.nextInt();

        int first = 0,third=0;
        int sec = 1;
        System.out.println(first);
        System.out.println(sec);
        third = first + sec;
        System.out.println(third);
        first = sec;
        sec = third;

        while( third<=x ){
            third = first + sec;
            first = sec;
            sec = third;
            System.out.println(third);

        }
        
    }
    
} */

// nth number of febonacci series

public class practiceQ2{
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int x = y.nextInt();
        int first = 0,third=0;
        int sec = 1;
        third = first + sec;
        first = sec;
        sec = third;
        int num = 3;

        while(num!=x){
            third = first + sec;
            first = sec;
            sec = third;
            num=num+1;
        }

        System.out.println(third);


    }

}
