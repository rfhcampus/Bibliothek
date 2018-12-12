package com.bibliothek;

import java.util.Scanner;

public class User {

    //Variablen deklarieren

    private String address;
   // private String name;
  //  private boolean locked = false;
    private int userid;
  //  private int lockedInt;


    public void addUser(String name, String street, int postCode, String city, int lockedInt) {

        boolean locked = false;
        if (lockedInt == 1) {
        locked = true; }

        System.out.println("Benutzer " + name + " mit Sperrstatus " + locked + " wurde als Objekt angelegt.");
        System.out.println(name + street + postCode + city + locked);
      // return new User ();
    }

}
