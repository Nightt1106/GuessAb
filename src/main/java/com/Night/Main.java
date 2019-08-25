package com.Night;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean t = false;
        System.out.println("Hello");
        GuessAb ab = new GuessAb(4);
        System.out.println(ab.secret);
        String s = scanner.next() ;
        System.out.println(ab.check(s));

    }
}
