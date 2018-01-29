package ClassActivity24_1;

import java.util.Scanner;

public class HelloPerson {
    public static void main(String[] args) {
        Scanner keyBoard=new Scanner(System.in);
        System.out.println("please enter your Full Name");
        String fullName=keyBoard.nextLine();



        String lastName="";


        lastName=fullName.substring(fullName.lastIndexOf(' ')+1, fullName.length());

        System.out.println("hello Mr/Ms: " + lastName);

         }










    }

