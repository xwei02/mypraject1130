package com.sylvie;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int total = 0;
        boolean end = false;
        while (!end){
            System.out.println("Plaese put your coin 1/5/10 Total:" + total);
            String s = scanner.next();
            switch (s){
                case "1":
                case "5":
                case "10":
                    int n = Integer.parseInt(s);
                    total += n;

            }
        }
    }
}
