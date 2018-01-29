package ClassActivity24_1;


import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("please enter your Number or character to convert:");
        if(input.hasNextInt()) {
            int num = input.nextInt();

            System.out.println("Binary conversion is: "+Integer.toBinaryString(num));
            System.out.println("Hexadecimal conversion is: "+ Integer.toHexString(num));
        }

        else if(input.hasNext()) {
            char myChar = input.next().charAt(0);

            int asciiValue = (int) myChar;
            System.out.println("Binary conversion is: "+Integer.toBinaryString(asciiValue));
            System.out.println("Hexadecimal conversion is: "+Integer.toHexString(asciiValue));


        }

        }
    }

