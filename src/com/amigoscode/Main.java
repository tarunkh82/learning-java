package com.amigoscode;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /*
       asd
        */

        int number = 100;
        String name = "John Point";
        Date date = new Date();
        //LocalDate now = new LocalDate();

        Person alex = new Person("Alex");
        Person meryam= alex;

        System.out.println(alex.name +" " + meryam.name);
        alex.name = "Alexandar";
        System.out.println(alex.name +" " + meryam.name);
        meryam.name="Meryam";
        System.out.println(alex.name +" " + meryam.name);

        System.out.println("hi my first java app");

        String code = new String("code");
        System.out.println(name.contains(code));
        System.out.println(name.equalsIgnoreCase("john point"));

        int [] numbers = {12,12,13,14};
        String [] lastName = {"Khan","Drl","Wal"};
        String [] lastNames ;

        int [] sQuotes = new int[4];
        String [] lNames = new String[4];

        lastNames=lastName.clone();
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(lastName));
        System.out.println(numbers.length);
        System.out.println(lastName.length);
        System.out.println(Arrays.toString(lastNames));

/*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i : numbers) {
            System.out.println(i);
        }
        Arrays.stream(lastNames).forEach(System.out::println);

        for (String pop:lastNames
             ) {
            System.out.println(pop);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name");
        String userName = scanner.nextLine();
        System.out.println("Name is "+ userName);

        System.out.println("whats your age");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("born in " + year);
*/

        char[] letters = {'A','A','B','B','B','D'};
        int count = countOccurrence(letters,'B');
        System.out.println(count);

    }

    public static int countOccurrence(char [] letters, char toSearch)
    {
        int match = 0;
        System.out.println("Method invoked");
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]==toSearch)
                match++;
        }
        return match;
    }

    static class Person{
        String name;

        Person(String name){
            this.name=name;
        }

    }
}
