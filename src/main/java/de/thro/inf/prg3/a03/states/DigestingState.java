package de.thro.inf.prg3.a03.states;


import de.thro.inf.prg3.a03.Animal;
import de.thro.inf.prg3.a03.State;

public class DigestingState extends State {

    private final int remainingWakeTime;

    DigestingState(Animal animal, int duration, int remainingWakeTime) {
        super(animal, duration);
        this.remainingWakeTime = remainingWakeTime;
    }

    @Override
    public State successor() {
        logger.info("Well now, I ate buenisimo. Let's play!");
        return new PlayfulState(animal, remainingWakeTime - animal.getDigest());
    }
}
