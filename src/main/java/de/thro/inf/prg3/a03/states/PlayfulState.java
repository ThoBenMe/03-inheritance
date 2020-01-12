package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Animal;
import de.thro.inf.prg3.a03.State;

public class PlayfulState extends State {

    protected PlayfulState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Playing makes me dizzy... nighty night.");
        return new SleepingState(animal, animal.getSleep());
    }
}
