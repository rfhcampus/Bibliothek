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
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);

        int i = sc.nextInt ();

        switch (i) {

            case 0:
                break;

            case 1:
                User newUser = new User ();

                System.out.println ("Bitte den vollständigen Namen des anzulegenden Benutzers eingeben: ");
                String name = sc2.nextLine ();

                System.out.println (" ");
                System.out.println ("Erfassung der Anschrift: ");
                System.out.println ("Straße und Hausnummer? ");
                String street = sc2.nextLine ();

                System.out.println ("PLZ? ");
                int postCode  = sc2.nextInt ();

                System.out.println ("Stadt? ");
                String city = sc3.nextLine ();

                System.out.println ("Bitte den initialen Status für diesen Nutzer eingeben (0=freigegeben | 1=gesperrt): ");
                int lockedInt = sc.nextInt ();

                newUser.addUser (name,street,postCode,city,lockedInt);

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
                Book newBook = new Book();
                newBook.addBook ();
              /*  Book.addBook(new Book("Harry Potter und der Orden des Phönix"));
                Book.addBook(new Book("Vom Winde verweht"));
                Book.addBook(new Book("Die Jury"));
                Book.addBook(new Book("Ein Hobbit")); */
                break;

            case 7:
                break;

        }
    }
}
