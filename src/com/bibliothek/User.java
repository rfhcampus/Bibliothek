package com.bibliothek;

import java.util.Scanner;

public class User {

    //Variablen deklarieren

    private String address;
   // private String name;
  //  private boolean locked = false;
    private int userid;
  //  private int lockedInt;


    public User addUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println ("Bitte den Namen des anzulegenden Benutzers eingeben: ");
        String name = sc.nextLine ();
        System.out.println ("Bitte den initialen Status für diesen Nutzer eingeben (0=freigegeben | 1=gesperrt): ");
        boolean locked = false;
        int lockedInt = sc.nextInt ();
        if (lockedInt == 1) {
        locked = true; }

        System.out.println("Benutzer " + name + " mit Sperrstatus " + locked + " wurde als Objekt angelegt.");

        return new User ();
    }

}
