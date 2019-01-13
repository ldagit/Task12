package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку №1: ");
        String Str1 = in.nextLine();
        System.out.println("Введите строку №2: ");
        String Str2 = in.nextLine();

        int Len1 = Str1.length();
        int Len2 = Str2.length();
        if (Len1 > Len2) {
            System.out.println(Str1);
        }
        else{
            if (Len1 < Len2){
                System.out.println(Str2);
            }
            else {
                System.out.println("Введенные строки равны по длине!");
            }
        }
    }
}