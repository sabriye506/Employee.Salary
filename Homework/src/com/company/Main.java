package com.company;

public class Main {

    public static void main(String[] args) {

        byte grade = 9;

        String firstName = "John";

        String lastName = "Smith";

        String email = "student.j.smith@hsa.org";

        String Gmail = "student.j.smith9@horizoncolumbus.org";

        String onlyFirst = Gmail.substring(0, 8);
        String onlyMail = Gmail.substring(17, 36);
        String Part2 = onlyFirst.concat( firstName.charAt(0) +"." + lastName + grade + onlyMail );

        System.out.println(Part2);
        String greeting = "Hello";
        String PartThree = greeting.concat(" " + lastName);
        System.out.println(PartThree);




    }
}
