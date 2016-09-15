package com.sbt;

public class Main {


    public static void main(String[] args) {
        Person manIgor = new Person(true, "Igor");
        Person womanLiza = new Person(false, "Liza");
        Person womanElise = new Person(false, "Elise");
        Person manEgor = new Person(true, "Elise");

        if (!womanElise.marry(manEgor)) {
            System.out.println("ERROR: !womanElise.marry(manEgor)");
        }

        if (!manIgor.marry(womanLiza)) {
            System.out.println("ERROR: !manIgor.marry(womanLiza)");
        }

        if (manIgor.marry(womanLiza)) {
            System.out.println("ERROR: manIgor.marry(womanLiza)");
        }

        if (!manIgor.marry(womanElise)) {
            System.out.println("ERROR: !manIgor.marry(womanElise)");
        }

        if (manEgor.marry(manIgor)) {
            System.out.println("ERROR: manEgor.marry(manIgor)");
        }
        if (manIgor.marry(null)) {
            System.out.println("ERROR: manIgor.marry(null)");
        }
    }
}






