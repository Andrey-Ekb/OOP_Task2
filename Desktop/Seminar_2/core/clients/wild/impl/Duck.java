package Seminar_2.core.clients.wild.impl;

import java.time.LocalDate;

import Seminar_2.core.clients.Flyable;
import Seminar_2.core.clients.Runnable;
import Seminar_2.core.clients.Soundable;
import Seminar_2.core.clients.clients.Swimable;
import Seminar_2.core.clients.owners.Owner;
import Seminar_2.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable,Soundable, Swimable {
    public Duck() {
    }

    @Override
    public void getIll(){
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 15 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 5 км/ч");
        return 3;
    }

    @Override
    public void sound(){
        System.out.println(CLASS_NAME + "Кря-Кря: 5 раз");
    }

    @Override
    public int getSwimingSpeed(){
        System.out.println((CLASS_NAME+" плывет со скоростью 1 км/ч"));
        return 2;
    }
}
