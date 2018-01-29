package ClassActivity24_1;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner keyBoard= new Scanner(System.in);
        System.out.println("Enter your number to calculate its square root");
        double Num=keyBoard.nextDouble();
        if(Num>=0) {
            double SQ = Math.sqrt(Num);
            System.out.println(SQ);
        }
        else
        System.out.println("please enter a positive Numnber");
    }
}
