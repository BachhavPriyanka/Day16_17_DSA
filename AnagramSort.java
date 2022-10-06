package day16_17;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string :");
        String str1 = sc.next();
        System.out.println("Enter Second string :");
        String str2 = sc.next();
        isAnagram(str1, str2);
    }

    static void isAnagram(String str1, String str2){

        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();
        if(str1.length() != str2.length()){
            System.out.println("Strings are not anagram");
            return;
        }

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        String strSorted1 = new String(strArray1);
        String strSorted2 = new String(strArray2);

        if(strSorted1.equals(strSorted2))
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are not Anagram");
    }
}
