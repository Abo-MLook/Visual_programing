package basics_oop;

import java.util.List;

public class interface__L9 {

    public static void main(String[] args) {

        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Wolf wolf = new Wolf();

        // You can treat objects by their ROLE types:
        Prey p1 = rabbit; // OK
        Prey p2 = fish;   // OK (Fish is also Prey)
        Predator pr1 = hawk; // OK
        Predator pr2 = fish; // OK (Fish is also Predator)
        Predator pr3 = wolf; // OK
         
        //You can hold any Prey in a List<Prey> and any Predator in a List<Predator>, 
        //even when they’re different classes—and the same object can appear in both lists
        // Polymorphic lists by interface type:
        List<Prey> preys = List.of(rabbit, fish);
        List<Predator> predators = List.of(hawk, fish, wolf);

        System.out.println("All preys flee:");
        for (Prey p : preys) {
            p.flee();
        }

        System.out.println("\nAll predators hunt:");
        for (Predator p : predators) {
            p.hunt();
        }
    }
}

// ===== top-level types in the SAME FILE =====
interface Prey {

    void flee(); // what other class (must have)
}

interface Predator {

    void hunt(); // what other class (must have)
}

class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("*The rabbit is fleeing*");
    }
}

class Hawk implements Predator {

    @Override
    public void hunt() {
        System.out.println("*The hawk is hunting*");
    }
}

class Fish implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("*The fish is hunting*");
    }

    @Override
    public void flee() {
        System.out.println("*The fish is fleeing*");
    }
}

class Wolf implements Predator {

    @Override
    public void hunt() {
        System.out.println("*The wolf is hunting*");
    }
}
