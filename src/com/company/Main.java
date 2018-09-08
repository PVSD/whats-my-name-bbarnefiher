package com.company;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	Scanner kbReader = new Scanner(System.in);

	System.out.println("What is your first name? ");
	String firstName = kbReader.nextLine();

	System.out.println("What is your last name? ");
	String lastName = kbReader.nextLine();

	System.out.println("Your full name is " + firstName + " " + lastName + ".");
    }
}
