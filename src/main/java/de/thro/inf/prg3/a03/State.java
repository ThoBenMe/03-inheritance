package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class State {

    protected static final Logger logger = LogManager.getLogger();

    protected final Animal animal;
    protected int time;
    protected int duration;


    protected State(Animal animal, int duration){
        this.animal = animal;
        this.duration = duration;
    }

    final State tick(){
        if(duration < 0){
            return this;
        }
        if(++time == duration){
            return successor();
        } else {
            logger.info(getClass().getName());
            return this;
        }

    }

    public abstract State successor();

}
