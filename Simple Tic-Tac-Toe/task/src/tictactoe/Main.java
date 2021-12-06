package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String myInput = scanner.next();
        char[] myCollection = new char[]{
                myInput.charAt(0),
                myInput.charAt(1),
                myInput.charAt(2),
                myInput.charAt(3),
                myInput.charAt(4),
                myInput.charAt(5),
                myInput.charAt(6),
                myInput.charAt(7),
                myInput.charAt(8)};
        printGame(myCollection);
    }

    private static void printGame(char[] myCol) {
        String headerFooter = ("---------");
        String pipe = "|";
        String space = " ";
        System.out.println(headerFooter);
        System.out.println(pipe + space + myCol[0] + space + myCol[1] + space + myCol[2] + space + pipe);
        System.out.println(pipe + space + myCol[3] + space + myCol[4] + space + myCol[5] + space + pipe);
        System.out.println(pipe + space + myCol[6] + space + myCol[7] + space + myCol[8] + space + pipe);
        System.out.println(headerFooter);
    }
}
