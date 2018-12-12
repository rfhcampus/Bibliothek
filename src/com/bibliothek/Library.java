package com.bibliothek;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        System.out.println ("Bitte tätigen Sie Ihre Eingabe!");
        System.out.println ("------------------------------------");
        System.out.println ("Taste 1: Benutzer anlegen");
        System.out.println ("Taste 2: Benutzer sperren");
        System.out.println ("Taste 3: Buch ausleihen");
        System.out.println ("Taste 4: Benutzer vormerken");
        System.out.println ("Taste 5: Buch zurück geben");
        System.out.println ("Taste 6: Bestand: Buch einchecken");
        System.out.println ("Taste 7: Bestand: Buch auschecken");
        System.out.println ("------------------------------------");

        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt ();

        switch (i) {

            case 0:
                break;

            case 1:
                User newUser = new User ();
                newUser.addUser ();
                // wie komme ich zurück ins Startmenü?
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                Library.addBook(new Book("Harry Potter und der Orden des Phönix"));
                Library.addBook(new Book("Vom Winde verweht"));
                Library.addBook(new Book("Die Jury"));
                Library.addBook(new Book("Ein Hobbit"));
                break;

            case 7:
                break;

        }
    }
}
