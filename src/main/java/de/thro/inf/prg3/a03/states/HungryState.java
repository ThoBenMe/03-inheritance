package de.thro.inf.prg3.a03.states;


import de.thro.inf.prg3.a03.Animal;
import de.thro.inf.prg3.a03.State;

public class HungryState extends State {

    protected HungryState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("I've been starving for too long ...");
        return new DeathState(animal, -1);
    }

    public State feed(){
        logger.info("Om nom nom...");
        return new DigestingState(animal, animal.getDigest(), duration - time);
    }

}
