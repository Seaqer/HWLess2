package com.sbt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person manIgor = new Person(true,"Igor");
        Person womanLiza = new Person(false,"Liza");
        Person womanElise = new Person(false,"Elise");
        Person manEgor = new Person(true,"Elise");
        manIgor.marry(womanLiza);
        manIgor.marry(womanLiza);
        womanElise.marry(manEgor);
        manIgor.marry(womanElise);
        manEgor.marry(manIgor);
        //commit
    }
}






