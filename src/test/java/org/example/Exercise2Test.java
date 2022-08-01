package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercise2Test {


    private Exercise2 instance = new Exercise2();

    @DisplayName("TODO ES OK")
    @Test
    public void usedReservedKeyword_GoodData_Works(){
        instance.usedReservedKeyword("Don't break my heart");
        Assertions.assertEquals(true , instance.usedReservedKeyword("Don't break my heart"));
    }

    @DisplayName("Ninguna palabra coincide")
    @Test
    public void usedReservedKeyword_noWordCoincidence(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> instance.usedReservedKeyword("I love to breakdance"));
    }
}