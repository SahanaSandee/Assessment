package com.example.britishtimeconvert;

import java.util.Scanner;

import static com.example.britishtimeconvert.TimeConverter.convertToBritishSpokenForm;

public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the time::>");
            String time = sc.next();
            String britishSpokenForm = convertToBritishSpokenForm(time);
            System.out.println("British spoken form of " + time + " is: " + britishSpokenForm);
        }
}
