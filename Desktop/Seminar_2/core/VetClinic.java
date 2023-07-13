package Seminar_2.core;

import java.util.ArrayList;
import java.util.List;

import Seminar_2.core.clients.Animal;
import Seminar_2.core.clients.Animals;
import Seminar_2.core.clients.Human;
import Seminar_2.core.clients.home.impl.Cat;

public class VetClinic {
    private final List<Animals> animals; 
    public VetClinic(Human heaPhysician) {
        this.animals = new ArrayList<>();
    }

    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal a: this.animais)
            if (a instanceof Runnable) runningAnimals.add((Runnable) a);
        return runningAnimals;
    }
    public VetClinic() { this(null); }

    public List<Animal> getAllAnimals() { return this.animals; }

    public List<Swimable> getSwimmingAnimals() {
        List<Swimable> swimmingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Swimable) swimmingAnimals.add((Swimable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

    public List<Soundable> getSpeakingAnimals() {
        List<Soundable> speakingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Soundable) speakingAnimals.add((Soundable) a);

        return speakingAnimals;
    }
    public VetClinic addAnimal(Animal animal) {
        this.animals.add((Animal) animal);
        return this;
    }
}

