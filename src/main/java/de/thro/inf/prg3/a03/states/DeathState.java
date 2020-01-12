package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Animal;
import de.thro.inf.prg3.a03.State;

import java.time.Duration;

public class DeathState extends State {

    public DeathState(Animal animal, int duration){
        super(animal, duration);
    }

    @Override
    public State successor() {
        throw new IllegalArgumentException("I'm dead... and i won't resurrect like some mofo zombie!");
    }
}
