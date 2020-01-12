package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Animal;
import de.thro.inf.prg3.a03.State;

public class SleepingState extends State {

    public SleepingState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Sate sate sate, I have risen from the sleeping! Gimme some food!");
        return new HungryState(animal, animal.getAwake());
    }
}
