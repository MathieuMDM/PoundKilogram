package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value in pound:");

        double pound = scanner.nextDouble();

        double kilogram = pound * 0.454;

        System.out.println(pound + " this value in pound is equal to " + kilogram + " kilograms");

    }
}
