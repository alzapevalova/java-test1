package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        //Create an application that:
        //- prints if your user input is a palindrome or not
        //#### Examples:
        //input|output
        //`Amazon`|`no`
        //`Amazama`|`yes`
        //**Note:** Java is case-sensitive by default, and by default will consider, say, `E` to be different from `e`

        Scanner sc = new Scanner(System.in);

            String word = sc.next();


                for (int i = word.length() - 1; 1 >= 0; i--) {


                    System.out.println(word.charAt(i));
                }
    }
}
