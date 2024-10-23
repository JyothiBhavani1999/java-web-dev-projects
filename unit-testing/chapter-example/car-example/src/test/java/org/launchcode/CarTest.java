package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)

    Car test_car;

    @BeforeEach
    public void createCarObject(){
         test_car = new Car("Tayota", "Prius", 10,20);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testGasTankLevel(){
        assertEquals(10, test_car.getGasTankLevel(),.001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testInitialGasTank(){
        assertFalse(test_car.getGasTankLevel() == 0, "Initial gas should not be zero");

    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

    @Test
    public void testGasTank(){
        assertTrue(test_car.getGasTankLevel() > 0, "gas should be greater than zero.");
    }




}