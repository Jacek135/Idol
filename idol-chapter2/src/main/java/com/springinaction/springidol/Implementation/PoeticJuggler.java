package com.springinaction.springidol.Implementation;

import com.springinaction.springidol.Exception.PerformanceException;
import com.springinaction.springidol.Interface.Poem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PoeticJuggler extends Juggler{

    @Autowired
    private Poem poem;

    public PoeticJuggler() {
    }

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler (int beanBags, Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    public void perform () throws PerformanceException {
        super.perform();
        System.out.println("While reciting.");
        poem.recite();
    }

}
