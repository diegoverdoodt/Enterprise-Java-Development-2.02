package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercise1Test {


    private Exercise1 instance = new Exercise1();
    private int num;
    @DisplayName("TODO ES OK")
    @Test
    public void testWriteOdd_GoodData_Works(){
        instance.writeOdd(7);
        int[] arrayResult = {1,3,5,7};
        Assertions.assertArrayEquals(arrayResult , instance.writeOdd(7));
    }

    @DisplayName("El valor es negativo")
    @Test
    public void testWriteOdd_negative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> instance.writeOdd(-3));
    }
}
