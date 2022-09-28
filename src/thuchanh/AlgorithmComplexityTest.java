package thuchanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String inputString = input.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0 ; i < inputString.length() ; i++ ) {
            int ascii = (int)inputString.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0 ; j < 255 ; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất là: " + character + " ,và xuất hiện " + max + " lần.");

        for (int i = 0; i < frequentChar.length ; i++) {
            System.out.println(frequentChar[i]);
        }
    }
}
