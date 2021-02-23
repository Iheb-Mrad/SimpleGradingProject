package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Enter your grade in order to know if you passed or failed the course : ");

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();


        if (number <= 10 && number >= 6) {
            System.out.println("Congratulation you have passed this course!");

        } else if (number <= 5.5 && number >= 0) {
            System.out.println("You didn't pass this course");
        } else {
            System.out.println("Invalid grade!");
        }
    }
}