package org.negah;

import java.util.Scanner;

public abstract class InputHandler {

    String getInputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        System.out.println("baby");
    }
}
