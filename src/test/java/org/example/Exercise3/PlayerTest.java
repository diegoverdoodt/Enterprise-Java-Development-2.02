package org.example.Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private Player instance = new Player(100,5);

    @DisplayName("TODO ES OK")
    @Test
    public void decrements_GoodData_Works(){
        instance.decrements();
        Assertions.assertEquals(4 , instance.getLives());
        Assertions.assertEquals(100, instance.getHealth());
    }

    @DisplayName("No le quedan vidas")
    @Test
    public void decrements_0lives(){
        Player instance2 = new Player(10,0);
        instance2.setHealth(50);
        Assertions.assertThrows(IllegalArgumentException.class, () -> instance2.decrements());
    }

    @DisplayName("Salud a 100 cuando pierde una vida")
    @Test
    public void decrements_110health(){
        Player instance3 = new Player(10,4);
        instance3.setHealth(50);
        instance3.decrements();
        Assertions.assertEquals(100, instance3.getHealth());
    }

    @DisplayName("Metodo ataque OK")
    @Test
    public void attack_todo_ok(){

        Player instanceA = new Player(10,4);
        Player instanceB = new Player(50, 5);
        instanceA.setHealth(50);
        instanceB.setHealth(70);
        instance.attack(instanceA, instanceB);

        Assertions.assertEquals(60, instanceB.getHealth());
    }

    @DisplayName("Ataque de A mata a B, pero tiene vidas")
    @Test
    public void attack_deA_mata_B_BtieneVidas(){

        Player instanceA = new Player(70,4);
        Player instanceB = new Player(60, 5);
        instanceA.setHealth(50);
        instanceB.setHealth(50);
        instance.attack(instanceA, instanceB);

        Assertions.assertEquals(100, instanceB.getHealth());
        Assertions.assertEquals(4, instanceB.getLives());
    }
    /*
    @DisplayName("Ataque de A mata a B y no tiene vidas")
    @Test
    public void attack_deA_mata_B_BNoTieneVidas(){

        Player instanceA = new Player(70,4);
        Player instanceB = new Player(60, 1);
        instanceA.setHealth(50);
        instanceB.setHealth(50);
        instance.attack(instanceA, instanceB);

        Assertions.assertThrows(IllegalArgumentException.class, () -> instance.attack(instanceA, instanceB));
    }
    */
}
