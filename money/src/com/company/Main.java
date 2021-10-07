package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int rate;
	int money;
	Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tỉ giá: ");
        rate = scanner.nextInt();
        System.out.println("Nhập số tiền: ");
        money = scanner.nextInt();
        int result = rate * money;
        System.out.println(money + " $ = " + result + " VND");
    }
}
