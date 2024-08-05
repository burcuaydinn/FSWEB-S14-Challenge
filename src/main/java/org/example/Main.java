package org.example;

import org.example.models.DeluxeBurger;
import org.example.models.Hamburger;
import org.example.models.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Normal", 2.86, "Sandwich");

        hamburger.addHamburgerAddition1("Tomato", 1.22);
        hamburger.addHamburgerAddition2("Lettuce", 0.52);
        hamburger.addHamburgerAddition3("Cheese", 1.74);

        hamburger.itemizeHamburger();

        System.out.println("***************");

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 4.32, "Wrap");

        healthyBurger.addHamburgerAddition1("Egg", 4.28);
        healthyBurger.addHealthyAddition1("Lentils", 5.26);

        healthyBurger.itemizeHamburger();

        System.out.println("******************");

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition3("Should not do this", 45.75);

        db.itemizeHamburger();
    }
}
