package homework2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //ex1();
        ex2_1();
    }

    private static void ex1(){
        String phrase = strInput("Введите строку: ").toLowerCase().replace(" ", "");
        StringBuilder invertPhrase = new StringBuilder();
        int n = phrase.length();
        while (n > 0) {
            invertPhrase.append(phrase.charAt(n-1));
            n--;
        }
        System.out.println(phrase.equals(invertPhrase.toString()));
    }
    private static String strInput(String msg) {
        System.out.printf(msg);
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        return str;
    }
    private static void ex2_1(){
        String word = "Test";
        int repeatNumber = 100;
        StringBuilder repeatWord = new StringBuilder();
        repeatWord = repeatWord.append(word.repeat(repeatNumber));
        write(repeatWord.toString());
    }
    public static void write( String text1) {
        try {
            try (PrintWriter out = new PrintWriter("src/main/java/homework2/text.txt")) {
                out.print(text1);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
