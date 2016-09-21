package com.springinaction.springidol.Implementation;

import com.springinaction.springidol.Interface.Poem;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Sonnet29 implements Poem {

    private static String LINES = (
                    "Ile cie trzeba cenic, ten tylko sie dowie,\n");

    @Override
    public void recite() {
        for (int i = 0; i < LINES.length(); i++){
            System.out.print(LINES.charAt(i));
        }
    }


}