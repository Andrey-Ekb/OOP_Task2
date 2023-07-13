package Seminar_2.core.clients.home;

import Seminar_2.core.clients.Animal;
import Seminar_2.core.clients.Animals;
import Seminar_2.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals {
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public void getIll() {
        throw new UnsupportedOperationException("Unimplemented method 'getIll'");
    }
}
