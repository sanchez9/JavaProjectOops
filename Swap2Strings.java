package octProjectSteph;

public class Swap2Strings {

    public static void main(String[] args) {

        // 1. Write a program to swap 2 strings without a temporary variable?

        String str1 = "Syntax";
        String str2 = "Technology";

        System.out.println("Start");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        str1 = str1+ str2;

        str2 = str1.substring(0, str1.length() - str2.length());

        str1 = str1.substring(str2.length());

        System.out.println("End");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

    }
    //submitted by Stephanie Sanchez
}
