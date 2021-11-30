package com.sylvie;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        int i = 0;
        int aprice = 25;
        int bprice = 15;
        int cprice = 10;
        int[] prices = {25, 15, 10};
        System.out.println(prices.length);
        for (i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
            Scanner scanner = new Scanner(System.in);
            int total = 0;
            boolean end = false;
            while (!end) {
                System.out.println("Plaese put your coin 1/5/10 Total:" + total);
                String s = scanner.next();
                int n = Integer.parseInt(s);
                total += n;
                i++;
                switch (s) {
                    case "1":
                    case "5":
                    case "10":
                        n = Integer.parseInt(s);
//                      total = total + n;
                        total += n;
//                      i = i+1;
                        i++;
                        break;
                    case "a":
                    case"b":
                    case"c":
                        System.out.println(s.charAt(0)-97);
                        int index = s.charAt(0)-97;
                        if (total >= prices[index]) {
                            System.out.println("DON!");
                            total -= prices[index];
                            break;
                        } else {
                            System.out.println("BEEP!");
                        }
                        break;
                    default:
                        System.out.println("Answer Wrong!");
                        break;


                }
            }
        }
    }
