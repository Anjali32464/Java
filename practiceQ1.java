//odd even

import java.util.Scanner;


public class practiceQ1 {
    
    public static void main(){

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int y = x.nextInt();

        if( y%2==0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }


    }
}
