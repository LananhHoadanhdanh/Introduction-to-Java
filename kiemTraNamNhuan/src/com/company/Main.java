package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        System.out.println("Số năm bạn muốn kiểm tra?");

        Scanner scanner = new Scanner(System.in);

        year = scanner.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println("Năm " + year + " là năm nhuận.");
        } else {
            System.out.println("Năm " + year + " không phải là năm nhuận.");
        }
    }
}
